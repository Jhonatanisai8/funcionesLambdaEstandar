package Exercices.biconsumer;

import java.util.function.BiConsumer;

/*
Crea un BiConsumer<String, Integer> que reciba un nombre y un número, 
y repita el nombre tantas veces como indique el número.
 */
public class Ejercicio05MostrarNumeros {
    public static void main(String[] args) {
        String nombre = "Dani";
        int veces = 5;
        BiConsumer<String, Integer> mostrarVeces = (n, v) -> System.out.println("\n"+n.repeat(v)+",");
        mostrarVeces.accept(nombre, veces);
    }
}
