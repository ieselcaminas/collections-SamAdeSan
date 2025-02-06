package Interfaces_Comparables;

import Interfaces_Comparables.ClasesEjercicios.Humano2;

import java.util.ArrayList;
import java.util.List;

public class EjemploOrdenarSiNombresIguales {
    public static void main(String[] args) {
        List< Humano2> personas = new ArrayList<>();

        personas.add(new Humano2("Jose", 2010));
        personas.add(new Humano2("Jane", 20000));
        personas.add(new Humano2("Jose", 2100));

        personas.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
