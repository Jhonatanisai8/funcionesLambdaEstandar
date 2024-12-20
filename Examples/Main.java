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
        System.out.println("Tamanio de la palabra: " + longitudPalabra.apply("Hola"));
        Function<Integer, Boolean> esMayorEdad = edad -> edad >= 18;
        System.out.println("Es mayor de edad: " + esMayorEdad.apply(12));
        System.out.println("---------------------------");

        /* EJEMPLO DE TIPO CONSUMER <T> */
        System.out.println("\nEJEMPLO DE CONSUMER <T> ");
        Consumer<String> imprimir = texto -> System.out.println(texto);
        imprimir.accept("Hola Lambda");
        System.out.println("---------------------------");

        /* EJEMPLO DE TIPO SUPPLIER<T> */
        System.out.println("\nEJEMPLO DE  SUPPLIER<T>");
        Supplier<Double> aleatorio = () -> Math.random();
        imprimir.accept("Numero Generado : " + aleatorio.get());
        System.out.println("---------------------------");

        /* EJEMPLO DE TIPO BICONSUMER<T,U> */
        System.out.println("\nEJEMPLO DE BICONSUMER<T,U>");
        BiConsumer<String, Integer> mostrar = (nombre, edad) -> System.out
                .println(nombre + " tiene " + edad + " años.");
        mostrar.accept("Dani", 12);
        System.out.println("---------------------------");

        /* EJEMPLO DE TIPO BIFUNCTION <T,U,R> */
        System.out.println("\nEJEMPLO DE  BIFUNCTION <T,U,R>");
        BiFunction<Integer, Integer, String> sumarYConvertir = (a, b) -> "Resultado: " + (a + b);
        System.out.println(sumarYConvertir.apply(12, 6));
        System.out.println("---------------------------");

        /* EJEMPLO DE TIPO BIPREDICATE <T,U> */
        System.out.println("\nEJEMPLO DE  BIPREDICATE <T,U>");
        BiPredicate<Integer,Integer> mayorQue = (a,b) -> a > b;
        System.out.println("3 > 4 : "+mayorQue.test(3, 4));
        System.out.println("---------------------------");

    }

}