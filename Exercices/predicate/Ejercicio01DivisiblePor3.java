package Exercices.predicate;

import java.util.function.Predicate;

/*
Escribe un programa que use un Predicate<Integer> para 
determinar si un número es divisible por 3.
 */
public class Ejercicio01DivisiblePor3 {
    public static void main(String[] args) {
        int numero = 11;
        //funcion 
        Predicate<Integer> esDisiblePor3 = num -> num % 3 == 0;
        if (esDisiblePor3.test(numero)) {
            System.out.println("El numero: "+numero+" Es divible por 3");
        } else {
            System.out.println("El numero: "+numero+" no es divible por 3");
        }
    }
}
