package Flujos_Streams.Comparable;

import Flujos_Streams.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio1 {
    public static void main(String[] args) {
        Arrays.sort(new int[]{2,3,5,1});
        List<Person> personas = new ArrayList<>();

        personas.add(new Person("Tomás", "Turbado", 1999));
        personas.stream().sorted().forEach(System.out::println);
    }
}
