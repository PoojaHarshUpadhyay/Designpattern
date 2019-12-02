package com.company;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Cloneable {

    Employee() {
        empoloyeeIdList = new ArrayList<>();
    }

    Employee(List<Integer> lst) {
        this.empoloyeeIdList = lst;
    }

    private List<Integer> empoloyeeIdList;

    public List<Integer> getList() {
        return empoloyeeIdList;
    }

    public void loadData() {
        for (int i = 0; i < 10; i++) {
            empoloyeeIdList.add(i);
        }
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        List<Integer> newList = new ArrayList<>();
        for (Integer i : this.getList()) {
            newList.add(i);
        }
        return new Employee(newList);

    }
}
