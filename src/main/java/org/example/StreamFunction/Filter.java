package org.example.StreamFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args) {
        //returns a stream consisting of the elements of this stream that match the given predicate.
        List<Integer> numbers=new ArrayList<>();


        numbers.addAll(Arrays.asList(12,3,5,6,7,8,10,17,18));

        //It will print all the even numbers
        numbers.stream().filter(e->e%2==0).forEach(System.out::println);

        //We can collect the filtered elements in new List,Set,map using Collect() method.
        List<Integer> stream =numbers.stream().filter(x->x>5).collect(Collectors.toList());
        System.out.println(stream);






    }
}
