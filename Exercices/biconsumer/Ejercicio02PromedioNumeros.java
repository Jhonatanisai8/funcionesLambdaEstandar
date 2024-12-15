package Exercices.biconsumer;

import java.util.function.BiConsumer;

/*
Diseña un BiConsumer<Double, Double> que reciba dos números 
y calcule su promedio, mostrando el resultado.
 */
public class Ejercicio02PromedioNumeros {
    public static void main(String[] args) {

        BiConsumer<Double, Double> calcularPromedio = (n1, n2) -> System.out
                .println("Promedio de " + n1 + " , " + n2 + " es: " + (n1 + n2) / 2);

        calcularPromedio.accept(12.3, 45.3);

    }
}
