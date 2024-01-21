package org.example;

import java.util.Arrays;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {

//int arr[] = {36, 41, 56, 35, 44, 33, 34, 92, 43, 32, 42};
        int arr[] = {1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 13, 14, 15, 16, 17, 18, 19, 20};
//        int arr[] = {1, 2, 3, 4,8,9};
         // int arr[] = {1, 2, 3,4,5,6,7,8,9};
        // int arr[] = {1};

        Arrays.sort(arr);
        int tempSequenceCounter = -1;
        int longestSequenceCounter = 0;
        // Arrays.stream(arr).forEach(System.out::println);
        for (int i = 0; i < arr.length; i++) {
            if (i + 1 < arr.length) {
                if (arr[i] + 1 == arr[i + 1]) {
                    if(tempSequenceCounter == -1){
                        tempSequenceCounter += 2;
                        continue;
                    }
                    tempSequenceCounter += 1;
                } else {
                    if (tempSequenceCounter > longestSequenceCounter) {
                        longestSequenceCounter = tempSequenceCounter;
                        tempSequenceCounter = 0;
                    } else {
                        tempSequenceCounter = 0;
                    }

                }
            }
            else if (arr.length == 1){
                longestSequenceCounter = 1;
            }
            else {
                if (arr[i] - 1 == arr[i-1]){
                   tempSequenceCounter += 1;
                    if (tempSequenceCounter > longestSequenceCounter) {
                        longestSequenceCounter = tempSequenceCounter;
                    }
                }
            }
        }

        System.out.println("Longest sequence is " + longestSequenceCounter);

    }
}
