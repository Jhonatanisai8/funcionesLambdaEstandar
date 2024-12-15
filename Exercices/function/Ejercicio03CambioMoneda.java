package Exercices.function;

import java.util.function.Function;

/*
Implementa un Function<Double, Double> que reciba un monto 
en dólares y lo convierta a soles (usando un tipo de cambio ficticio).
 */
public class Ejercicio03CambioMoneda {
    public static void main(String[] args) {
        double dolares = 200;
        Function<Double,Double> cambiarMoneda = dol -> dol * 3.739;
        System.out.println(dolares + "$ en soles es S/."+cambiarMoneda.apply(dolares));
    }
}
