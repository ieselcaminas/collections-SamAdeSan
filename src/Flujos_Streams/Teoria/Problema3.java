package Flujos_Streams.Teoria;

import Flujos_Streams.Person;

import java.util.ArrayList;
import java.util.List;

public class Problema3 {
    public static void main(String[] args) {
        List <Person> personas = new ArrayList<Person>();

        Person p1 = new Person("Aitor", "Tilla", 1968);
        personas.add(p1);

        Person p2 = new Person("Pablo", "Motos", 2013);
        personas.add(p2);

        personas.stream()
                .map(persona -> persona.getLastName())
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }
}
