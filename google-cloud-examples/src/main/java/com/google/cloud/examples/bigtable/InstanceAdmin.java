/*
 * Copyright 2018 Google LLC.  All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.examples.bigtable;

import com.google.api.gax.rpc.AlreadyExistsException;
import com.google.api.gax.rpc.NotFoundException;
import com.google.bigtable.admin.v2.ProjectName;
import com.google.cloud.bigtable.admin.v2.BigtableInstanceAdminClient;
import com.google.cloud.bigtable.admin.v2.BigtableInstanceAdminSettings;
import com.google.cloud.bigtable.admin.v2.models.Cluster;
import com.google.cloud.bigtable.admin.v2.models.CreateClusterRequest;
import com.google.cloud.bigtable.admin.v2.models.CreateInstanceRequest;
import com.google.cloud.bigtable.admin.v2.models.Instance;
import com.google.cloud.bigtable.admin.v2.models.Instance.Type;
import com.google.cloud.bigtable.admin.v2.models.PartialListInstancesException;
import com.google.cloud.bigtable.admin.v2.models.StorageType;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class InstanceAdmin {

  private static final String SECOND_CLUSTER = "cluster" + System.currentTimeMillis();
  private final String clusterId;
  private final String instanceId;
  private final BigtableInstanceAdminClient adminClient;

  public static void main(String[] args) throws IOException {

    if (args.length != 1) {
      System.out.println("Missing required project id");
      return;
    }
    String projectId = args[0];

    InstanceAdmin instanceAdmin = new InstanceAdmin(projectId, "ssd-instance", "ssd-cluster");
    instanceAdmin.run();
  }

  public InstanceAdmin(String projectId, String instanceId, String clusterId) throws IOException {
    this.instanceId = instanceId;
    this.clusterId = clusterId;

    // [START connecting_to_bigtable]
    // Create the settings to configure a bigtable instance admin client
    BigtableInstanceAdminSettings instanceAdminSettings =
        BigtableInstanceAdminSettings.newBuilder()
            .setProjectName(ProjectName.of(projectId))
            .build();

    // Create bigtable instance admin client
    adminClient = BigtableInstanceAdminClient.create(instanceAdminSettings);
    // [END connecting_to_bigtable]
  }

  public void run() {
    createProdInstance();
    listInstances();
    getInstance();
    listClusters();
    addCluster();
    deleteCluster();
    deleteInstance();
    adminClient.close();
  }

  public void createProdInstance() {
    // Check if instance exists, create instance if does not exists
    if (!adminClient.exists(instanceId)) {
      System.out.println("Instance does not exist, creating a PRODUCTION instance");
      // [START bigtable_create_prod_instance]
      // Create a Production Instance with the ID "ssd-instance"
      // cluster id "ssd-cluster", 3 nodes and location us-central1-f
      CreateInstanceRequest createInstanceRequest =
          CreateInstanceRequest.of(instanceId)
              .addCluster(clusterId, "us-central1-f", 3, StorageType.SSD)
              .setType(Type.PRODUCTION)
              .addLabel("example", "instance_admin");
      // Create production instance with given request
      try {
        Instance instance = adminClient.createInstance(createInstanceRequest);
        System.out.printf("PRODUCTION type instance %s created successfully%n", instance.getId());
      } catch (AlreadyExistsException e) {
        System.err.println("Failed to create instance, already exists: " + e.getMessage());
        System.exit(0);
      }
      // [END bigtable_create_prod_instance]
    }
  }

  public void listInstances() {
    System.out.println("\nListing Instances");
    // [START bigtable_list_instances]
    try {
      List<Instance> instances = adminClient.listInstances();
      for (Instance instance : instances) {
        System.out.println(instance.getId());
      }
    } catch (PartialListInstancesException e) {
      System.out.println("Failed to list instances: " + e.getMessage());
      System.out.println("The following zones are unavailable: " + e.getUnavailableZones());
      System.out.println("But the following instances are reachable: " + e.getInstances());
    }
    // [END bigtable_list_instances]
  }

  public Instance getInstance() {
    System.out.println("\nGet Instance");
    // [START bigtable_get_instance]
    Instance instance = null;
    try {
      instance = adminClient.getInstance(instanceId);
      System.out.println("Instance ID: " + instance.getId());
      System.out.println("Display Name: " + instance.getDisplayName());
      System.out.print("Labels: ");
      Map<String, String> labels = instance.getLabels();
      for (String key : labels.keySet()) {
        System.out.printf("%s - %s", key, labels.get(key));
      }
      System.out.println("\nState: " + instance.getState());
      System.out.println("Type: " + instance.getType());
    } catch (NotFoundException e) {
      System.err.println("Failed to get non-existent instance: " + e.getMessage());
    }
    // [END bigtable_get_instance]
    return instance;
  }

  public void listClusters() {
    System.out.println("\nListing Clusters");
    // [START bigtable_get_clusters]
    try {
      List<Cluster> clusters = adminClient.listClusters(instanceId);
      for (Cluster cluster : clusters) {
        System.out.println(cluster.getId());
      }
    } catch (NotFoundException e) {
      System.err.println("Failed to list clusters from a non-existent instance: " + e.getMessage());
    }
    // [END bigtable_get_clusters]
  }

  public void deleteInstance() {
    System.out.println("\nDeleting Instance");
    // [START bigtable_delete_instance]
    try {
      adminClient.deleteInstance(instanceId);
      System.out.println("Instance deleted: " + instanceId);
    } catch (NotFoundException e) {
      System.err.println("Failed to delete non-existent instance: " + e.getMessage());
    }
    // [END bigtable_delete_instance]
  }

  public void addCluster() {
    System.out.printf("%nAdding cluster %s to instance: %s%n", SECOND_CLUSTER, instanceId);
    // [START bigtable_create_cluster]
    try {
      adminClient.createCluster(
          CreateClusterRequest.of(instanceId, SECOND_CLUSTER)
              .setZone("us-central1-c")
              .setServeNodes(3)
              .setStorageType(StorageType.SSD));
      System.out.printf("Cluster: %s created successfully%n", SECOND_CLUSTER);
    } catch (AlreadyExistsException e) {
      System.err.println("Failed to add cluster, already exists: " + e.getMessage());
    }
    // [END bigtable_create_cluster]
  }

  public void deleteCluster() {
    System.out.printf("%nDeleting cluster %s from instance: %s%n", SECOND_CLUSTER, instanceId);
    // [START bigtable_delete_cluster]
    try {
      adminClient.deleteCluster(instanceId, SECOND_CLUSTER);
      adminClient.listClusters(instanceId);
      System.out.printf("Cluster: %s deleted successfully%n", SECOND_CLUSTER);
    } catch (NotFoundException e) {
      System.err.println("Failed to delete a non-existent cluster: " + e.getMessage());
    }
    // [END bigtable_delete_cluster]
  }
}
