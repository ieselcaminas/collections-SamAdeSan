package Interfaces_Comparables;

import Flujos_Streams.ClasesEjercicios.Persona;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio1 {
    public static void main(String[] args) {
        Arrays.sort(new int[]{2,3,5,1});
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Tomás", "Turbado", 1999));
        personas.stream().sorted().forEach(System.out::println);
    }
}
