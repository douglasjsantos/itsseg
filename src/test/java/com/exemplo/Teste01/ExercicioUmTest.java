package com.exemplo.Teste01;


import org.example.Teste01.TesteUm;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ExercicioUmTest {

    @Test
    public void test1() {
        String pangram1 = "Quero faxina nas locadoras de video: jogue blitz com whisky PM";
        TesteUm pc = new TesteUm();
        assertEquals(true, pc.check(pangram1));
    }

    @Test
    public void test2() {
        String pangram2 = "You shall not pass!";
        TesteUm pc = new TesteUm();
        assertEquals(false, pc.check(pangram2));
    }
}
