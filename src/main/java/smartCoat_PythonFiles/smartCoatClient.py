import grpc

import smartCoat_pb2
import smartCoat_pb2_grpc


#input = []
channel = grpc.insecure_channel('localhost:50555')
stub = smartCoat_pb2_grpc.smartCoatServiceStub(channel)
print ('1')
IntRequest = smartCoat_pb2.IntRequest(intValue = 1)
print('2')
response = stub.setTemp(IntRequest)
     
print(response.stringRespVal)