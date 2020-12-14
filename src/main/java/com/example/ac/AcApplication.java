package com.example.ac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.sakil.external.Calculation;

@SpringBootApplication
public class AcApplication {

    public static void main(String[] args) {
        SpringApplication.run(AcApplication.class, args);

        Calculation calculator = new Calculation();
        System.out.println("Testing Result: "+ calculator.multiply(5,4));

    }

}
