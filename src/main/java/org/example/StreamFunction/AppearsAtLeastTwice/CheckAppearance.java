package org.example.StreamFunction.AppearsAtLeastTwice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CheckAppearance {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3,1 };
        List<Integer>list= Arrays.stream(nums).boxed().collect(Collectors.toList());

        Set<Integer> set=new HashSet<>(list);
        if(set.size()==list.size()){
            System.out.println("Doesn't Contains Duplicate");
        }
        else
        System.out.println("Conatains Duplicate");
    }




    }


