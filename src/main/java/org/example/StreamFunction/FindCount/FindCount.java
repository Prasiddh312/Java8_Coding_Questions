package org.example.StreamFunction.FindCount;

import java.util.Arrays;
import java.util.List;

public class FindCount {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(6,3,2,3,1,7,8,9);

        long c=list.stream().count();
        System.out.println(c);
    }
}
