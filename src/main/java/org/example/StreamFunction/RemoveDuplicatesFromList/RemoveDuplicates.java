package org.example.RemoveDuplicatesFromList;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.addAll(Arrays.asList("apple","banana","apple","orange","orange","cherry","guava"));

        System.out.println("Before Removing duplicates:"+list);

        Set<String>set=new HashSet<>(list);

        System.out.println("After Removing Duplicates:"+set);

    }
}
