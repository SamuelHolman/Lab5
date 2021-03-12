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
public class ArrayHigherNumbersProblemTest {
    
    public ArrayHigherNumbersProblemTest() {
    }


    @Test
    public void testHigherNumberArray() {
        System.out.println("HigherNumberArray");
        int[] array = {1,2,3,4,5};
        int n = 2;
        int expResult = 3;
        int result = ArrayHigherNumbersProblem.HigherNumberArray(array, n);
        assertEquals(expResult, result);
    }
    
}
