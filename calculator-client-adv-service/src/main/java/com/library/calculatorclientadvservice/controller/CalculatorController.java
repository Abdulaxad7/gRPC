package com.library.calculatorclientadvservice.controller;

import com.library.calculatorclientadvservice.Model.Numbers;
import com.library.calculatorclientadvservice.services.CalculatorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public  class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @RequestMapping("/")
    public String home(){
        return "home";
    }
    @PostMapping("/")
    public String calculate(@ModelAttribute Numbers numbers, Model model){
        switch (numbers.getSign()) {
            case "cos" -> model.addAttribute("result",
                    calculatorService.cos(numbers.getNumber1()));
            case "sin" -> model.addAttribute("result",
                    calculatorService.sin(numbers.getNumber1()));
            case "pow" -> model.addAttribute("result",
                    calculatorService.power(numbers.getNumber1(),numbers.getNumber2()));
            default -> model.addAttribute("result",
                    calculatorService.exp(numbers.getNumber1()));
        }
        return "show";
    }
}
