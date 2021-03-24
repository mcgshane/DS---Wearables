# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

import smartCoat_pb2 as smartCoat__pb2


class smartCoatServiceStub(object):
    """Missing associated documentation comment in .proto file."""

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.turnOnSwitch = channel.unary_unary(
                '/smartCoat.smartCoatService/turnOnSwitch',
                request_serializer=smartCoat__pb2.BooleanRequest.SerializeToString,
                response_deserializer=smartCoat__pb2.BooleanResponse.FromString,
                )
        self.setTemp = channel.unary_unary(
                '/smartCoat.smartCoatService/setTemp',
                request_serializer=smartCoat__pb2.IntRequest.SerializeToString,
                response_deserializer=smartCoat__pb2.IntResponse.FromString,
                )


class smartCoatServiceServicer(object):
    """Missing associated documentation comment in .proto file."""

    def turnOnSwitch(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def setTemp(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_smartCoatServiceServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'turnOnSwitch': grpc.unary_unary_rpc_method_handler(
                    servicer.turnOnSwitch,
                    request_deserializer=smartCoat__pb2.BooleanRequest.FromString,
                    response_serializer=smartCoat__pb2.BooleanResponse.SerializeToString,
            ),
            'setTemp': grpc.unary_unary_rpc_method_handler(
                    servicer.setTemp,
                    request_deserializer=smartCoat__pb2.IntRequest.FromString,
                    response_serializer=smartCoat__pb2.IntResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'smartCoat.smartCoatService', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class smartCoatService(object):
    """Missing associated documentation comment in .proto file."""

    @staticmethod
    def turnOnSwitch(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/smartCoat.smartCoatService/turnOnSwitch',
            smartCoat__pb2.BooleanRequest.SerializeToString,
            smartCoat__pb2.BooleanResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def setTemp(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/smartCoat.smartCoatService/setTemp',
            smartCoat__pb2.IntRequest.SerializeToString,
            smartCoat__pb2.IntResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
