package org.example.StreamFunction;

import java.util.Arrays;
import java.util.List;

public class MapFunction {
    public static void main(String[] args) {
        List<Integer> num= Arrays.asList(1,2,3,4,5,6,7,8);

       // num.stream().map(x->x*2).forEach(System.out::println);
        //num.stream().map(e->e-1).forEach(System.out::println);
        num.stream().map(e->e/2).forEach(System.out::println);



    }
}
