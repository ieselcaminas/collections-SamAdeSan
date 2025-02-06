package Flujos_Streams.Teoria;

import Flujos_Streams.ClasesEjercicios.Libro;
import Flujos_Streams.ClasesEjercicios.Persona2;

import java.util.ArrayList;
import java.util.List;

public class LibroListaMain {
    public static void main(String[] args) {
        List<Libro> libros = new ArrayList<>();

        Persona2 autor = new Persona2("Miguel de cervantes", 1547);
        Persona2 autor2 = new Persona2("J. K. Rowling", 1965);
        Persona2 autor3 = new Persona2("J. R. R. Tolkien", 1954);

        Libro libro1 = new Libro(autor, "Don Quijote de la Mancha", 642);
        Libro libro2 = new Libro(autor2, "Harry Potter y la piedra filosofal", 256);
        Libro libro3 = new Libro(autor3, "El señor de los anillos", 174);

        libros.stream()
                .filter(book -> book.getTitulo().contains("Potter"))
                .map(book -> book.getAutor())
                .forEach(System.out::println);
    }
}
