package Exercices.biconsumer;

import java.util.function.BiConsumer;

/*
Usa un BiConsumer<Integer, Integer> que reciba dos 
números enteros y muestre cuál es el mayor.
 */
public class Ejercicio04NumeroMayor {
    public static void main(String[] args) {
        int num1 = 1234;
        int num2 = 125;

        BiConsumer<Integer, Integer> mostrarMayor = (n1, n2) -> System.out.println("Numero Mayor: " + Math.max(n1, n2));

        mostrarMayor.accept(num1, num2);
    }
}
