package org.example.StreamFunction.FirstNonRepeatedChar;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindChar {
    public static void main(String[] args) {
        String input="Java applications are awesome";

        Character result =input.chars().mapToObj(s->Character.toLowerCase(Character.valueOf((char)s)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream().filter(entry->entry.getValue()==1L)
                .map(entry->entry.getKey())
                .findFirst()
                .get();

        System.out.println(result);
    }
}


/***************************NOTE**********************************/

//1L: This checks if the value obtained from entry.getValue() is equal to 1L.
// The L denotes that the number is a long literal.

//input.chars()->Stream of String