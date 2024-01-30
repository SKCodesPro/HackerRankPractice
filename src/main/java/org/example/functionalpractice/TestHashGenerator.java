package org.example.functionalpractice;

public class TestHashGenerator {
    public static void main(String[] args) {
        int noOfServer = 11;
        for(int i =0; i< 4; i++){
            String key = "key"+i;
            System.out.println(key.hashCode());
            System.out.println("Server Index " + (key.hashCode())%noOfServer);
        }
    }
}
