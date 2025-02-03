package com.example;

public class MultiplicationTable {
    public String[] generateTable(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El valor de n no puede ser negativo.");
        }

        String[] table = new String[10];
        for (int i = 1; i <= 10; i++) {
            int result = n * i;
            table[i - 1] = n + " x " + i + " = " + result;
        }
        return table;
    }
}