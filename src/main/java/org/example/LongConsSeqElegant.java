package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongConsSeqElegant {
    public static void findLongestConseSeq(int[] array, int arrayLength){
        Arrays.sort(array);
        List<Integer> uniqueArray = new ArrayList<>();
        uniqueArray.add(array[0]);
        int tempCounter =0;
        // add only unique elements to the array
        for(int i =1; i < arrayLength; i++){
            if (array[i] != array[i-1]){
                uniqueArray.add(array[i]);
            }
        }
        // find the longest sequence
        for( int i = 0; i< uniqueArray.size(); i++){
            if(i>0 && uniqueArray.get(i) ==  uniqueArray.get(i-1) +1){
                tempCounter ++;
            }
            else {
                tempCounter = 1;
            }
        }
        System.out.println(tempCounter);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,4,5,6,7,9,10};
        int length = arr.length;
        if(length >0){
        findLongestConseSeq(arr
                , length);}
    }
}
