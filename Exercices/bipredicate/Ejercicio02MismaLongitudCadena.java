package Exercices.bipredicate;

import java.util.function.BiPredicate;

/*
Diseña un BiPredicate<String, String> que reciba dos 
cadenas y verifique si tienen la misma longitud.
 */
public class Ejercicio02MismaLongitudCadena {
    public static void main(String[] args) {
        BiPredicate<String, String> mismaLong = (a, b) -> a.length() == b.length();
        System.out.println("¿Las cadenas tienen la misma longitud?: " + mismaLong.test("hola", "ola"));
    }
}
