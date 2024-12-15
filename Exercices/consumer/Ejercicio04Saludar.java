package Exercices.consumer;

import java.util.function.Consumer;

/*
Usa un Consumer<String> que reciba un nombre y salude al usuario 
con un mensaje personalizado, por ejemplo: "Hola, Jhonatan".
 */
public class Ejercicio04Saludar {
    public static void main(String[] args) {
        String nombre = "dani";
        Consumer<String> saludar = nom -> System.out.println("Hola "+nom);;
        saludar.accept(nombre);
    }
}
