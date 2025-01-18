package com.exemplo.tests.Teste06;

import org.example.exercicios.Teste06.SumDigits;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExercicioSeisTest {


    @Test
    public void test1() {
        assertEquals(72, SumDigits.closingSum(2520));
    }

    @Test
    public void test2() {
        assertEquals(13, SumDigits.closingSum(121));
    }

    @Test
    public void test3() {
        assertEquals(22, SumDigits.closingSum(1039));
    }

    @Test
    public void test4() {
        assertEquals(100, SumDigits.closingSum(22225555));
    }




}
