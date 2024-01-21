package org.example;

import java.util.Arrays;
import java.util.Collections;

public class BinarySearch {
    public static int search(int[] array, int itemToFind){
        Arrays.sort(array);
        int length = array.length;
        int low = 0;
        int high = length-1;
    int count =0;
       while(low <= high){
           count ++;
           int mid = (low+high)/2;
           int guess = array[mid];
            if(guess == itemToFind){
                System.out.println("No of iterations to find the number from Array" + count);
                System.out.println("Index is " + mid);
                System.out.println("Value found is " + guess);
                return mid;
            }
            if(itemToFind > guess){
                low = mid +1;
            }
            else{
                high = mid -1;
            }
       }

       return 0;
    }
    public static void main(String[] args) {
    int[] array = new int[9000];
        for( int i =1; i <9000; i++){
            array[i] = i;
        }
//        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
        int index = search(array, 8999);
        System.out.println(index);
    }
}
