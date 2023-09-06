package org.example.Print1to100withoutLoop;

public class Numbers {
    public static void main(String[] args) {
        printNumbers(1);

    }

    public static void printNumbers(int n){
        if(n<=100){
            System.out.println(n);
            printNumbers(n+1);
        }
    }
}
