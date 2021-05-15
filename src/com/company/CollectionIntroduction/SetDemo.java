package com.company.CollectionIntroduction;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetDemo {

    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        set.add("Ritesh");
        set.add("John");
        set.add("Rana");
        set.add("Abhishek");
        set.add("Digu");
        set.add("Madhu");
        set.add("Suresh");
        set.add("Usha");

        // Data is Unique, no Redundancy
        // Data is unordered in output due to hashing
        System.out.println("Set is : " + set);

        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            String str = itr.next();
            System.out.println(str);
        }

        set.remove("John");
        System.out.println("Set after removing John is : " + set);

        if (set.contains("Suresh")) {
            System.out.println("Suresh is in the set");
        }

        System.out.println("Set size is : " + set.size() + "\n");

        // Data is sorted Alphabeticly
        // Data is order in output dut to tree
        TreeSet<String> set1 = new TreeSet<>();

        set1.add("Ritesh");
        set1.add("John");
        set1.add("Rana");
        set1.add("Abhishek");
        set1.add("Digu");
        set1.add("Madhu");
        set1.add("Suresh");
        set1.add("Usha");

        // Data is Unique, no Redundancy
        // Data is unordered in output due to hashing
        System.out.println("set1 is : " + set1);

        Iterator<String> itr1 = set1.iterator();
        while (itr1.hasNext()) {
            String str = itr1.next();
            System.out.println(str);
        }

        set1.remove("John");
        System.out.println("set1 after removing John is : " + set1);

        if (set1.contains("Suresh")) {
            System.out.println("Suresh is in the set1");
        }

        System.out.println("set1 size is : " + set1.size());
    }
}
