package org.example.exercicios.Teste02;

public class ExercicioDois {


    public static String disemvowel(String str){

        return str.replaceAll("(?i)[aeiou]", "");
    }
}
