package com.library.calculatorclientadvservice.config;

import com.library.calculatorclientadvservice.calculator.AdvancesCalculatorGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GrpcClientConfiguration {

    @Bean
    public ManagedChannel managedChannel() {
        return ManagedChannelBuilder.forAddress("localhost", 9091)
                .usePlaintext() // Disable TLS for development
                .build();
    }
    @Bean
    public AdvancesCalculatorGrpc.AdvancesCalculatorBlockingStub advancedCalculatorBlockingStub(ManagedChannel managedChannel) {
        return AdvancesCalculatorGrpc.newBlockingStub(managedChannel);
    }
}
