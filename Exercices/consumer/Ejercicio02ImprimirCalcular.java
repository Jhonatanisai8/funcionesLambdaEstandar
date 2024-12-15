package Exercices.consumer;

import java.util.function.Consumer;

/*
Diseña un Consumer<Integer> que reciba un número 
y calcule su cuadrado, imprimiendo el resultado.
 */
public class Ejercicio02ImprimirCalcular {

    public static void main(String[] args) {
        int numero = 6;
        Consumer<Integer> calcularCuadrado = n -> System.out.println("Resultado de "+n+"^2: "+(n*n));;
        calcularCuadrado.accept(numero);

    }
}