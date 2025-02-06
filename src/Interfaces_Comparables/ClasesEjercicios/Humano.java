package Interfaces_Comparables.ClasesEjercicios;

public class Humano implements Comparable<Humano>{
    private String nombre;
    private double salario;

    public Humano(String name, double salary) {
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
    public int compareTo(Humano other){
        return Double.compare(other.salario, this.salario);
    }
}
