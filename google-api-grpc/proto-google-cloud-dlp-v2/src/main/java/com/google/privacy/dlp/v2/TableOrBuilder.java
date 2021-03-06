// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

public interface TableOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.Table)
    com.google.protobuf.MessageOrBuilder {

  /** <code>repeated .google.privacy.dlp.v2.FieldId headers = 1;</code> */
  java.util.List<com.google.privacy.dlp.v2.FieldId> getHeadersList();
  /** <code>repeated .google.privacy.dlp.v2.FieldId headers = 1;</code> */
  com.google.privacy.dlp.v2.FieldId getHeaders(int index);
  /** <code>repeated .google.privacy.dlp.v2.FieldId headers = 1;</code> */
  int getHeadersCount();
  /** <code>repeated .google.privacy.dlp.v2.FieldId headers = 1;</code> */
  java.util.List<? extends com.google.privacy.dlp.v2.FieldIdOrBuilder> getHeadersOrBuilderList();
  /** <code>repeated .google.privacy.dlp.v2.FieldId headers = 1;</code> */
  com.google.privacy.dlp.v2.FieldIdOrBuilder getHeadersOrBuilder(int index);

  /** <code>repeated .google.privacy.dlp.v2.Table.Row rows = 2;</code> */
  java.util.List<com.google.privacy.dlp.v2.Table.Row> getRowsList();
  /** <code>repeated .google.privacy.dlp.v2.Table.Row rows = 2;</code> */
  com.google.privacy.dlp.v2.Table.Row getRows(int index);
  /** <code>repeated .google.privacy.dlp.v2.Table.Row rows = 2;</code> */
  int getRowsCount();
  /** <code>repeated .google.privacy.dlp.v2.Table.Row rows = 2;</code> */
  java.util.List<? extends com.google.privacy.dlp.v2.Table.RowOrBuilder> getRowsOrBuilderList();
  /** <code>repeated .google.privacy.dlp.v2.Table.Row rows = 2;</code> */
  com.google.privacy.dlp.v2.Table.RowOrBuilder getRowsOrBuilder(int index);
}
