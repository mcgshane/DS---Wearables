import grpc

#import the classes that were generated for us 
import smartCoat_pb2
import smartCoat_pb2_grpc


#open a GRPC Channel
channel = grpc.insecure_channel("localhost:50505")