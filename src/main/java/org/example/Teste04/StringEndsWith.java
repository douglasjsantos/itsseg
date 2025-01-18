package org.example.Teste04;

public class StringEndsWith {

    public static boolean solution(String str, String ending) {

        if (ending.isEmpty()) {
            return true;
        }

        if (ending.length() > str.length()) {
            return false;
        }

        String strEnding = str.substring(str.length() - ending.length());

        return strEnding.equals(ending);
    }
}
