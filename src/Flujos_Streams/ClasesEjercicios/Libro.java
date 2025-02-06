package Flujos_Streams.ClasesEjercicios;

public class Libro {
    private Persona2 autor;
    private String titulo;
    private int paginas;

    public Libro(Persona2 autor, String titulo, int paginas) {
        this.autor = autor;
        this.titulo = titulo;
        this.paginas = paginas;
    }

    public Persona2 getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public String getTitulo() {
        return titulo;
    }
}
