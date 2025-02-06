package Flujos_Streams.ClasesEjercicios;

public class Persona {
    private String nombre;
    private String apellido;
    private int anyoNacimiento;

    public Persona(String nombre, String apellido, int anyoNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.anyoNacimiento = anyoNacimiento;
    }
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
    public int getAnyoNacimiento() {
        return anyoNacimiento;
    }
}
