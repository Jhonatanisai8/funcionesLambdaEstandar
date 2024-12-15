package Exercices.bifunction;

import java.util.function.BiFunction;

/*
Diseña un BiFunction<String, String, Integer> que reciba 
dos cadenas y devuelva la suma de sus longitudes.
 */
public class Ejercicio02SumaLongitudes {
    public static void main(String[] args) {
        String cadena01 = "Hola";
        String cadena02 = "Lambda";
        BiFunction<String, String, Integer> sumaLongitudes = (str1, str2) -> str1.length() + str2.length();
        System.out.println("Suma de Longitudes de las palabras de " + cadena01 + " y " + cadena02 + " es: "
                + sumaLongitudes.apply(cadena01, cadena02));
    }
}
