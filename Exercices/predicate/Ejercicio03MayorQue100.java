package Exercices.predicate;

import java.util.function.Predicate;

/*
Implementa un Predicate<Double> que evalúe si un número es mayor a 100.5.
 */
public class Ejercicio03MayorQue100 {
    public static void main(String[] args) {
        double n = 0;
        Predicate<Double> mayorQue = numero -> numero > 100.5;

        System.out.println(n+" > "+100.5 +" : "+mayorQue.test(n));
    }
}
