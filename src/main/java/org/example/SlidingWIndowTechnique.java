package org.example;

public class SlidingWIndowTechnique {
    public static void main(String[] args) {
        int [] array = {14,56,34,43,56,78,87,98,54,34,36,38,12,90,59};
        //int [] array = {5, 4, 6,2};
        int length = array.length;
        int size = 3;
        findMaxSumOfArray(array, length, size);
    }

    private static void findMaxSumOfArray(int[] array, int length, int size) {
        int maxSum = 0;
        int windowSum = 0;
        int maxSumPosition = -1;
        // find sum of first size elements
        for(int i =0; i<size; i ++){
            maxSum += array[i];
            maxSumPosition = i;
        }
        windowSum = maxSum;
        // find the max sum using sliding window
        // logic is to subtract the array value from current -k position

        for(int i = size; i< length; i ++){
            System.out.println(" i= " + i + " i-size= " + (i-size) );
            windowSum += array[i] - array[i - size];
            if(windowSum > maxSum){
                maxSum = windowSum;
                maxSumPosition = (i-size+1);
            }
        }
        System.out.println("Max sum is found at the location "
                + maxSumPosition
                + " Max sum is "
                + maxSum);
    }
}
