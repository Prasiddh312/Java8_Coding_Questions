package org.example.CharacterCount_in_String;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Count_Characters {
    public static void main(String[] args) {
        String s="Prasiddh";

        Map<String,Long> map= Arrays.stream(s.split("")).map(String::toLowerCase)
                .collect(Collectors.groupingBy(str->str, LinkedHashMap::new,Collectors.counting()));

        System.out.println(map);
    }
}
