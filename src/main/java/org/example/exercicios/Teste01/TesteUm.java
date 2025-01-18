package org.example.exercicios.Teste01;

import java.text.Normalizer;
import java.util.HashSet;

public class TesteUm {

    public boolean check(String phrase) {

        phrase = Normalizer.normalize(phrase, Normalizer.Form.NFD);
        phrase = phrase.replaceAll("[^a-zA-Z]", "").toLowerCase(); // Remove tudo que não for letra

        HashSet<Character> letters = new HashSet<>();

        for (char c : phrase.toCharArray()) {
            letters.add(c);
        }

        return letters.size() == 26;
    }

}
