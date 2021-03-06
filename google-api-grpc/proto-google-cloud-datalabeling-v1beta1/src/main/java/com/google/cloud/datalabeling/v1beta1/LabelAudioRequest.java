// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datalabeling/v1beta1/data_labeling_service.proto

package com.google.cloud.datalabeling.v1beta1;

/**
 *
 *
 * <pre>
 * Request message for LabelAudio.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datalabeling.v1beta1.LabelAudioRequest}
 */
public final class LabelAudioRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datalabeling.v1beta1.LabelAudioRequest)
    LabelAudioRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use LabelAudioRequest.newBuilder() to construct.
  private LabelAudioRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private LabelAudioRequest() {
    parent_ = "";
    feature_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private LabelAudioRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              parent_ = s;
              break;
            }
          case 18:
            {
              com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig.Builder subBuilder = null;
              if (basicConfig_ != null) {
                subBuilder = basicConfig_.toBuilder();
              }
              basicConfig_ =
                  input.readMessage(
                      com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(basicConfig_);
                basicConfig_ = subBuilder.buildPartial();
              }

              break;
            }
          case 24:
            {
              int rawValue = input.readEnum();

              feature_ = rawValue;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.datalabeling.v1beta1.DataLabelingServiceOuterClass
        .internal_static_google_cloud_datalabeling_v1beta1_LabelAudioRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datalabeling.v1beta1.DataLabelingServiceOuterClass
        .internal_static_google_cloud_datalabeling_v1beta1_LabelAudioRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datalabeling.v1beta1.LabelAudioRequest.class,
            com.google.cloud.datalabeling.v1beta1.LabelAudioRequest.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Audio labeling task feature.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.datalabeling.v1beta1.LabelAudioRequest.Feature}
   */
  public enum Feature implements com.google.protobuf.ProtocolMessageEnum {
    /** <code>FEATURE_UNSPECIFIED = 0;</code> */
    FEATURE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Transcribe the audios into text.
     * </pre>
     *
     * <code>AUDIO_TRANSCRIPTION = 1;</code>
     */
    AUDIO_TRANSCRIPTION(1),
    UNRECOGNIZED(-1),
    ;

    /** <code>FEATURE_UNSPECIFIED = 0;</code> */
    public static final int FEATURE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Transcribe the audios into text.
     * </pre>
     *
     * <code>AUDIO_TRANSCRIPTION = 1;</code>
     */
    public static final int AUDIO_TRANSCRIPTION_VALUE = 1;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /** @deprecated Use {@link #forNumber(int)} instead. */
    @java.lang.Deprecated
    public static Feature valueOf(int value) {
      return forNumber(value);
    }

    public static Feature forNumber(int value) {
      switch (value) {
        case 0:
          return FEATURE_UNSPECIFIED;
        case 1:
          return AUDIO_TRANSCRIPTION;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Feature> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<Feature> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Feature>() {
          public Feature findValueByNumber(int number) {
            return Feature.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.cloud.datalabeling.v1beta1.LabelAudioRequest.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final Feature[] VALUES = values();

    public static Feature valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Feature(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.datalabeling.v1beta1.LabelAudioRequest.Feature)
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * Required. Name of the dataset to request labeling task, format:
   * projects/{project_id}/datasets/{dataset_id}
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Name of the dataset to request labeling task, format:
   * projects/{project_id}/datasets/{dataset_id}
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BASIC_CONFIG_FIELD_NUMBER = 2;
  private com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig basicConfig_;
  /**
   *
   *
   * <pre>
   * Required. Basic human annotation config.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig basic_config = 2;</code>
   */
  public boolean hasBasicConfig() {
    return basicConfig_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. Basic human annotation config.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig basic_config = 2;</code>
   */
  public com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig getBasicConfig() {
    return basicConfig_ == null
        ? com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig.getDefaultInstance()
        : basicConfig_;
  }
  /**
   *
   *
   * <pre>
   * Required. Basic human annotation config.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig basic_config = 2;</code>
   */
  public com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfigOrBuilder
      getBasicConfigOrBuilder() {
    return getBasicConfig();
  }

  public static final int FEATURE_FIELD_NUMBER = 3;
  private int feature_;
  /**
   *
   *
   * <pre>
   * Required. The type of audio labeling task.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.LabelAudioRequest.Feature feature = 3;</code>
   */
  public int getFeatureValue() {
    return feature_;
  }
  /**
   *
   *
   * <pre>
   * Required. The type of audio labeling task.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.LabelAudioRequest.Feature feature = 3;</code>
   */
  public com.google.cloud.datalabeling.v1beta1.LabelAudioRequest.Feature getFeature() {
    @SuppressWarnings("deprecation")
    com.google.cloud.datalabeling.v1beta1.LabelAudioRequest.Feature result =
        com.google.cloud.datalabeling.v1beta1.LabelAudioRequest.Feature.valueOf(feature_);
    return result == null
        ? com.google.cloud.datalabeling.v1beta1.LabelAudioRequest.Feature.UNRECOGNIZED
        : result;
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!getParentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (basicConfig_ != null) {
      output.writeMessage(2, getBasicConfig());
    }
    if (feature_
        != com.google.cloud.datalabeling.v1beta1.LabelAudioRequest.Feature.FEATURE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(3, feature_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getParentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (basicConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getBasicConfig());
    }
    if (feature_
        != com.google.cloud.datalabeling.v1beta1.LabelAudioRequest.Feature.FEATURE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(3, feature_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.datalabeling.v1beta1.LabelAudioRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.datalabeling.v1beta1.LabelAudioRequest other =
        (com.google.cloud.datalabeling.v1beta1.LabelAudioRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasBasicConfig() != other.hasBasicConfig()) return false;
    if (hasBasicConfig()) {
      if (!getBasicConfig().equals(other.getBasicConfig())) return false;
    }
    if (feature_ != other.feature_) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasBasicConfig()) {
      hash = (37 * hash) + BASIC_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getBasicConfig().hashCode();
    }
    hash = (37 * hash) + FEATURE_FIELD_NUMBER;
    hash = (53 * hash) + feature_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datalabeling.v1beta1.LabelAudioRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datalabeling.v1beta1.LabelAudioRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.LabelAudioRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datalabeling.v1beta1.LabelAudioRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.LabelAudioRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datalabeling.v1beta1.LabelAudioRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.LabelAudioRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.LabelAudioRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.LabelAudioRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.LabelAudioRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.LabelAudioRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.LabelAudioRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.datalabeling.v1beta1.LabelAudioRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Request message for LabelAudio.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datalabeling.v1beta1.LabelAudioRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datalabeling.v1beta1.LabelAudioRequest)
      com.google.cloud.datalabeling.v1beta1.LabelAudioRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datalabeling.v1beta1.DataLabelingServiceOuterClass
          .internal_static_google_cloud_datalabeling_v1beta1_LabelAudioRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datalabeling.v1beta1.DataLabelingServiceOuterClass
          .internal_static_google_cloud_datalabeling_v1beta1_LabelAudioRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datalabeling.v1beta1.LabelAudioRequest.class,
              com.google.cloud.datalabeling.v1beta1.LabelAudioRequest.Builder.class);
    }

    // Construct using com.google.cloud.datalabeling.v1beta1.LabelAudioRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      parent_ = "";

      if (basicConfigBuilder_ == null) {
        basicConfig_ = null;
      } else {
        basicConfig_ = null;
        basicConfigBuilder_ = null;
      }
      feature_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datalabeling.v1beta1.DataLabelingServiceOuterClass
          .internal_static_google_cloud_datalabeling_v1beta1_LabelAudioRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.LabelAudioRequest getDefaultInstanceForType() {
      return com.google.cloud.datalabeling.v1beta1.LabelAudioRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.LabelAudioRequest build() {
      com.google.cloud.datalabeling.v1beta1.LabelAudioRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.LabelAudioRequest buildPartial() {
      com.google.cloud.datalabeling.v1beta1.LabelAudioRequest result =
          new com.google.cloud.datalabeling.v1beta1.LabelAudioRequest(this);
      result.parent_ = parent_;
      if (basicConfigBuilder_ == null) {
        result.basicConfig_ = basicConfig_;
      } else {
        result.basicConfig_ = basicConfigBuilder_.build();
      }
      result.feature_ = feature_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.datalabeling.v1beta1.LabelAudioRequest) {
        return mergeFrom((com.google.cloud.datalabeling.v1beta1.LabelAudioRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datalabeling.v1beta1.LabelAudioRequest other) {
      if (other == com.google.cloud.datalabeling.v1beta1.LabelAudioRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasBasicConfig()) {
        mergeBasicConfig(other.getBasicConfig());
      }
      if (other.feature_ != 0) {
        setFeatureValue(other.getFeatureValue());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.datalabeling.v1beta1.LabelAudioRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.datalabeling.v1beta1.LabelAudioRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. Name of the dataset to request labeling task, format:
     * projects/{project_id}/datasets/{dataset_id}
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Name of the dataset to request labeling task, format:
     * projects/{project_id}/datasets/{dataset_id}
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Name of the dataset to request labeling task, format:
     * projects/{project_id}/datasets/{dataset_id}
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      parent_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Name of the dataset to request labeling task, format:
     * projects/{project_id}/datasets/{dataset_id}
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public Builder clearParent() {

      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Name of the dataset to request labeling task, format:
     * projects/{project_id}/datasets/{dataset_id}
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      parent_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig basicConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig,
            com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig.Builder,
            com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfigOrBuilder>
        basicConfigBuilder_;
    /**
     *
     *
     * <pre>
     * Required. Basic human annotation config.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig basic_config = 2;</code>
     */
    public boolean hasBasicConfig() {
      return basicConfigBuilder_ != null || basicConfig_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. Basic human annotation config.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig basic_config = 2;</code>
     */
    public com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig getBasicConfig() {
      if (basicConfigBuilder_ == null) {
        return basicConfig_ == null
            ? com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig.getDefaultInstance()
            : basicConfig_;
      } else {
        return basicConfigBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Basic human annotation config.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig basic_config = 2;</code>
     */
    public Builder setBasicConfig(
        com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig value) {
      if (basicConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        basicConfig_ = value;
        onChanged();
      } else {
        basicConfigBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Basic human annotation config.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig basic_config = 2;</code>
     */
    public Builder setBasicConfig(
        com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig.Builder builderForValue) {
      if (basicConfigBuilder_ == null) {
        basicConfig_ = builderForValue.build();
        onChanged();
      } else {
        basicConfigBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Basic human annotation config.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig basic_config = 2;</code>
     */
    public Builder mergeBasicConfig(
        com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig value) {
      if (basicConfigBuilder_ == null) {
        if (basicConfig_ != null) {
          basicConfig_ =
              com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig.newBuilder(basicConfig_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          basicConfig_ = value;
        }
        onChanged();
      } else {
        basicConfigBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Basic human annotation config.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig basic_config = 2;</code>
     */
    public Builder clearBasicConfig() {
      if (basicConfigBuilder_ == null) {
        basicConfig_ = null;
        onChanged();
      } else {
        basicConfig_ = null;
        basicConfigBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Basic human annotation config.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig basic_config = 2;</code>
     */
    public com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig.Builder
        getBasicConfigBuilder() {

      onChanged();
      return getBasicConfigFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. Basic human annotation config.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig basic_config = 2;</code>
     */
    public com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfigOrBuilder
        getBasicConfigOrBuilder() {
      if (basicConfigBuilder_ != null) {
        return basicConfigBuilder_.getMessageOrBuilder();
      } else {
        return basicConfig_ == null
            ? com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig.getDefaultInstance()
            : basicConfig_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Basic human annotation config.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig basic_config = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig,
            com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig.Builder,
            com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfigOrBuilder>
        getBasicConfigFieldBuilder() {
      if (basicConfigBuilder_ == null) {
        basicConfigBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig,
                com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig.Builder,
                com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfigOrBuilder>(
                getBasicConfig(), getParentForChildren(), isClean());
        basicConfig_ = null;
      }
      return basicConfigBuilder_;
    }

    private int feature_ = 0;
    /**
     *
     *
     * <pre>
     * Required. The type of audio labeling task.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.LabelAudioRequest.Feature feature = 3;</code>
     */
    public int getFeatureValue() {
      return feature_;
    }
    /**
     *
     *
     * <pre>
     * Required. The type of audio labeling task.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.LabelAudioRequest.Feature feature = 3;</code>
     */
    public Builder setFeatureValue(int value) {
      feature_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The type of audio labeling task.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.LabelAudioRequest.Feature feature = 3;</code>
     */
    public com.google.cloud.datalabeling.v1beta1.LabelAudioRequest.Feature getFeature() {
      @SuppressWarnings("deprecation")
      com.google.cloud.datalabeling.v1beta1.LabelAudioRequest.Feature result =
          com.google.cloud.datalabeling.v1beta1.LabelAudioRequest.Feature.valueOf(feature_);
      return result == null
          ? com.google.cloud.datalabeling.v1beta1.LabelAudioRequest.Feature.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Required. The type of audio labeling task.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.LabelAudioRequest.Feature feature = 3;</code>
     */
    public Builder setFeature(
        com.google.cloud.datalabeling.v1beta1.LabelAudioRequest.Feature value) {
      if (value == null) {
        throw new NullPointerException();
      }

      feature_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The type of audio labeling task.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.LabelAudioRequest.Feature feature = 3;</code>
     */
    public Builder clearFeature() {

      feature_ = 0;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.datalabeling.v1beta1.LabelAudioRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datalabeling.v1beta1.LabelAudioRequest)
  private static final com.google.cloud.datalabeling.v1beta1.LabelAudioRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datalabeling.v1beta1.LabelAudioRequest();
  }

  public static com.google.cloud.datalabeling.v1beta1.LabelAudioRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LabelAudioRequest> PARSER =
      new com.google.protobuf.AbstractParser<LabelAudioRequest>() {
        @java.lang.Override
        public LabelAudioRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new LabelAudioRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<LabelAudioRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LabelAudioRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datalabeling.v1beta1.LabelAudioRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
