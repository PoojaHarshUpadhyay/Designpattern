package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        // write your code here
        Employee employee = new Employee();
        employee.loadData();

        Employee employee1 = (Employee) employee.clone();
        System.out.println(employee1.getList());

        List<Integer> integerList = employee1.getList();
        integerList.remove(2);
        System.out.println(employee1.getList());

        Employee employee2 = (Employee) employee.clone();
        System.out.println(employee2.getList());
    }
}
