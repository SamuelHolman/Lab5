/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Locke
 */
public class ArrayFunctionsProblemTest {
    
    public ArrayFunctionsProblemTest() {
    }



    @Test
    public void testArrayTotal() {
        System.out.println("ArrayTotal");
        int[] array = {1,2,3,4,5};
        int expResult = 15;
        int result = ArrayFunctionsProblem.ArrayTotal(array);
        assertEquals(expResult, result);
    }

    @Test
    public void testArrayAverage() {
        System.out.println("ArrayAverage");
        int[] array = {1,2,3,4,5};
        double expResult = 3;
        double result = ArrayFunctionsProblem.ArrayAverage(array);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testHighestNumber() {
        System.out.println("HighestNumber");
        int[] array = {1,2,3,4,5};
        int expResult = 5;
        int result = ArrayFunctionsProblem.HighestNumber(array);
        assertEquals(expResult, result);
    }

    @Test
    public void testLowestNumber() {
        System.out.println("LowestNumber");
        int[] array = {1,2,3,4,5};
        int expResult = 1;
        int result = ArrayFunctionsProblem.LowestNumber(array);
        assertEquals(expResult, result);
    }
    
}
