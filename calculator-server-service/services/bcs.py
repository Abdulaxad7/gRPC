from pb import service_pb2_grpc
from pb import service_pb2


class BasicCalculatorService(service_pb2_grpc.BasicCalculatorServicer):
    def Add(self, request, context):
        result = request.a + request.b
        return service_pb2.AddResponse(result=result)

    def Subtract(self, request, context):
        return service_pb2.SubtractResponse(result=request.a - request.b)

    def Multiply(self, request, context):
        return service_pb2.MultiplyResponse(result=request.a * request.b)

    def Divide(self, request, context):
        return service_pb2.DivideReponse(result=request.a / request.b)
