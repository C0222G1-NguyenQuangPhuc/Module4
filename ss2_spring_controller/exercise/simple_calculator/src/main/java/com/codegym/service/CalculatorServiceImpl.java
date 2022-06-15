package com.codegym.service;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class CalculatorServiceImpl implements ICalculatorService{
    @Override
    public String calculated(Map<String, String> operand) {
        double num1 = Double.parseDouble(operand.get("num1"));
        double num2 = Double.parseDouble(operand.get("num2"));
        String cal = operand.get("expression");
        String result = "";
        try {
            switch (cal){
                case "Addition":
                    result = Double.toString(num1 + num2);
                    break;
                case "Subtraction":
                    result = Double.toString(num1 - num2);
                    break;
                case "Multiplication":
                    result = Double.toString(num1 * num2);
                    break;
                case "Division":
                    if (num2 != 0){
                        result = Double.toString(num1 / num2);
                    }else {
                        result = "Can Division by 0, please change other number";
                    }
                    break;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
}
