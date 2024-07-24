from asyncio import futures
from concurrent import futures
import grpc
from pb import service_pb2_grpc, service_pb2
from grpc_reflection.v1alpha import reflection

from services.bcs import BasicCalculatorService
from services.acs import AdvancedCalculator

def serve():
    server = grpc.server(futures.ThreadPoolExecutor(max_workers=10))

    service_pb2_grpc.add_BasicCalculatorServicer_to_server(BasicCalculatorService(), server)
    service_pb2_grpc.add_AdvancesCalculatorServicer_to_server(AdvancedCalculator(), server)


    service_names = (
        service_pb2.DESCRIPTOR.services_by_name['BasicCalculator'].full_name,
        service_pb2.DESCRIPTOR.services_by_name['AdvancesCalculator'].full_name,

        reflection.SERVICE_NAME,
    )
    reflection.enable_server_reflection(service_names, server)

    server.add_insecure_port('[::]:50051')

    server.start()
    print("Server is running on port 50051...")

    server.wait_for_termination()


if __name__ == '__main__':
    serve()

