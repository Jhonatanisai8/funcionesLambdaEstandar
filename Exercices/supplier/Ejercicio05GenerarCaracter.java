package Exercices.supplier;

import java.util.Random;
import java.util.function.Supplier;

/*
Diseña un Supplier<Character> que genere un carácter aleatorio del abecedario.
 */
public class Ejercicio05GenerarCaracter {
    public static void main(String[] args) {
        String letras = "qwertyuiopasdfghjklñzxcvbnm";
        Random numero = new Random();
        Supplier<Character> generarCaracter = () -> letras.charAt(numero.nextInt(letras.length()));

        System.out.println("Caracter generado : "+generarCaracter.get());
    }
}
