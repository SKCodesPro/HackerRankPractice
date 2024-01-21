package org.example;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {4,3,2,6,7,1,5};
        int start = 0;
        int end = array.length -1;
        quickSort(array, start, end);
        Arrays.stream(array).forEach(System.out::println);
    }

    private static void quickSort(int[] array, int start, int end) {
        if(end <= start){
            return;
        }
        else {
            int pivot = partition (array, start, end);
            quickSort(array, start, pivot -1);
            quickSort(array, pivot +1, end);
        }
    }

    private static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int i = start -1;
        for(int j=start; j<=end; j++){
            if(array[j] < pivot){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;

            }
        }
        i++;
        int temp = array[i];
        array[i] = pivot;
        array[end] = temp;
        return  i;
    }
}
