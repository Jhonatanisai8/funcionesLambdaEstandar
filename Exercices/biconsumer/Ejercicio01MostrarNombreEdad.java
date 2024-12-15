package Exercices.biconsumer;

import java.util.function.BiConsumer;

/*
Crea un BiConsumer<String, Integer> que reciba un nombre y una edad,
y muestre un mensaje como: "Jhonatan tiene 18 años.".
 */
public class Ejercicio01MostrarNombreEdad {
    public static void main(String[] args) {
        String nombre = "Dani";
        int edad = 12;
        BiConsumer<String, Integer> mostrarSaludo = (n, e) -> System.out.println(n + " tiene " + e + " años.");
        mostrarSaludo.accept(nombre, edad);
    }
}
