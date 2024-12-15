package Exercices.supplier;

import java.util.Random;
import java.util.function.Supplier;

/*
Implementa un Supplier<String> que devuelva un saludo 
aleatorio entre: "Hola", "Buenos días", "¿Qué tal?".
 */
public class Ejercicio02ImprimirSaludo {
    public static void main(String[] args) {
        Random random  = new Random();
        Supplier<Integer> generarNumero1Al3 = () -> random.nextInt(3);
        Supplier<String> generarSaludo = () -> {
            //arreglo para los saludos 
            String arregloSaludos [] = {"Hola","Buenos dias","¿Que tal?"};
            return arregloSaludos[generarNumero1Al3.get()];
        };

        System.out.println(generarSaludo.get());
    }
}
