package routers

import (
	"calculator-client-service/pb"
	"google.golang.org/grpc"
	"log"
)

func ConfigService() pb.BasicCalculatorClient {
	conn, err := grpc.Dial("localhost:50051", grpc.WithInsecure())
	if err != nil {
		log.Fatalf("Did not connect: %v", err)
	}

	return pb.NewBasicCalculatorClient(conn)
}
