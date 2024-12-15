package Exercices.biconsumer;

import java.util.function.BiConsumer;

/*
Implementa un BiConsumer<Character, Integer> que reciba un carácter y un número, y muestre ese carácter 
repetido tantas veces como indique el número.
 */
public class Ejercicio10RepetirCaracter {
    public static void main(String[] args) {
        BiConsumer<Character, Integer> mostrar = Ejercicio10RepetirCaracter::repetirCaracter;
        mostrar.accept('a', 3);
    }

    public static void repetirCaracter(char c, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(c);
        }
    }
}
