package org.example.StreamFunction.SortedArray_into_Stream;

import java.util.Arrays;

public class SortedArray_into_Stream {
    public static void main(String[] args) {
        int [] arr={ 99, 55, 203, 99, 4, 91 };

        Arrays.parallelSort(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }
}
