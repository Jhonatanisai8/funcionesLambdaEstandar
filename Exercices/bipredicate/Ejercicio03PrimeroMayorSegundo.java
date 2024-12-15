package Exercices.bipredicate;

import java.util.function.BiPredicate;

/*
Implementa un BiPredicate<Double, Double> que reciba dos números 
y determine si el primero es mayor que el segundo.
 */
public class Ejercicio03PrimeroMayorSegundo {
    public static void main(String[] args) {
        BiPredicate<Double, Double> mayorNum = (a, b) -> a > b;
        System.out.println("El primero es mayor que el segundo?: " + mayorNum.test(2.2, 3.12));

    }
}
