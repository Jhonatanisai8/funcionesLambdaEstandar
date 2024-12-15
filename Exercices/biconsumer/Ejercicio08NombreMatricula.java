package Exercices.biconsumer;

import java.util.List;
import java.util.function.BiConsumer;

/*
Usa un BiConsumer<String, List<String>> que reciba un nombre y una lista de cursos,
y muestre un mensaje como: "Jose está matriculado en: [Curso1, Curso2]".
 */
public class Ejercicio08NombreMatricula {
    public static void main(String[] args) {
        List<String> cursitos = List.of("Matematicas", "Comunicacion", "CTA");
        BiConsumer<String, List<String>> mostar = Ejercicio08NombreMatricula::mostarLista;
        mostar.accept("Jose", cursitos);
    }

    public static void mostarLista(String nombre, List<String> cursos) {
        System.out.println("Dani esta matriculado: " + cursos);
    }
}
