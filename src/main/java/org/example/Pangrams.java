package org.example;

public class Pangrams {
    public static String pangrams(String s) {
        // Write your code here
        String inLowerCase = s.toLowerCase();
        boolean isPangram = false;
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.println(inLowerCase);
            if (!inLowerCase.contains(String.valueOf(c))) {
                isPangram = false;
                break;
            } else {
                isPangram = true;
            }
        }
        System.out.println(isPangram);
        return isPangram ? "pangram" : "not pangram";
    }
}
