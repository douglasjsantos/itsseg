package org.example.Teste03;

import java.util.ArrayList;

public class HighAndLow {

    public static String highAndLow(String numbers) {
        String[] numArray = numbers.split(" ");

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (String numStr : numArray) {
            int num = Integer.parseInt(numStr);
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        return max + " " + min;
    }
}
