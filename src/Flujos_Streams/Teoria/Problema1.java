package Flujos_Streams.Teoria;

import Flujos_Streams.Person;

import java.util.ArrayList;
import java.util.List;

public class Problema1 {
    public static void main(String[] args) {
        List<Person> personas = new ArrayList<Person>();
        Person p = new Person("Elver", "Galarga", 1968);
        personas.add(p);
        Person p2 = new Person("Pablo", "Motos", 2013);
        personas.add(p2);

        long cuantas = personas.stream()
                .filter(persona -> persona.getBirthYear() < 1970)
                .count();
        System.out.println(cuantas);

    }
}
