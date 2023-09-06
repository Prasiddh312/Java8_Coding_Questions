package org.example.RotationalString;

public class RotationalString {
    public static void main(String[] args) {
        String s="ABCD";
        String s1="CDBA";

        s=s+s;
        if(s.contains(s1)){
            System.out.println("String is Rotational");
        }
        else {
            System.out.println("String is not Rotational");
        }
    }
}
