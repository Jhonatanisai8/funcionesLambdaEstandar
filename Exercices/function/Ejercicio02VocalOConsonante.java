package Exercices.function;

import java.util.function.Function;

/*
Usa un Function<Character, String> que reciba una letra y 
devuelva "Vocal" o "Consonante" según corresponda.
 */
public class Ejercicio02VocalOConsonante {
    public static void main(String[] args) {
        String vocales = "aeiou";
        Function<Character, String> vocalConsonte = c -> {
            String mensaje = "Es Consonante";
            if (vocales.contains(String.valueOf(c))) {
                mensaje = "Es vocal";
            }
            return mensaje;
        };

        char letra = 'a';
        System.out.println(letra + ": " + vocalConsonte.apply(letra));
    }
}
