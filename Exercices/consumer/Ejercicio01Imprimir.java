package Exercices.consumer;
/*
Crea un Consumer<String> que reciba un texto y lo 
imprima entre asteriscos, por ejemplo: *Hola*.
 */

import java.util.function.Consumer;

public class Ejercicio01Imprimir {
    public static void main(String[] args) {
        String texto = "hola";
        Consumer<String> imprimirEntreAsteriscos = sr -> System.out.println("*" + sr + "*");
        imprimirEntreAsteriscos.accept(texto);
    }
}
