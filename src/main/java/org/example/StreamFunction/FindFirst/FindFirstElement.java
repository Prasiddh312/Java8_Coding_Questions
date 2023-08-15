package org.example.StreamFunction.FindFirst;

import java.util.Arrays;
import java.util.List;

public class FindFirstElement {
    public static void main(String[] args) {
        List<Integer> num= Arrays.asList(6,3,2,3,1,7,8,9);

        num.stream().findFirst().ifPresent(System.out::println);
    }
}
