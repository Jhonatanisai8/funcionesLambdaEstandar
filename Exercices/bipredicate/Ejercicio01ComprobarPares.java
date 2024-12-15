package Exercices.bipredicate;

import java.util.function.BiPredicate;

/*
Crea un BiPredicate<Integer, Integer> que reciba dos números
y determine si ambos son pares.
 */
public class Ejercicio01ComprobarPares {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> sonIguales = (a, b) -> a == b;
        System.out.println("¿Son iguales los numeros?: " + sonIguales.test(12, 1));
    }
}
