package org.example;

public class FactorialRecursive {
    public static void main(String[] args) {
        int number = 5;
        int factorial = findFactorial(number);
        System.out.println("Factorial is " + factorial);
    }

    private static int findFactorial(int number) {
        System.out.println(number);
        if(number ==1){
            return 1;
        }
        else{
            return number * findFactorial(number-1);
        }
    }
}
