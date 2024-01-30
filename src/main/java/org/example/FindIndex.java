package org.example;

public class FindIndex {
    private  static int[] findIndex(int[] inputArray, int target){
        int index = approximateIndex(inputArray, target);
        System.out.println("Index " + index);
        int[] resultArray = new int [2];
        if(index != -1){
            for(int i =index; i>= 0; i--){
                System.out.println("First Loop");
                if(inputArray[i] == target){
                    resultArray[0] = i;
                }
                else
                {
                    break;
                }
            }
            for(int i =index; i< inputArray.length; i++){
                System.out.println("second Loop");
                if(inputArray[i] == target){
                    resultArray[1] = i;
                }
                else{
                    break;
                }
            }
        }
        return resultArray;
    }

    private static int approximateIndex(int[] inputArray, int target){
        int length = inputArray.length;
        int start = 0;
        int end = length-1;
        int mid =  length;
        while(mid > 0){

            mid = (start + end)/2;
            int guess = inputArray[mid];
            if(guess == target){
                return mid;
            }
            else if(guess > target){
                end = mid -1;
            }
            else {
                start = mid +1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] array = {1,2,3,4,4,5,5,5,6,6,7,8,9,10,10,10,10,11,12,13,14,15,16, };
        int target = 6;
        int [] result = findIndex(array, target);
        for(Integer a: result){
            System.out.println(a);
        }
    }
}