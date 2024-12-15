package Exercices.predicate;

import java.util.function.Predicate;

/*Crea un Predicate<String> que verifique si una
 palabra contiene la letra 'a'.*/
public class Ejercicio02ContieneLetraA {
    public static void main(String[] args) {
        String texto = "hol";
        Predicate<String> tieneLetraA = palabra -> palabra.contains("a");
        if (tieneLetraA.test(texto)) {
            System.out.println("El texto : "+texto+" tiene el caracter a");
        } else {
            System.out.println("El texto : "+texto+" no tiene el caracter a");
        }
    }
}
