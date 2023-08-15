package org.example.StreamFunction.EvenNumbers;

import java.beans.Introspector;
import java.util.Arrays;
import java.util.List;

public class FindEvenNumbers {
    public static void main(String[] args) {
        List<Integer> num= Arrays.asList(10,15,8,49,25,98,32);

        num.stream().filter(x->x%2==0).forEach(System.out::println);
    }
}
