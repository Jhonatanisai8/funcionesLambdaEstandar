package Exercices.supplier;

import java.util.Random;
import java.util.function.Supplier;

/*
Diseña un Supplier<Integer> que devuelva un 
número aleatorio entre 1 y 50.
 */
public class Ejercicio01NumeroAleatorio {
    public static void main(String[] args) {
        Random random = new Random();
        Supplier<Integer> generarNumero = () -> random.nextInt(50);
        System.out.println("Numero generado: "+generarNumero.get());
    }
}
