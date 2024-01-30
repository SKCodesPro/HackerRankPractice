package org.example;

import java.util.Arrays;
import java.util.List;

public class PermutingArrays {
    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
        // Write your code here
        int sumMatchCounter = 0;
        for (int i = 0; i < A.size(); i++) {
            for (int j = i; j < B.size(); j++) {
                if ((B.get(j) +A.get(i)) >= k) {
                    int temp = B.get(i);
                    B.set(i, B.get(j));
                    B.set(j, temp);
                    sumMatchCounter += 1;
                    break;
                }
            }
        }
        return sumMatchCounter == A.size() ? "YES" : "NO";
    }

public static void main(String[] args) {
        List<Integer> A = Arrays.asList(2,3,1,1,1);
        List<Integer> B = Arrays.asList(1, 3, 4, 3,3);

        String permutingMatch = twoArrays(5, A, B);
    System.out.println(permutingMatch);
}
}
