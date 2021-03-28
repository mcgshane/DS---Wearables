import grpc
from concurrent import futures
import time

import smartCoat_pb2
import smartCoat_pb2_grpc

class smartCoatServiceServicer(smartCoat_pb2_grpc.smartCoatServiceServicer):

    def setTemp(self, request, context):
        if (request.intValue == 1):
            returnString = '30'
        print("Request to change heating to " + returnString)
        response = smartCoat_pb2.StringResponse()
        response.stringRespVal = ("Heating has been changed to " + returnString)
        return response

server = grpc.server(futures.ThreadPoolExecutor(max_workers=10))

smartCoat_pb2_grpc.add_smartCoatServiceServicer_to_server(
        smartCoatServiceServicer(), server)

print('Sever has been started.Now Listening on port 50555.')
server.add_insecure_port('[::]:50555')
server.start()
server.wait_for_termination()