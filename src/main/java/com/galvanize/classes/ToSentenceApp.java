package com.galvanize.classes;

public class ToSentenceApp {
    public static void main(String[] args) {
        String[] input = {"hi", "you"};
        String result = toSentence(input);

        System.out.println(result);
    }

    public static String toSentence(String[] input) {
        String result = "";
        StringBuilder z = new StringBuilder(100);
        if (input.length == 0 || input[0] == "") {
            return result;
        }

        if (input.length == 1) {
            result = input[0];
            return result;
        }

        for (int i = 0; i < input.length; i++) {
            if (input.length == 2) {
                z.append(input[0] + " and " + input[1]);
                break;
            } else if (i == input.length - 1) {
                z.append(" and " + input[i]);
            } else if (i == input.length - 2) {
                z.append(input[i]);
            } else {
                z.append(input[i] + ", ");
            }
        }

        result = z.toString();
        return result;
    }
}
