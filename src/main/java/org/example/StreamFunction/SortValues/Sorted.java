package org.example.StreamFunction.SortValues;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sorted {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,15,8,49,25,98,98,32,15);

        //In Ascending Order.
        System.out.println("In Ascending Order:-");
        list.stream().sorted().forEach(System.out::println);

        //In Descending Order.
        System.out.println("In Descending Order:-");
        list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
    }
}
