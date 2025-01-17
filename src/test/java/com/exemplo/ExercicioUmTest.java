package com.exemplo;

import org.example.Teste01.TesteUm;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExercicioUmTest {

    @Test
    public void test1() {
        String pangram1 = "Grave e cabisbaixo, o filho justo zelava pela querida mãe doente";
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
