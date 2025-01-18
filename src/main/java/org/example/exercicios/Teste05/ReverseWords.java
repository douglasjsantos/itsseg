package org.example.exercicios.Teste05;

public class ReverseWords {
    public static String reverseWords(String str) {
        StringBuilder result = new StringBuilder();
        String[] words = str.split("(?<=\\s)|(?=\\s)");

        for (String word : words) {
            if (!word.trim().isEmpty()) {
                result.append(new StringBuilder(word).reverse());
            } else {
                result.append(word);
            }
        }

        return result.toString();
    }
}
