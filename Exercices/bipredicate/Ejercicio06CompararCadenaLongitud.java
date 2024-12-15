package Exercices.bipredicate;

import java.util.function.BiPredicate;

/*
Implementa un BiPredicate<String, Integer> que reciba una cadena y un número, 
y verifique si la cadena contiene exactamente ese número de palabras.
*/
public class Ejercicio06CompararCadenaLongitud {

    public static void main(String[] args) {
        BiPredicate<String, Integer> sonIguales = (t, u) -> t.length() == u;
        System.out.println("La cadena es de longitud al numero ingresado?: " + sonIguales.test("hola", 4));
    }
}
