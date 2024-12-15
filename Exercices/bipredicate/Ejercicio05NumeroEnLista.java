package Exercices.bipredicate;

import java.util.List;
import java.util.function.BiPredicate;

/*
Crea un BiPredicate<Integer, List<Integer>> que reciba un 
número y una lista, y determine si el número está en la lista.
 */
public class Ejercicio05NumeroEnLista {
    public static void main(String[] args) {
        List<Integer> valores = List.of(1, 2, 3, 4, 5, 6, 7);
        int numero = 111;
        BiPredicate<List<Integer>, Integer> encontrado = (lista, valor) -> lista.contains(valor);
        System.out.println(valores);
        System.out.println("Esta en la lista en valor " + numero + "?: " + encontrado.test(valores, numero));
    }
}
