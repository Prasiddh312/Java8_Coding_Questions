package org.example.StreamFunction.FindFirst;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirst {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("apple","banana","apple","bonzelo","brownie");

        Optional result=list.stream().filter(n->n.startsWith("b")).findFirst();
        System.out.println(result);
    }
}
