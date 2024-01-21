package org.example;

import java.util.*;

public class Main  extends  AbstractTestClass{

    public List<Integer> testSparseArray(List<String> strings, List<String> queries){

        // Write your code here

        Map<String, Integer> tempMap = new LinkedHashMap<>();
        List<Integer> result = new ArrayList<>();

        for(String query: queries){
            if(!tempMap.containsKey(query)) {
                int tempCount = 0;
                tempMap.put(query, 0);
                for (String str : strings) {
                    if (str.equals(query)) {
                        tempCount +=1;
                    }
                }
                result.add(tempCount);
                tempMap.put(query, tempCount);
            }
            else{
            result.add(tempMap.get(query));
            }
        }
        result.forEach(System.out::println);
        return result;
    }
    public static void main(String[] args) {
        AbstractTestClass abstractTestClass = new Main();
        System.out.println(abstractTestClass.returnString());

    }
    @Override
    public String returnString(){
        return "FromChild";
    }
    @Override
    public void testMethod() {

    }
}