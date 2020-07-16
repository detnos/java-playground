package com.galvanize.classes;

import java.util.Arrays;

public class BoxingExamples {
    public static void main(String[] args) {
        // populate new int[]
        int[] ints = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        // initialize new Integer[] to size of ints.length
        Integer[] integers = new Integer[ints.length];

        // initialize our index for our integers variable
        int i = 0;

        // for every value in our ints array, assign the wrapped primitive value and increase our index by 1
        for (int value : ints) {
            integers[i++] = Integer.valueOf(value);
        }

    // Java 8 it can be done in a single line
        // Integer[] integers = Arrays.stream(ints).boxed().toArray(Integer[]::new);
    }
}
