
import grpc
from concurrent import futures
import time

#import the classes that were generated for us 
import smartCoat_pb2
import smartCoat_pb2_grpc

class smartCoatServer(smartCoat_pb2_grpc.smartCoatService):
    
    maxTemp = 40
    minTemp = 0

    def TurnOnSwitch(self, request, context):
        response = smartCoat_pb2.bool_value()
        return response

    def setHeatTemp(self, request, context):
       
        response = smartCoat_pb2.StringRespval()
        if self.minTemp > request.value:
            print("Temperature too low")
        elif self.maxTemp < request.value:
            print("Temperature too high")
        else:
            print("Temperature updated to " + str(request.value))
        return response