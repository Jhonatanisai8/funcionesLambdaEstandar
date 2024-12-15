package Exercices.predicate;

import java.util.function.Predicate;

/*
Diseña un Predicate<Character> que determine si un 
carácter es una vocal (a, e, i, o, u).
 */
public class Ejercicio05TieneCaracter {
    public static void main(String[] args) {
        char caracter = 'A';
        Predicate<Character> esVocal = letra -> "aeiuo".contains(String.valueOf(letra).toLowerCase());
        System.out.println(caracter + " es una vocal : "+esVocal.test(caracter));
    }
}
