package Exercices.bifunction;

import java.util.List;
import java.util.function.BiFunction;

/*
Crea un BiFunction<List<Integer>, Integer, Boolean> que reciba una 
lista de números y un número, y devuelva true si el 
número está en la lista.
*/
public class Ejercicio05NumeroEnLista {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(4, 5, 6, 2, 2, 2);
        BiFunction<List<Integer>, Integer, Boolean> estaEnLista = (lista, num) -> lista.contains(num);
        System.out.println(numeros);
        System.out.println("¿Esta en lista el numero  5 ?: " + estaEnLista.apply(numeros, 5));
    }
}
