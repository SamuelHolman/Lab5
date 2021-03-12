/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Locke
 */
public class ArrayHigherNumbersProblem {
    public static void main(String[] args) {
       int n = 10;
       int[] array = {1,2,3,4,5,6,7,8,9,11,11,11,11};
       HigherNumberArray(array,n);
    }
    
    public static int HigherNumberArray(int[] array, int n) {
        int amount = 0;
        for(int i : array) {
            if(i>n){
                amount++;
            }
    }
        System.out.println("There are " + amount + " numbers higher than n!");
        return amount;
    }
}
