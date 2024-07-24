from pb import service_pb2_grpc
from pb import service_pb2
import math


class AdvancedCalculator(service_pb2_grpc.AdvancesCalculatorServicer):
    def Exp(self, request, context):
        result = math.exp(request.a)
        return service_pb2.RootResponse(result=result)

    def Power(self, request, context):
        result = math.pow(request.a, request.b)
        return service_pb2.PowerResponse(result=result)

    def Sin(self, request, context):
        return service_pb2.SinResponse(result=math.sin(request.a))

    def Cos(self, request, context):
        return service_pb2.CosResponse(result=math.cos(request.a))