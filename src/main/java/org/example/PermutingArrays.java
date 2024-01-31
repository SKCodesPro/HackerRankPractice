package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PermutingArrays {
    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
        // Write your code here
        int sumMatchCounter = 0;
        Collections.sort(A);
        Collections.sort(B);
        for (int i = 0; i < A.size(); i++) {
            for (int j = i; j < B.size(); j++) {
                if ((B.get(j) + A.get(i)) >= k) {
                    int temp = B.get(i);
                    B.set(i, B.get(j));
                    B.set(j, temp);
                    sumMatchCounter += 1;
                    break;
                }
            }
        }
        for (Integer i : B) {
            System.out.print(i + ",");
        }
        System.out.println();
        for (Integer i : A) {
            System.out.print(i + ",");
        }
        return sumMatchCounter == A.size() ? "YES" : "NO";
    }

    public static String java8Solution(int k, List<Integer> A, List<Integer> B) {
        // Write your code here
        final List<Integer> differences =
                A.stream().map(elem -> k - elem).sorted()
                        .collect(Collectors.toList());
        int listcount = B.size();
        for (Integer diff : differences) {
            final long count = B.stream().filter(e -> e >= diff).count();
            if (count < listcount) {
                return "NO";
            }
            listcount--;
        }

        return "YES";


    }


    public static void main(String[] args) {
        List<Integer> A = Arrays.asList(2,3,1,1,1);
        List<Integer> B = Arrays.asList(1, 3, 4, 3,3);
//List<Integer> A = Arrays.asList(3,6,8,5,9,9,4,8,4,7);
//List<Integer> B = Arrays.asList(5,1,0,1,6,4,1,7,4,3);
//List<Integer> A = Arrays.asList(1,5,1,4,4,2,7,1,2,2);
//List<Integer> B = Arrays.asList(8, 7, 1,7,7,4,4,3,6,7);
//        List<Integer> A = Arrays.asList(3, 6, 8, 5, 9, 9, 4, 8, 4, 7);
//        List<Integer> B = Arrays.asList(5, 1, 0, 1, 6, 4, 1, 7, 4, 3);
        String permutingMatch = java8Solution(9, A, B);
        String myResult = twoArrays(9, A, B);
        System.out.println(permutingMatch);
        System.out.println(myResult);
    }
}
