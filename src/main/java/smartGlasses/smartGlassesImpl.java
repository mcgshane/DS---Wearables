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
    internal_static_smartGlasses_BooleanRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartGlasses_BooleanRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartGlasses_BooleanResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartGlasses_BooleanResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartGlasses_StringRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartGlasses_StringRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartGlasses_StringResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartGlasses_StringResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022smartGlasses.proto\022\014smartGlasses\"!\n\016Bo" +
      "oleanRequest\022\017\n\007boolVal\030\001 \001(\010\"&\n\017Boolean" +
      "Response\022\023\n\013boolRespVal\030\001 \001(\010\"\"\n\rStringR" +
      "equest\022\021\n\tstringVal\030\001 \001(\t\"\'\n\016StringRespo" +
      "nse\022\025\n\rstringRespVal\030\001 \001(\t2\322\002\n\023smartGlas" +
      "sesService\022M\n\014turnOnSwitch\022\034.smartGlasse" +
      "s.BooleanRequest\032\035.smartGlasses.BooleanR" +
      "esponse\"\000\022M\n\016setDestination\022\033.smartGlass" +
      "es.StringRequest\032\034.smartGlasses.StringRe" +
      "sponse\"\000\022L\n\014startJourney\022\034.smartGlasses." +
      "BooleanRequest\032\034.smartGlasses.StringResp" +
      "onse\"\000\022O\n\020finalDestination\022\033.smartGlasse" +
      "s.StringRequest\032\034.smartGlasses.StringRes" +
      "ponse\"\000B\"\n\014smartGlassesB\020smartGlassesImp" +
      "lP\001b\006proto3"
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
    internal_static_smartGlasses_BooleanRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_smartGlasses_BooleanRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartGlasses_BooleanRequest_descriptor,
        new java.lang.String[] { "BoolVal", });
    internal_static_smartGlasses_BooleanResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_smartGlasses_BooleanResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartGlasses_BooleanResponse_descriptor,
        new java.lang.String[] { "BoolRespVal", });
    internal_static_smartGlasses_StringRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_smartGlasses_StringRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartGlasses_StringRequest_descriptor,
        new java.lang.String[] { "StringVal", });
    internal_static_smartGlasses_StringResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_smartGlasses_StringResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartGlasses_StringResponse_descriptor,
        new java.lang.String[] { "StringRespVal", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
