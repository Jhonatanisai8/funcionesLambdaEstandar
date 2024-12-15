package Exercices.bifunction;
/*
Usa un BiFunction<String, Integer, String> que reciba un 
nombre y una edad, y devuelva un mensaje como: 
"Hola, Dani. Tienes 18 años.".
 */

import java.util.function.BiFunction;

public class Ejercicio04Saludar {
    public static void main(String[] args) {
        BiFunction<String, Integer, String> saludar = (nombre, edad) -> "Hola " + nombre + " tienes. " + edad
                + " años.";
        System.out.println(saludar.apply("Dani", 12));
    }
}
