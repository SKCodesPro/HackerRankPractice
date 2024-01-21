package org.example;

import java.util.Arrays;

public class BinarySearchForName {
    public static int search(String[] names, String itemToFind){
        int low = 0;
        int high  = names.length -1;
        int count = 0;
        while(low <= high){
            count ++;
            int mid = (low + high) / 2;
            String guess = names[mid];
            if(guess.equals(itemToFind)){
                System.out.println("No of iterations to find the number from Array" + count);
                System.out.println("Index is " + mid);
                System.out.println("Value found is " + guess);
                return mid;
            }
            if(itemToFind.compareTo(guess) < 0){
                high = mid -1;
            }
            else{
                low = mid +1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        String [] names = {"AAA", "BBB", "CCC", "DDD","FFF", "GGG","III", "EEE" };
        Arrays.sort(names);
        search(names, "EEE");
    }
}
