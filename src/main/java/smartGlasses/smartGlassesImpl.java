// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: smartGlasses.proto

package smartGlasses;

public final class smartGlassesImpl {
  private smartGlassesImpl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartGlasses_sgBooleanRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartGlasses_sgBooleanRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartGlasses_sgBooleanResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartGlasses_sgBooleanResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartGlasses_sgStringRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartGlasses_sgStringRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartGlasses_sgIntRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartGlasses_sgIntRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartGlasses_sgIntResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartGlasses_sgIntResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartGlasses_sgStringResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartGlasses_sgStringResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022smartGlasses.proto\022\014smartGlasses\"#\n\020sg" +
      "BooleanRequest\022\017\n\007boolVal\030\001 \001(\010\"(\n\021sgBoo" +
      "leanResponse\022\023\n\013boolRespVal\030\001 \001(\010\"$\n\017sgS" +
      "tringRequest\022\021\n\tstringVal\030\001 \001(\t\"\036\n\014sgInt" +
      "Request\022\016\n\006intVal\030\001 \001(\005\"\037\n\rsgIntResponse" +
      "\022\016\n\006intVal\030\001 \001(\005\")\n\020sgStringResponse\022\025\n\r" +
      "stringRespVal\030\001 \001(\t2\335\002\n\023smartGlassesServ" +
      "ice\022R\n\rturnOnGlasses\022\036.smartGlasses.sgBo" +
      "oleanRequest\032\037.smartGlasses.sgBooleanRes" +
      "ponse\"\000\022O\n\016setDestination\022\032.smartGlasses" +
      ".sgIntRequest\032\037.smartGlasses.sgBooleanRe" +
      "sponse\"\000\022R\n\014startJourney\022\036.smartGlasses." +
      "sgBooleanRequest\032\036.smartGlasses.sgString" +
      "Response\"\0000\001\022M\n\014distanceLeft\022\032.smartGlas" +
      "ses.sgIntRequest\032\033.smartGlasses.sgIntRes" +
      "ponse\"\000(\0010\001B\"\n\014smartGlassesB\020smartGlasse" +
      "sImplP\001b\006proto3"
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
    internal_static_smartGlasses_sgBooleanRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_smartGlasses_sgBooleanRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartGlasses_sgBooleanRequest_descriptor,
        new java.lang.String[] { "BoolVal", });
    internal_static_smartGlasses_sgBooleanResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_smartGlasses_sgBooleanResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartGlasses_sgBooleanResponse_descriptor,
        new java.lang.String[] { "BoolRespVal", });
    internal_static_smartGlasses_sgStringRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_smartGlasses_sgStringRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartGlasses_sgStringRequest_descriptor,
        new java.lang.String[] { "StringVal", });
    internal_static_smartGlasses_sgIntRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_smartGlasses_sgIntRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartGlasses_sgIntRequest_descriptor,
        new java.lang.String[] { "IntVal", });
    internal_static_smartGlasses_sgIntResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_smartGlasses_sgIntResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartGlasses_sgIntResponse_descriptor,
        new java.lang.String[] { "IntVal", });
    internal_static_smartGlasses_sgStringResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_smartGlasses_sgStringResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartGlasses_sgStringResponse_descriptor,
        new java.lang.String[] { "StringRespVal", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
