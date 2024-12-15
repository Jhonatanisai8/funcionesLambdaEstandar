package Exercices.bifunction;

import java.util.function.BiFunction;

/*
Crea un BiFunction<String, Integer, Boolean> que reciba una 
cadena y un número, y determine si la longitud de la cadena 
es igual al número.
 */
public class Ejercicio07CadenaNumero {
    public static void main(String[] args) {
        BiFunction<String, Integer, Boolean> esIgual = (cadena, numero) -> cadena.length() == numero;
        System.out.println("La longitud de la cadena es igual al numero: " + esIgual.apply("hola", 4));
    }
}
