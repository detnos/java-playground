package com.galvanize.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileNamesQuestion {
    public static void main(String[] args) {
        String[] input = {"My Report.csv"};
        ArrayList<String> result = fileNames(input);

        System.out.println(result);

    }

    public static ArrayList<String> fileNames(String[] fileNames) {
        ArrayList<String> input = new ArrayList<>(Arrays.asList(fileNames));
        ArrayList<String> result = new ArrayList<>();

        char ch = '-';
        input.forEach(name -> result.add(name.replace(' ', ch)));

        return result;
    }

}
