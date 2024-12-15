package Exercices.bipredicate;

import java.util.function.BiPredicate;

/*
Usa un BiPredicate<String, String> que reciba dos palabras y 
determine si una es el reverso de la otra (por ejemplo, "amor" y "roma").
 */
public class Ejercicio08PalabraReversa {
    public static void main(String[] args) {
        BiPredicate<String, String> sonIguales = (t, u) -> {
            StringBuilder st = new StringBuilder(t);
            st.reverse();
            return u.equalsIgnoreCase(st.toString());
        };
        System.out.println("Son iguales: "+sonIguales.test("amr", "roma"));
    }
}
