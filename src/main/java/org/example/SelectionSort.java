package org.example;

import java.util.Arrays;

public class SelectionSort {
    public static int findSmallestIndex(int[] array, int startIndex) {
        int smallestElement = array[startIndex];
        int smallestIndex = startIndex;
        for (int i = startIndex; i < array.length; i++) {
            if (array[i] < smallestElement) {
                smallestElement = array[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static void main(String[] args) {
        int[] intArray = {21,2, 1, 5, 3, 4, 9, 7, 8};
        for (int i = 0; i < intArray.length; i++) {
            int smallestIndex = findSmallestIndex(intArray, i);
            // swap the elements in the array
            int tempElement = intArray[smallestIndex];
            intArray[smallestIndex] = intArray[i];
            intArray[i] = tempElement;
        }
        Arrays.stream(intArray).forEach(System.out::print);
    }
}
