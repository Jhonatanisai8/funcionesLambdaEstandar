package Exercices.bipredicate;

import java.util.function.BiPredicate;

/*
Diseña un BiPredicate<Integer, Integer> que reciba dos números 
y determine si uno es divisible por el otro.
*/
public class Ejercicio07NumeroDivisible {
    public static void main(String[] args) {
        BiPredicate<Integer,Integer> esDivisible = (t, u) ->  t % u == 0;
        System.out.println("Es divible?: "+esDivisible.test(12, 3));
    }
}
