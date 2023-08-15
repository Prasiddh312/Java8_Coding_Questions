package org.example.StreamFunction.FindMaximumValue;

import java.util.Arrays;
import java.util.List;

public class FindMax {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,15,8,49,25,98,32,15);

        int max=list.stream().max(Integer::compare).get();
        System.out.println(max);

        int min=list.stream().min(Integer::compare).get();
        System.out.println(min);
    }
}
