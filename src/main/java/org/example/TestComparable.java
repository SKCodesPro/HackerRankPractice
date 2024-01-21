package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparable {
    public static void main(String[] args) {
        List <Employee> empList = new ArrayList<>();
        Employee employee = new Employee(1, "Sathish" , "Architecture");
        Employee employee1 = new Employee(2, "Thangam" , "Engineering");
        Employee employee2 = new Employee(3, "Kalai" , "Data");
        Employee employee3 = new Employee(4, "Mohana" , "Support");
        empList.add(employee);
        empList.add(employee1);
        empList.add(employee2);
        empList.add(employee3);
        empList.forEach(emp -> System.out.println(emp.getName()));
        Collections.sort(empList);
        empList.forEach(emp -> System.out.println(emp.getName()));


    }
}
