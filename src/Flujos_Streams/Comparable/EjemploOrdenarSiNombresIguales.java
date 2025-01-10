package Flujos_Streams.Comparable;

import Flujos_Streams.Human2;
import java.util.ArrayList;
import java.util.List;

public class EjemploOrdenarSiNombresIguales {
    public static void main(String[] args) {
        List<Human2> personas = new ArrayList<>();

        personas.add(new Human2("Jose", 2010));
        personas.add(new Human2("Jane", 20000));
        personas.add(new Human2("Jose", 2100));

        personas.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
