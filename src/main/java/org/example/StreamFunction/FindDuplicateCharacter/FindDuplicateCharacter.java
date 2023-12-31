package org.example.FindDuplicateCharacter;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateCharacter {
    public static void main(String[] args) {
        printDuplicateCharacters("Programming");
    }

    public static  void printDuplicateCharacters( String word){

        //build Hashmap with character and number of times they appear in a String
        char[] characters= word.toCharArray();
        Map<Character,Integer>charMap=new HashMap<Character,Integer>();
        for (Character ch: characters
             ) {
            if(charMap.containsKey(ch)){
                charMap.put(ch, charMap.get(ch)+1);
            }
            else {
                charMap.put(ch,1);
            }
        }
        //Iterate through Hashmap
        Set<Map.Entry<Character,Integer>>entrySet=charMap.entrySet();
        for (Map.Entry<Character,Integer> entry: entrySet
             ) {
            if (entry.getValue()>1){
                System.out.printf( "%s : %d %n",entry.getKey(),entry.getValue());
            }

        }

    }
}
