package org.example.StreamFunction.SumOfSquareOfNos;
//Program to find Sum of squares all even numbers.
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfSquaresOfNos {
    public static void main(String[] args) {
        List<Integer> num= Arrays.asList(1,2,3,4,5,6,7);


        //System.out.println(list);

        int result=num.stream().filter(n->n%2==0).mapToInt(n->n*n).sum();

        System.out.println(result);
    }
}
