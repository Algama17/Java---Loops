package com.example;

public class App {
    public static void main(String[] args) {

        MultiplicationTable mt = new MultiplicationTable();

        int n = 5;

        String[] table = mt.generateTable(n);

        System.out.println("Tabla de multiplicar del " + n + ":");
        for (String line : table) {
            System.out.println(line);
        }
    }
}
