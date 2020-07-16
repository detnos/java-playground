package com.galvanize.classes;

import java.util.HashMap;

public class CharacterFrequencyApp {
    public static void main(String[] args) {
        //given string "supercalifragilisticexpialidocious", count number of character occurances
        HashMap<Character, Integer> result = characterFrequency("supercalifragilisticexpialidocious");

        System.out.println(result);
    }

    public static HashMap<Character, Integer> characterFrequency(String str) {
        /*
        1. Setup your accumulator with an initial state, blank, or zero
        2. Setup your return of that accumulator
        3. Given input data loop or .reduce() to incrementally accumulate results (tally)
        4. Return tallied answer
         */

        HashMap<Character, Integer> map = new HashMap<>();

        //do our work, looping over the string
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            //if null
//            if (map.containsKey(ch)) {
//                //then increment
//                map.put(ch, map.get(ch)+ 1);
//            } else {
//                map.put(ch, 1);
//            }
//        }

        //instructor alternative
        for (char ch: str.toCharArray()) {
            int count = 1;
            if (map.containsKey(ch))   {
                count = map.get(ch) + 1;
            }
            map.put(ch, count);
        }

        return map;
    }
}
