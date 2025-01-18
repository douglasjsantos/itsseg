package com.exemplo.tests.Teste05;

import org.example.exercicios.Teste05.ReverseWords;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExercicioCincoTest {

    @Test
    public void test1() {
        assertEquals("sihT si na !elpmaxe", ReverseWords.reverseWords("This is an example!"));

        assertEquals("elbuod  secaps", ReverseWords.reverseWords("double  spaces"));


    }
}
