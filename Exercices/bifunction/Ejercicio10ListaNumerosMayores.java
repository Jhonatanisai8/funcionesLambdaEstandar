package Exercices.bifunction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

/* 
Diseña un BiFunction<List<Integer>, Integer, List<Integer>> que
 reciba una lista de números y un valor entero, y devuelva una 
 nueva lista con los elementos mayores al valor proporcionado.
*/
public class Ejercicio10ListaNumerosMayores {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        BiFunction<List<Integer>, Integer, List<Integer>> obtener = Ejercicio10ListaNumerosMayores::obtenerValores;
        System.out.println(obtener.apply(numeros, 6));
    }

    public static List<Integer> obtenerValores(List<Integer> valores, int numero) {
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < valores.size(); i++) {
            if (valores.get(i) > numero) {
                lista.add(valores.get(i));
            }
        }
        return lista;
    }

}
