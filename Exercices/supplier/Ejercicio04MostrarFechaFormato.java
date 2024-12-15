package Exercices.supplier;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Supplier;

/*
Crea un Supplier<String> que devuelva la fecha actual en formato "dd/MM/yyyy" (sin usar Streams).
 */
public class Ejercicio04MostrarFechaFormato {
    public static void main(String[] args) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime fecha = LocalDateTime.now();
        Supplier<String> mostrarFecha = () -> df.format(fecha);

        System.out.println("Fecha: " + mostrarFecha.get());
    }
}
