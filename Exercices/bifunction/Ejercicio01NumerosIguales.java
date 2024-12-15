package Exercices.bifunction;

import java.util.function.BiFunction;

/*
Crea un BiFunction<Integer, Integer, String> que reciba dos números 
y devuelva un texto indicando si son iguales o cuál es mayor.
 */
public class Ejercicio01NumerosIguales {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, String> mostrar = (n1, n2) -> {
            String mensaje = "Son Iguales";
            if (n1 > n2) {
                mensaje = "Numero mayor : " + n1;
            } else if (n2 > n1) {
                mensaje = "Numero mayor : " + n2;
            }
            return mensaje;
        };

        System.out.println(mostrar.apply(12, 122));
    }
}
