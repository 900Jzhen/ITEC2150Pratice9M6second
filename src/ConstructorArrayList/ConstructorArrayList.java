package ConstructorArrayList;

import java.util.ArrayList;

public class ConstructorArrayList {
    public static void main(String[] args) {
        ArrayList<String> courseList = new ArrayList<>();
        courseList.add("Chemistry II");
        courseList.add("Intermediate Programming");
        courseList.add("Choice of Life");

        Student student1 = new Student("Donovan",courseList);
    }
}
