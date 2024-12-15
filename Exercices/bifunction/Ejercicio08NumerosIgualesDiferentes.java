package Exercices.bifunction;

import java.util.function.BiFunction;

/*
Implementa un BiFunction<Double, Double, String>
 que reciba dos números y devuelva un mensaje indicando 
 si son iguales o diferentes.
 */
public class Ejercicio08NumerosIgualesDiferentes {
    public static void main(String[] args) {
        BiFunction<Double, Double, String> igualesDiferentes = Ejercicio08NumerosIgualesDiferentes::verificar;
        System.out.println(igualesDiferentes.apply(12.4, 12.4));

    }

    public static String verificar(Double n1, Double n2) {
        String mensaje;
        if (n1.equals(n2)) {
            mensaje = "Son iguales";
        } else {
            mensaje = "Son Diferentes";
        }
        return mensaje;
    }
}
