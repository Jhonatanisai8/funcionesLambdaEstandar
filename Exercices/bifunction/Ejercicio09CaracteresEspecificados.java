package Exercices.bifunction;
/*
Usa un BiFunction<String, Integer, String> que reciba un 
texto y un número, y devuelva el texto truncado hasta el 
número de caracteres especificado.
 */

import java.util.function.BiFunction;

public class Ejercicio09CaracteresEspecificados {
    public static void main(String[] args) {
        BiFunction<String, Integer, String> devolver = (t, u) -> t.substring(0, u);
        System.out.println(devolver.apply("holaassss", 2));
    }
}
