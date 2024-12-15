package Exercices.function;

import java.util.function.Function;

/*
Crea un Function<String, Integer> que reciba 
una palabra y devuelva su longitud
 */
public class Ejercicio01LongitudPalabra {
    public static void main(String[] args) {
        String cadena = "";
        Function<String,Integer> devolverLongitud  = palabra -> palabra.length();
        System.out.println("Lontitug de la "+cadena+" :"+devolverLongitud.apply(cadena));
    }    
}
