// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1beta1/table_spec.proto

package com.google.cloud.datacatalog;

/**
 *
 *
 * <pre>
 * Describes a BigQuery table.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datacatalog.v1beta1.BigQueryTableSpec}
 */
public final class BigQueryTableSpec extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datacatalog.v1beta1.BigQueryTableSpec)
    BigQueryTableSpecOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use BigQueryTableSpec.newBuilder() to construct.
  private BigQueryTableSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BigQueryTableSpec() {
    tableSourceType_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private BigQueryTableSpec(
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
          case 8:
            {
              int rawValue = input.readEnum();

              tableSourceType_ = rawValue;
              break;
            }
          case 18:
            {
              com.google.cloud.datacatalog.ViewSpec.Builder subBuilder = null;
              if (viewSpec_ != null) {
                subBuilder = viewSpec_.toBuilder();
              }
              viewSpec_ =
                  input.readMessage(
                      com.google.cloud.datacatalog.ViewSpec.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(viewSpec_);
                viewSpec_ = subBuilder.buildPartial();
              }

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
    return com.google.cloud.datacatalog.TableSpec
        .internal_static_google_cloud_datacatalog_v1beta1_BigQueryTableSpec_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datacatalog.TableSpec
        .internal_static_google_cloud_datacatalog_v1beta1_BigQueryTableSpec_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datacatalog.BigQueryTableSpec.class,
            com.google.cloud.datacatalog.BigQueryTableSpec.Builder.class);
  }

  public static final int TABLE_SOURCE_TYPE_FIELD_NUMBER = 1;
  private int tableSourceType_;
  /**
   *
   *
   * <pre>
   * The table source type.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.TableSourceType table_source_type = 1;</code>
   */
  public int getTableSourceTypeValue() {
    return tableSourceType_;
  }
  /**
   *
   *
   * <pre>
   * The table source type.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.TableSourceType table_source_type = 1;</code>
   */
  public com.google.cloud.datacatalog.TableSourceType getTableSourceType() {
    @SuppressWarnings("deprecation")
    com.google.cloud.datacatalog.TableSourceType result =
        com.google.cloud.datacatalog.TableSourceType.valueOf(tableSourceType_);
    return result == null ? com.google.cloud.datacatalog.TableSourceType.UNRECOGNIZED : result;
  }

  public static final int VIEW_SPEC_FIELD_NUMBER = 2;
  private com.google.cloud.datacatalog.ViewSpec viewSpec_;
  /**
   *
   *
   * <pre>
   * Table view specification. This field should only be populated if
   * table_source_type is BIGQUERY_VIEW.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.ViewSpec view_spec = 2;</code>
   */
  public boolean hasViewSpec() {
    return viewSpec_ != null;
  }
  /**
   *
   *
   * <pre>
   * Table view specification. This field should only be populated if
   * table_source_type is BIGQUERY_VIEW.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.ViewSpec view_spec = 2;</code>
   */
  public com.google.cloud.datacatalog.ViewSpec getViewSpec() {
    return viewSpec_ == null
        ? com.google.cloud.datacatalog.ViewSpec.getDefaultInstance()
        : viewSpec_;
  }
  /**
   *
   *
   * <pre>
   * Table view specification. This field should only be populated if
   * table_source_type is BIGQUERY_VIEW.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.ViewSpec view_spec = 2;</code>
   */
  public com.google.cloud.datacatalog.ViewSpecOrBuilder getViewSpecOrBuilder() {
    return getViewSpec();
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
    if (tableSourceType_
        != com.google.cloud.datacatalog.TableSourceType.TABLE_SOURCE_TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, tableSourceType_);
    }
    if (viewSpec_ != null) {
      output.writeMessage(2, getViewSpec());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (tableSourceType_
        != com.google.cloud.datacatalog.TableSourceType.TABLE_SOURCE_TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, tableSourceType_);
    }
    if (viewSpec_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getViewSpec());
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
    if (!(obj instanceof com.google.cloud.datacatalog.BigQueryTableSpec)) {
      return super.equals(obj);
    }
    com.google.cloud.datacatalog.BigQueryTableSpec other =
        (com.google.cloud.datacatalog.BigQueryTableSpec) obj;

    if (tableSourceType_ != other.tableSourceType_) return false;
    if (hasViewSpec() != other.hasViewSpec()) return false;
    if (hasViewSpec()) {
      if (!getViewSpec().equals(other.getViewSpec())) return false;
    }
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
    hash = (37 * hash) + TABLE_SOURCE_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + tableSourceType_;
    if (hasViewSpec()) {
      hash = (37 * hash) + VIEW_SPEC_FIELD_NUMBER;
      hash = (53 * hash) + getViewSpec().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datacatalog.BigQueryTableSpec parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.BigQueryTableSpec parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.BigQueryTableSpec parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.BigQueryTableSpec parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.BigQueryTableSpec parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.BigQueryTableSpec parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.BigQueryTableSpec parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.BigQueryTableSpec parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.BigQueryTableSpec parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.BigQueryTableSpec parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.BigQueryTableSpec parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.BigQueryTableSpec parseFrom(
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

  public static Builder newBuilder(com.google.cloud.datacatalog.BigQueryTableSpec prototype) {
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
   * Describes a BigQuery table.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datacatalog.v1beta1.BigQueryTableSpec}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datacatalog.v1beta1.BigQueryTableSpec)
      com.google.cloud.datacatalog.BigQueryTableSpecOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datacatalog.TableSpec
          .internal_static_google_cloud_datacatalog_v1beta1_BigQueryTableSpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datacatalog.TableSpec
          .internal_static_google_cloud_datacatalog_v1beta1_BigQueryTableSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datacatalog.BigQueryTableSpec.class,
              com.google.cloud.datacatalog.BigQueryTableSpec.Builder.class);
    }

    // Construct using com.google.cloud.datacatalog.BigQueryTableSpec.newBuilder()
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
      tableSourceType_ = 0;

      if (viewSpecBuilder_ == null) {
        viewSpec_ = null;
      } else {
        viewSpec_ = null;
        viewSpecBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datacatalog.TableSpec
          .internal_static_google_cloud_datacatalog_v1beta1_BigQueryTableSpec_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.BigQueryTableSpec getDefaultInstanceForType() {
      return com.google.cloud.datacatalog.BigQueryTableSpec.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.BigQueryTableSpec build() {
      com.google.cloud.datacatalog.BigQueryTableSpec result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.BigQueryTableSpec buildPartial() {
      com.google.cloud.datacatalog.BigQueryTableSpec result =
          new com.google.cloud.datacatalog.BigQueryTableSpec(this);
      result.tableSourceType_ = tableSourceType_;
      if (viewSpecBuilder_ == null) {
        result.viewSpec_ = viewSpec_;
      } else {
        result.viewSpec_ = viewSpecBuilder_.build();
      }
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
      if (other instanceof com.google.cloud.datacatalog.BigQueryTableSpec) {
        return mergeFrom((com.google.cloud.datacatalog.BigQueryTableSpec) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datacatalog.BigQueryTableSpec other) {
      if (other == com.google.cloud.datacatalog.BigQueryTableSpec.getDefaultInstance()) return this;
      if (other.tableSourceType_ != 0) {
        setTableSourceTypeValue(other.getTableSourceTypeValue());
      }
      if (other.hasViewSpec()) {
        mergeViewSpec(other.getViewSpec());
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
      com.google.cloud.datacatalog.BigQueryTableSpec parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.datacatalog.BigQueryTableSpec) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int tableSourceType_ = 0;
    /**
     *
     *
     * <pre>
     * The table source type.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.TableSourceType table_source_type = 1;</code>
     */
    public int getTableSourceTypeValue() {
      return tableSourceType_;
    }
    /**
     *
     *
     * <pre>
     * The table source type.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.TableSourceType table_source_type = 1;</code>
     */
    public Builder setTableSourceTypeValue(int value) {
      tableSourceType_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The table source type.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.TableSourceType table_source_type = 1;</code>
     */
    public com.google.cloud.datacatalog.TableSourceType getTableSourceType() {
      @SuppressWarnings("deprecation")
      com.google.cloud.datacatalog.TableSourceType result =
          com.google.cloud.datacatalog.TableSourceType.valueOf(tableSourceType_);
      return result == null ? com.google.cloud.datacatalog.TableSourceType.UNRECOGNIZED : result;
    }
    /**
     *
     *
     * <pre>
     * The table source type.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.TableSourceType table_source_type = 1;</code>
     */
    public Builder setTableSourceType(com.google.cloud.datacatalog.TableSourceType value) {
      if (value == null) {
        throw new NullPointerException();
      }

      tableSourceType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The table source type.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.TableSourceType table_source_type = 1;</code>
     */
    public Builder clearTableSourceType() {

      tableSourceType_ = 0;
      onChanged();
      return this;
    }

    private com.google.cloud.datacatalog.ViewSpec viewSpec_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datacatalog.ViewSpec,
            com.google.cloud.datacatalog.ViewSpec.Builder,
            com.google.cloud.datacatalog.ViewSpecOrBuilder>
        viewSpecBuilder_;
    /**
     *
     *
     * <pre>
     * Table view specification. This field should only be populated if
     * table_source_type is BIGQUERY_VIEW.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.ViewSpec view_spec = 2;</code>
     */
    public boolean hasViewSpec() {
      return viewSpecBuilder_ != null || viewSpec_ != null;
    }
    /**
     *
     *
     * <pre>
     * Table view specification. This field should only be populated if
     * table_source_type is BIGQUERY_VIEW.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.ViewSpec view_spec = 2;</code>
     */
    public com.google.cloud.datacatalog.ViewSpec getViewSpec() {
      if (viewSpecBuilder_ == null) {
        return viewSpec_ == null
            ? com.google.cloud.datacatalog.ViewSpec.getDefaultInstance()
            : viewSpec_;
      } else {
        return viewSpecBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Table view specification. This field should only be populated if
     * table_source_type is BIGQUERY_VIEW.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.ViewSpec view_spec = 2;</code>
     */
    public Builder setViewSpec(com.google.cloud.datacatalog.ViewSpec value) {
      if (viewSpecBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        viewSpec_ = value;
        onChanged();
      } else {
        viewSpecBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Table view specification. This field should only be populated if
     * table_source_type is BIGQUERY_VIEW.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.ViewSpec view_spec = 2;</code>
     */
    public Builder setViewSpec(com.google.cloud.datacatalog.ViewSpec.Builder builderForValue) {
      if (viewSpecBuilder_ == null) {
        viewSpec_ = builderForValue.build();
        onChanged();
      } else {
        viewSpecBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Table view specification. This field should only be populated if
     * table_source_type is BIGQUERY_VIEW.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.ViewSpec view_spec = 2;</code>
     */
    public Builder mergeViewSpec(com.google.cloud.datacatalog.ViewSpec value) {
      if (viewSpecBuilder_ == null) {
        if (viewSpec_ != null) {
          viewSpec_ =
              com.google.cloud.datacatalog.ViewSpec.newBuilder(viewSpec_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          viewSpec_ = value;
        }
        onChanged();
      } else {
        viewSpecBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Table view specification. This field should only be populated if
     * table_source_type is BIGQUERY_VIEW.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.ViewSpec view_spec = 2;</code>
     */
    public Builder clearViewSpec() {
      if (viewSpecBuilder_ == null) {
        viewSpec_ = null;
        onChanged();
      } else {
        viewSpec_ = null;
        viewSpecBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Table view specification. This field should only be populated if
     * table_source_type is BIGQUERY_VIEW.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.ViewSpec view_spec = 2;</code>
     */
    public com.google.cloud.datacatalog.ViewSpec.Builder getViewSpecBuilder() {

      onChanged();
      return getViewSpecFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Table view specification. This field should only be populated if
     * table_source_type is BIGQUERY_VIEW.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.ViewSpec view_spec = 2;</code>
     */
    public com.google.cloud.datacatalog.ViewSpecOrBuilder getViewSpecOrBuilder() {
      if (viewSpecBuilder_ != null) {
        return viewSpecBuilder_.getMessageOrBuilder();
      } else {
        return viewSpec_ == null
            ? com.google.cloud.datacatalog.ViewSpec.getDefaultInstance()
            : viewSpec_;
      }
    }
    /**
     *
     *
     * <pre>
     * Table view specification. This field should only be populated if
     * table_source_type is BIGQUERY_VIEW.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.ViewSpec view_spec = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datacatalog.ViewSpec,
            com.google.cloud.datacatalog.ViewSpec.Builder,
            com.google.cloud.datacatalog.ViewSpecOrBuilder>
        getViewSpecFieldBuilder() {
      if (viewSpecBuilder_ == null) {
        viewSpecBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.datacatalog.ViewSpec,
                com.google.cloud.datacatalog.ViewSpec.Builder,
                com.google.cloud.datacatalog.ViewSpecOrBuilder>(
                getViewSpec(), getParentForChildren(), isClean());
        viewSpec_ = null;
      }
      return viewSpecBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.datacatalog.v1beta1.BigQueryTableSpec)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datacatalog.v1beta1.BigQueryTableSpec)
  private static final com.google.cloud.datacatalog.BigQueryTableSpec DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datacatalog.BigQueryTableSpec();
  }

  public static com.google.cloud.datacatalog.BigQueryTableSpec getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BigQueryTableSpec> PARSER =
      new com.google.protobuf.AbstractParser<BigQueryTableSpec>() {
        @java.lang.Override
        public BigQueryTableSpec parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new BigQueryTableSpec(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<BigQueryTableSpec> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BigQueryTableSpec> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datacatalog.BigQueryTableSpec getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
