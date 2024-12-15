package Examples;

import java.util.function.*;

public class Main {

    public static void main(String[] args) {
        /* EJEMPLO DE PREDICATE */
        System.out.println("\nEJEMPLO DE PREDICATE <T> ");
        // ejemplo numero par o impar
        Predicate<Integer> esPar = numero -> numero % 2 == 0;
        // mostramos el resultado
        System.out.println("Es Par: " + esPar.test(12));
        Predicate<Integer> mayorEdad = edad -> edad >= 18;
        System.out.println("Es mayor edad: " + mayorEdad.test(13));
        System.out.println("---------------------------");

        /* EJEMPLO DE FUNCTION <T,R> */
        System.out.println("\nEJEMPLO DE FUNCTION <T,R> ");
        Function<String, Integer> longitudPalabra = letra -> letra.length();
        System.out.println("Tamanio de la palabra: "+longitudPalabra.apply("Hola"));
        Function<Integer,Boolean> esMayorEdad = edad -> edad >= 18;
        System.out.println("Es mayor de edad: "+esMayorEdad.apply(12));
        System.out.println("---------------------------");

    }

}