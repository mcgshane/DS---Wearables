// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: smartWatch.proto

package smartWatch;

public final class smartWatchImpl {
  private smartWatchImpl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartWatch_BooleanRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartWatch_BooleanRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartWatch_BooleanResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartWatch_BooleanResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartWatch_StringRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartWatch_StringRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartWatch_StringResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartWatch_StringResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartWatch_IntRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartWatch_IntRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020smartWatch.proto\022\nsmartWatch\"#\n\016Boolea" +
      "nRequest\022\021\n\tboolValue\030\001 \001(\010\"&\n\017BooleanRe" +
      "sponse\022\023\n\013boolRespVal\030\001 \001(\010\"\"\n\rStringReq" +
      "uest\022\021\n\tstringVal\030\001 \001(\t\"\'\n\016StringRespons" +
      "e\022\025\n\rstringRespVal\030\001 \001(\t\"\036\n\nIntRequest\022\020" +
      "\n\010intValue\030\001 \001(\0052\373\002\n\021smartWatchService\022I" +
      "\n\014turnOnSwitch\022\032.smartWatch.BooleanReque" +
      "st\032\033.smartWatch.BooleanResponse\"\000\022@\n\010set" +
      "Timer\022\026.smartWatch.IntRequest\032\032.smartWat" +
      "ch.StringResponse\"\000\022G\n\nstartTimer\022\032.smar" +
      "tWatch.BooleanRequest\032\033.smartWatch.Boole" +
      "anResponse\"\000\022G\n\npauseTimer\022\032.smartWatch." +
      "BooleanRequest\032\033.smartWatch.BooleanRespo" +
      "nse\"\000\022G\n\nresetTimer\022\032.smartWatch.Boolean" +
      "Request\032\033.smartWatch.BooleanResponse\"\000B\036" +
      "\n\nsmartWatchB\016smartWatchImplP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_smartWatch_BooleanRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_smartWatch_BooleanRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartWatch_BooleanRequest_descriptor,
        new java.lang.String[] { "BoolValue", });
    internal_static_smartWatch_BooleanResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_smartWatch_BooleanResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartWatch_BooleanResponse_descriptor,
        new java.lang.String[] { "BoolRespVal", });
    internal_static_smartWatch_StringRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_smartWatch_StringRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartWatch_StringRequest_descriptor,
        new java.lang.String[] { "StringVal", });
    internal_static_smartWatch_StringResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_smartWatch_StringResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartWatch_StringResponse_descriptor,
        new java.lang.String[] { "StringRespVal", });
    internal_static_smartWatch_IntRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_smartWatch_IntRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartWatch_IntRequest_descriptor,
        new java.lang.String[] { "IntValue", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
