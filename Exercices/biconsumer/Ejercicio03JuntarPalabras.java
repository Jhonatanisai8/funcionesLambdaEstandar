package Exercices.biconsumer;

import java.util.function.BiConsumer;

/*
Implementa un BiConsumer<String, String> que reciba dos cadenas 
y las combine en una sola separadas por un guion, 
imprimiendo el resultado.
 */
public class Ejercicio03JuntarPalabras {
    public static void main(String[] args) {

        String cadena01 = "Hola";
        String cadena02 = "Mundo";
        BiConsumer<String, String> concatenar = (str1, str2) -> System.out.println(str1.concat("-").concat(str2));
        ;
        concatenar.accept(cadena01, cadena02);

    }
}
