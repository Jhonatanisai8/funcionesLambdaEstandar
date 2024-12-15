package Exercices.consumer;

import java.util.function.Consumer;

/*
Crea un Consumer<int[]> que reciba un arreglo de enteros
y muestre todos sus elementos separados por comas.
 */
public class Ejercicio05MostrarArreglo {
    public static void main(String[] args) {
        int arreglo[] = {6,5,3,2,2,1};
        Consumer<int[]> mostrar = datos ->{
            for (int i = 0; i < datos.length; i++) {
                System.out.print(i+",");
            }
        };
        System.out.println("");
        mostrar.accept(arreglo);
    }
}
