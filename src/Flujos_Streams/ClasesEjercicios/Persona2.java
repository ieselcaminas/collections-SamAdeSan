package Flujos_Streams.ClasesEjercicios;

public class Persona2 {
    private String nombre;
    private int anyoNacimiento;

    public Persona2(String nombre, int anyoNacimiento) {
        this.nombre = nombre;
        this.anyoNacimiento = anyoNacimiento;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getAnyoNacimiento() {
        return this.anyoNacimiento;
    }

    public String toString() {
        return this.nombre + " (" + this.anyoNacimiento + ")";
    }
}
