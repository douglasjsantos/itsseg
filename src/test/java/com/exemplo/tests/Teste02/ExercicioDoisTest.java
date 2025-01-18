package com.exemplo.tests.Teste02;

import org.example.exercicios.Teste02.ExercicioDois;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExercicioDoisTest {

    @Test
    public void test1() {
        assertEquals("Ths wbst s fr lsrs LL!", ExercicioDois.disemvowel("This website is for losers LOL!"));

        assertEquals("N ffns bt, Yr wrtng s mng th wrst 'v vr rd", ExercicioDois.disemvowel("No offense but, Your writing is among the worst I've ever read"));

        assertEquals("Wht r y,  cmmnst?", ExercicioDois.disemvowel("What are you, a communist?"));
    }
}