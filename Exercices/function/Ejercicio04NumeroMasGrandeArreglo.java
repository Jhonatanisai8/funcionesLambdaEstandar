package Exercices.function;

import java.util.function.Function;

/*
Crea un Function<int[], Integer> que reciba un arreglo 
de enteros y devuelva el número más grande.
 */
public class Ejercicio04NumeroMasGrandeArreglo {
    public static void main(String[] args) {
        int arreglo[] = { 3, 4, 5, 23, 4 };
        Function<int[], Integer> buscarNumeroMayor = numeros -> {
            int mayor = Integer.MIN_VALUE;
            for (int i = 0; i < numeros.length; i++) {
                if (mayor < numeros[i]) {
                    mayor = numeros[i];
                }
            }
            return mayor;
        };

        System.out.println("Numero mayor del arreglo: "+buscarNumeroMayor.apply(arreglo));
    }
}
