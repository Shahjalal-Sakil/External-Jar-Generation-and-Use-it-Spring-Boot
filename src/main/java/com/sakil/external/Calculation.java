package com.sakil.external;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Calculation {
    public int multiply(int a, int b)
    {
        return a*b;
    }
}
