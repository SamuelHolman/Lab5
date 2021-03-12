/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Locke
 */
public class ArrayFunctionsProblem {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("The total of the array is " + ArrayTotal(array));
        System.out.println("The average of the array is " + ArrayAverage(array));
        System.out.println("The highest number in the array is " + HighestNumber(array));
        System.out.println("The lowest number in the array is " + LowestNumber(array));
    }
    
    public static int ArrayTotal(int array[]) {
        int total = 0;
        for(int i : array) {
            total += i;
            }
        return total;
    }
    
    public static double ArrayAverage(int array[]) {
        double total = 0;
        for(int i : array) {
            total += i;
        }
        double average;
        return average = (total / array.length);
    }
    
    public static int HighestNumber(int array[]) {
        int high = 0;
        for(int i : array) {
            if(i > high){
                high = i;
            }
        }
        return high;
    }
    
    public static int LowestNumber(int array[]) {
        int low = array[1];
        for(int i : array) {
            if(i < low){
                low = i;
            }
        }
        return low;
    }
    
}
