package org.example.CheckAnagram;

import java.security.SecureRandom;
import java.util.Arrays;

public class CheckAnagram {
    public static void main(String[] args) {
        String s="army";
        String s1="mary";

        char[] arr=s.toCharArray();
        char [] arr1=s1.toCharArray();

        Arrays.sort(arr);
        Arrays.sort(arr1);
        System.out.println(arr);
        System.out.println(arr1);

        if(Arrays.equals(arr,arr1)){
            System.out.println("Two strings Are Anagram");
        }
        else
            System.out.println("Two Strings are not Anagram");
    }

}
