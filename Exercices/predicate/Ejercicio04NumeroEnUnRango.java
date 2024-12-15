package Exercices.predicate;

import java.util.function.Predicate;

/*
Usa un Predicate<Integer> que verifique si
 un número está dentro del rango [10, 50].
 */
public class Ejercicio04NumeroEnUnRango {
    public static void main(String[] args) {
        int numeroDado = 229;
        Predicate<Integer> estaEnRango = numer -> (numer >= 10 && numer <= 50);
        System.out.println("El numero : "+numeroDado+ " es el rango de 10 y 50: "+estaEnRango.test(numeroDado));

    }
}
