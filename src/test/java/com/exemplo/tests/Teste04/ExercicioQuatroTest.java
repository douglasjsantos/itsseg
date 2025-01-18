package com.exemplo.tests.Teste04;

import org.example.exercicios.Teste04.StringEndsWith;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExercicioQuatroTest {

    @Test
    public void testSolution(){

        assertEquals(true, StringEndsWith.solution("abc", "bc"));

        assertEquals(true, StringEndsWith.solution("hello world", "world"));

        assertEquals(true, StringEndsWith.solution("Douglas Santos", "Santos"));
    }
}
