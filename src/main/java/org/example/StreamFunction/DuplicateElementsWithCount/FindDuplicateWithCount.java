package org.example.StreamFunction.DuplicateElementsWithCount;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateWithCount {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("AA","BB","AA","CC");

        Map<String,Long> nameCount=names.stream().filter(x-> Collections.frequency(names,x)>1)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(nameCount);



    }



}
