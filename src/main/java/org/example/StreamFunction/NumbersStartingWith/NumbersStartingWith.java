package org.example.StreamFunction.NumbersStartingWith;


import java.util.Arrays;
import java.util.List;

//Program to find out all the numbers starting with 1.
public class NumbersStartingWith {
    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(10,15,49,25,98,32);

        num.stream().map(s->s+"").filter(s -> s.startsWith("1")).forEach(System.out::println);

//map(s->s+"")-converts Integer to String.


    }
}
