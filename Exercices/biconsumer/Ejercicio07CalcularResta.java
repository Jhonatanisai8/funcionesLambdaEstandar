package Exercices.biconsumer;

import java.util.function.BiConsumer;

/*
Diseña un BiConsumer<Integer, Integer> que reciba dos números 
y calcule e imprima su diferencia (resta).
 */
public class Ejercicio07CalcularResta {
    public static void main(String[] args) {
        BiConsumer<Integer, Integer> resta = Ejercicio07CalcularResta::calcularResta;
        resta.accept(10, 5);
    }

    private static void calcularResta(int n1, int n2) {
        System.out.println("La resta es: " + (n1 - n2));
    }
}
