package org.example.FirstNonRepeatingCharacter;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String s="java";

        Map<Character,Integer>map=new LinkedHashMap<>(s.length());
        for (char c:s.toCharArray()
             ) {
            map.put(c,map.containsKey(c)?map.get(c)+1:1);
        }
        for (Map.Entry<Character,Integer> entry:map.entrySet()
             ) {
            if(entry.getValue()==1){
                System.out.println(entry.getKey());
                break;
            }
        }

    }
}
