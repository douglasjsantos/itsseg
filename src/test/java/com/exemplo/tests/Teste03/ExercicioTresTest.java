package com.exemplo.tests.Teste03;

import org.example.exercicios.Teste03.HighAndLow;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExercicioTresTest {


    @Test
    public void testHighAndLow() {

        assertEquals("5 -3", HighAndLow.highAndLow("1 2 3 4 5 -3"));

        assertEquals("10 1", HighAndLow.highAndLow("1 2 3 10"));

        assertEquals("7 7", HighAndLow.highAndLow("7"));

        assertEquals("3 3", HighAndLow.highAndLow("3 3 3 3"));

        assertEquals("-1 -10", HighAndLow.highAndLow("-10 -5 -3 -1"));

        assertEquals("7 0", HighAndLow.highAndLow("0 3 7 5 1"));
    }
}

