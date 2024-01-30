package org.example;

public class FindNonMatchingSignal {
    public static void main(String[] args) {
        int nonMatchingSignals = findNonMatchingSignal("SOSSOT");
        System.out.println(nonMatchingSignals);
    }

    private static int findNonMatchingSignal(String s) {
        int malFormedSignal = 0;
        // Write your code here
        for(int i=1; i<s.length(); i++){
            if((i%3 !=0) && (i%3)%2==0){
                if(s.charAt(i-2) != 'S'){
                    malFormedSignal +=1;
                }
                if(s.charAt(i-1) != 'O'){
                    malFormedSignal +=1;
                }
                if(s.charAt(i) != 'S'){
                    malFormedSignal +=1;
                }
            }
        }
        return malFormedSignal;
    }
}
