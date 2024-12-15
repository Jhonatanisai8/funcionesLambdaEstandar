package Exercices.biconsumer;

import java.util.function.BiConsumer;

/*
Crea un BiConsumer<Double, Integer> que reciba un precio y una cantidad,
 y calcule el costo total mostrando el resultado.
 */
public class Ejercicio09CalcularPrecio {
    public static void main(String[] args) {
        BiConsumer<Double, Integer> calcular = (precio, cantidad) -> System.out.println(precio * cantidad);
        calcular.accept(4.5, 2);
    }
}
