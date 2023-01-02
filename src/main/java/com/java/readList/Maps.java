package com.java.readList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Maps {

    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        Map<String, List<String>> sortedStudentName = new HashMap<>();

        Map<String, List<Integer>> sortedPercentage = new HashMap<>();

        list.add(new Student("Jack", 60));
        list.add(new Student("Michal", 80));
        list.add(new Student("Peter", 70));
        list.add(new Student("Hemsworth", 90));

        // Adding data to the list
        Iterator<Student> it = list.iterator();
        List<String> students = new ArrayList<>();
        List<Integer> percentage = new ArrayList<>();
        while (it.hasNext()) {
            Student key = it.next();
            students.add(key.getStudentName());
            percentage.add(key.getPercentage());
        }

        // Sorting the List
        students = students.stream().sorted().collect(Collectors.toList());
        percentage = percentage.stream().sorted().collect(Collectors.toList());

        // Adding the sorted details into the map
        sortedStudentName.put("StudentName", students);
        sortedPercentage.put("Percentage", percentage);

        // Printing the details
        System.out.println("Map sorted with student name : \n" + sortedStudentName);
        System.out.println("\nMap sorted with percentage : \n" + sortedPercentage);

    }

}
