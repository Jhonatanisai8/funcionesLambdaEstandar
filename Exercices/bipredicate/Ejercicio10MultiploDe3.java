package Exercices.bipredicate;

import java.util.function.BiPredicate;

/*
Implementa un BiPredicate<Integer, Integer> que reciba 
dos números y determine si ambos son múltiplos de 3.
 */
public class Ejercicio10MultiploDe3 {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> ambosSonMultiplosDe3 = (t, u) -> t % 3 == 0 && u % 3 == 0;
        System.out.println("Son multiplos de 3: " + ambosSonMultiplosDe3.test(6, 12));
    }
}
