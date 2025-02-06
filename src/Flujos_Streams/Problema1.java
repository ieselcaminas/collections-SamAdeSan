package Flujos_Streams;

import Flujos_Streams.ClasesEjercicios.Persona;

import java.util.ArrayList;
import java.util.List;

public class Problema1 {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Samuel", "Aded", 2006));
        personas.add(new Persona("Francisco", "Rupto", 1945));
        personas.add(new Persona("Fernando", "Padillo", 1975));
        personas.add(new Persona("Jaimito", "Logia", 1999));

        personas.stream()
                .filter(persona -> persona.getAnyoNacimiento() > 1970)
                .count();
        System.out.println("Hay " + personas + " personas que nacieron después de 1970.");
    }
}
