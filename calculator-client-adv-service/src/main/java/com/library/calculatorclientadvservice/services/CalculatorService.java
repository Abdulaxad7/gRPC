package com.library.calculatorclientadvservice.services;


import com.library.calculatorclientadvservice.calculator.AdvancesCalculatorGrpc;
import org.springframework.stereotype.Service;
@Service
public  class CalculatorService {

    private final AdvancesCalculatorGrpc.AdvancesCalculatorBlockingStub advancesCalculatorStub;

    public CalculatorService( AdvancesCalculatorGrpc.AdvancesCalculatorBlockingStub advancesCalculatorBlockingStub) {
        this.advancesCalculatorStub = advancesCalculatorBlockingStub;
    }

    public float exp(float a) {

        com.library.calculatorclientadvservice.calculator.Service.ExpRequest request = com.library.calculatorclientadvservice.calculator.Service.ExpRequest.newBuilder().setA(a).build();
        com.library.calculatorclientadvservice.calculator.Service.ExpResponse response = advancesCalculatorStub.exp(request);

        return response.getResult();
    }

    public float power(float a, float b) {
        com.library.calculatorclientadvservice.calculator.Service.PowerRequest request = com.library.calculatorclientadvservice.calculator.Service.PowerRequest.newBuilder().setA(a).setB(b).build();
        com.library.calculatorclientadvservice.calculator.Service.PowerResponse response = advancesCalculatorStub.power(request);
        return response.getResult();
    }

    public float sin(float a) {
        com.library.calculatorclientadvservice.calculator.Service.SinRequest request = com.library.calculatorclientadvservice.calculator.Service.SinRequest.newBuilder().setA(a).build();
        com.library.calculatorclientadvservice.calculator.Service.SinResponse response = advancesCalculatorStub.sin(request);
        return response.getResult();
    }

    public float cos(float a) {
        com.library.calculatorclientadvservice.calculator.Service.CosRequest request = com.library.calculatorclientadvservice.calculator.Service.CosRequest.newBuilder().setA(a).build();
        com.library.calculatorclientadvservice.calculator.Service.CosResponse response = advancesCalculatorStub.cos(request);
        return response.getResult();
    }
}

