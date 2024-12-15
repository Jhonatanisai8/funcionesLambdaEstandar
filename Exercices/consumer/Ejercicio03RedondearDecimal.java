package Exercices.consumer;

import java.util.function.Consumer;

/*
Implementa un Consumer<Double> que reciba un número 
y lo redondee a dos decimales antes de mostrarlo.
 */
public class Ejercicio03RedondearDecimal {
    public static void main(String[] args) {
        double decimal = 23.12233;
        Consumer<Double> redondear = numero -> {
            double resultado = Math.round(numero * 100) / 100.0;
            System.out.println("Numero: "+resultado);
        };
        redondear.accept(decimal);
    }
}
