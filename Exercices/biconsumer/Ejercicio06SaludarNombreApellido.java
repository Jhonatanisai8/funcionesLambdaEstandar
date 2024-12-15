package Exercices.biconsumer;
/*
Implementa un BiConsumer<String, String> que reciba un nombre y un apellido, 
y los imprima en formato: "Apellido, Nombre".
 */

import java.util.function.BiConsumer;

public class Ejercicio06SaludarNombreApellido {
    public static void main(String[] args) {
        BiConsumer<String, String> mostarSaludo = (nombre, apellido) -> System.out
                .println(nombre.concat(" " + apellido));
        mostarSaludo.accept("Dani", "Palacios");
    }
}