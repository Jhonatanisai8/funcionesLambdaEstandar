package Exercices.bipredicate;

import java.util.function.BiPredicate;

/*
Usa un BiPredicate<String, Character> que reciba una cadena 
y un carácter, y determine si la cadena contiene ese carácter.
 */
public class Ejercicio04CaracterEnCadena {
    public static void main(String[] args) {
        BiPredicate<String, Character> caracterEnCadena = (a, b) -> a.toLowerCase()
                .contains(String.valueOf(b).toLowerCase());
        String cadena = "Hola Mundo";
        char car = 's';
        System.out.println(cadena + " contiene " + car + "?: " + caracterEnCadena.test(cadena, car));

    }
}
