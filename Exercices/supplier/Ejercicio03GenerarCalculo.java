package Exercices.supplier;

import java.util.function.Supplier;

/*Usa un Supplier<Double> que devuelva el resultado de un
 cálculo matemático sencillo, como 3.14 * 2.
 */
public class Ejercicio03GenerarCalculo {
    public static void main(String[] args) {
        Supplier<Double> calculoSencillo = () ->  3.14 * 2;
        System.out.println("Calculo : "+calculoSencillo.get());

    }
}
