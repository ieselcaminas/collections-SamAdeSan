package Interfaces_Comparables.ClasesEjercicios;

public class Pais implements Comparable<Pais>{
    private String nombre;
    private int analfabetos;

    public Pais(String nombre, int analfabetos) {
        this.nombre = nombre;
        this.analfabetos = analfabetos;
    }
    public int getAnalfabetos() {
        return analfabetos;
    }
    public void setAnalfabetos(int analfabetos) {
        this.analfabetos = analfabetos;
    }
    public String setNombre() {
        return nombre;
    }
    @Override
    public String toString() {
        return this.nombre + " " + this.analfabetos;
    }
    @Override
    public int compareTo(Pais other) {
        return this.nombre.compareTo(other.nombre);
    }
}
