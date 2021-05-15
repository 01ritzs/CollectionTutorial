package com.company.CollectionIntroduction;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {

        //Data is added in the list using List interface
        //Data can be duplicated in this List

        List<String> list = new ArrayList<>();

        list.add("Suresh");
        list.add("Usha");
        list.add("Rana");
        list.add("Madhu");
        list.add("Digu");
        list.add("Abhishek");
        list.add("Ritesh");
        list.add("Ishu");
        list.add("Rishu");
        list.add("Aditi");
        list.add("Madhu");

        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            String str = itr.next();
            System.out.println(str);
        }

        System.out.println("List of Name Arrya: " + list);

    }
}
