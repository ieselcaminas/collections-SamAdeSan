package Interfaces_Comparables;

import Interfaces_Comparables.ClasesEjercicios.Humano;

import java.util.ArrayList;
import java.util.List;

public class Salario {
    public static void main(String[] args) {
        List<Humano> humans = new ArrayList<>();
        Humano h1 = new Humano("Pepe", 1998.99);
        humans.add(h1);
        Humano h2 = new Humano("Jorge", 2000.95);
        humans.add(h2);

        humans.stream().sorted().forEach(n-> System.out.println(n.getSalario()));
    }
}
