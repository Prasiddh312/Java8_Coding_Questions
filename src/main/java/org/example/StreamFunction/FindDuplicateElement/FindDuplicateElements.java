package org.example.StreamFunction.FindDuplicateElement;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateElements {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,15,8,49,25,98,98,32,15);
        Set<Integer> set=new HashSet<>();

        list.stream().filter(n->!set.add(n)).forEach(System.out::println);

        /***********************************************************/

        List<String> names=Arrays.asList("Prasiddh","Prasiddh","Kajal","Kajal","Raul","Richa");

        Set<String> nameSet=new HashSet<>();

        names.stream().filter(e->!nameSet.add(e)).forEach(System.out::println);
    }
}
