package Interfaces_Comparables.ClasesEjercicios;

public class Miembro implements Comparable<Miembro>{
    private String nombre;
    private int altura;

    public Miembro(String name, int height) {
        this.nombre = name;
        this.altura = height;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getAltura() {
        return this.altura;
    }

    @Override
    public String toString() {
        return this.getNombre() + " (" + this.getAltura() + ")";
    }

    @Override
    public int compareTo(Miembro other) {
        if (this.altura == other.getAltura()) {
            return 0;
        } else if (this.altura > other.getAltura()) {
            return 1;
        } else {
            return -1;
        }
    }
}
