package Exercices.bipredicate;

import java.util.List;
import java.util.function.BiPredicate;

/*
Crea un BiPredicate<List<String>, String> que reciba una lista de 
cadenas y una palabra, y determine si la lista contiene esa palabra.
 */
public class Ejercicio09PalabraEnLista {
    public static void main(String[] args) {

        BiPredicate<List<String>, String> contienePalabra = (t, u) -> t.contains(u.toLowerCase());
        List<String> lista = List.of("hola", "mundo", "como");
        System.out.println("LA PALABRA ESTA EN LISTA: "+contienePalabra.test(lista, "hol"));
    }
}
