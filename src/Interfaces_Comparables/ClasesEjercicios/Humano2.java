package Interfaces_Comparables.ClasesEjercicios;

public class Humano2 implements Comparable<Humano2>{
    private String nombre;
    private double salario;

    public Humano2(String name, double salary) {
        this.nombre = name;
        this.salario = salary;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    @Override
    public String toString() {
        return this.nombre + " - " + this.salario;
    }

    @Override
    public int compareTo(Humano2 other){
        if (this.nombre.equals(other.getNombre()))
            return Double.compare(other.getSalario(), this.salario);
        else return this.nombre.compareTo(other.getNombre());
    }
}
