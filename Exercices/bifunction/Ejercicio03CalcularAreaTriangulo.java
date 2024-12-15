package Exercices.bifunction;

import java.util.function.BiFunction;

/*
Implementa un BiFunction<Double, Double, Double> que reciba 
dos números y devuelva el área de un rectángulo.
*/
public class Ejercicio03CalcularAreaTriangulo {
    public static void main(String[] args) {
        BiFunction<Double, Double, Double> calcularArea = (base, altura) -> base * altura;
        System.out.println("Area del rectangulo: " + calcularArea.apply(12.0, 3.0) + " cm2.");
    }
}