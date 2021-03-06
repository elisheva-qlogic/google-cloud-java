// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/application_service.proto

package com.google.cloud.talent.v4beta1;

public interface GetApplicationRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4beta1.GetApplicationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required.
   * The resource name of the application to be retrieved.
   * The format is
   * "projects/{project_id}/tenants/{tenant_id}/profiles/{profile_id}/applications/{application_id}",
   * for example,
   * "projects/test-project/tenants/test-tenant/profiles/test-profile/applications/test-application".
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required.
   * The resource name of the application to be retrieved.
   * The format is
   * "projects/{project_id}/tenants/{tenant_id}/profiles/{profile_id}/applications/{application_id}",
   * for example,
   * "projects/test-project/tenants/test-tenant/profiles/test-profile/applications/test-application".
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString getNameBytes();
}
