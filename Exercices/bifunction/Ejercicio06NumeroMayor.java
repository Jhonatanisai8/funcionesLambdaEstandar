package Exercices.bifunction;

import java.util.function.BiFunction;

/*
Diseña un BiFunction<Integer, Integer, Integer> que 
reciba dos números y devuelva el mayor de ellos.
 */
public class Ejercicio06NumeroMayor {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> mayor = Math::max;
        System.out.println("Numero mayor: " + mayor.apply(4, 2));
    }
}
