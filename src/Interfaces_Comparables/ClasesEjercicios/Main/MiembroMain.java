package Interfaces_Comparables.ClasesEjercicios.Main;

import Interfaces_Comparables.ClasesEjercicios.Miembro;

import java.util.ArrayList;
import java.util.List;

public class MiembroMain {
    public static void main(String[] args) {
        List<Miembro> miembros = new ArrayList<>();
        miembros.add(new Miembro("Miembro A", 165));
        miembros.add(new Miembro("Miembro B", 180));
        miembros.add(new Miembro("Miembro C", 177));

        miembros.stream()
                .sorted()
                .forEach(System.out::println);

    }
}
