package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class AppTest {
    
   @Test
    public void testGenerateTable() {
        MultiplicationTable mt = new MultiplicationTable();

        String[] expectedOutput = {
            "5 x 1 = 5", "5 x 2 = 10", "5 x 3 = 15", "5 x 4 = 20", 
            "5 x 5 = 25", "5 x 6 = 30", "5 x 7 = 35", 
            "5 x 8 = 40", "5 x 9 = 45", "5 x 10 = 50"
        };
        assertArrayEquals(expectedOutput, mt.generateTable(5));

        String[] expectedOutputZero = {
            "0 x 1 = 0", "0 x 2 = 0", "0 x 3 = 0", "0 x 4 = 0", 
            "0 x 5 = 0", "0 x 6 = 0", "0 x 7 = 0", 
            "0 x 8 = 0", "0 x 9 = 0", "0 x 10 = 0"
        };
        assertArrayEquals(expectedOutputZero, mt.generateTable(0));

        try {
            mt.generateTable(-2);
            fail("Se esperaba una excepción para n negativo.");
        } catch (IllegalArgumentException e) {
            assertEquals("El valor de n no puede ser negativo.", e.getMessage());
        }
    }
}
