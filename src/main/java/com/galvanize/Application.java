package com.galvanize;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Application {
    public static void main(String[] args) {
        int a = 101;
        System.out.println(a % 100);



        if (args.length > 0) {
            System.out.println(String.format("Hello %s", args[0]));
        } else System.out.println("Hello world");

        Object obj = new Foo();
        System.out.println(obj.toString());
    }

    // Implement the sortArray method below below
    public ArrayList<String> sortArray(String[] inputArray) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(inputArray));
        list.sort(null);
        return list;
    }

    public HashMap<Integer, String> genHashMap() {
        HashMap<Integer, String> myMap = new HashMap<>();
        myMap.put(747, "Airplane");
        myMap.put(10, "Laphroaig");
        return myMap;
    }

    /*
    * For the given method signature, write an implementation that generates a HashMap,
    * adds the following two items, and returns this new HashMap.

    The string, "Airplane", associated with key 747
    The string, "Laphroaig", associated with key 10
*
* */

}
