package org.example;

public class SumOfArrayRecursive {
    public static int findSumOfArrayRecusively(int[] array, int length){
        if(length <=0 ){
            return 0;
        }
        else {
            return(findSumOfArrayRecusively(array, length -1) + array[length-1]);
        }
    }

    public static void main(String[] args) {
        int [] array = {1,2,3};
        int sum = findSumOfArrayRecusively(array, array.length);
        System.out.println(sum);
    }
}
