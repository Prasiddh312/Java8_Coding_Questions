package org.example.RemoveDuplicateChars;

import java.util.HashSet;

public class RemoveDuplicateChars {

    public static String removeDuplicateCharacters(String str){
        if(str==null||str.isEmpty()){
            return str;
        }
        HashSet<Character>set=new HashSet<>();
        StringBuilder sb=new StringBuilder();
        for (char c:str.toCharArray()
             ) {
            if(!set.contains(c)){
                set.add(c);
                sb.append(c);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str="Java and JavaScript";
        System.out.println(removeDuplicateCharacters(str));

    }
}
