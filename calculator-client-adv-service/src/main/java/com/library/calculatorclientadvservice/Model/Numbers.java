package com.library.calculatorclientadvservice.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.scheduling.annotation.Async;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Async
public class Numbers {
    private int number1;
    private int number2;
    private String sign;
    private int result;
}
