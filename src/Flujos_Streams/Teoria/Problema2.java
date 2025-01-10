package Flujos_Streams.Teoria;

import Flujos_Streams.Person;

import java.util.ArrayList;
import java.util.List;

public class Problema2 {
    public static void main(String[] args) {
        List<Person> personas = new ArrayList<Person>();
        Person p1 = new Person("Elver", "Galarga", 1968);
        personas.add(p1);
        Person p2 = new Person("Pablo", "Ahrre", 2013);
        personas.add(p2);
        long res = personas.stream()
                .filter(persona -> persona.getLastName().startsWith("A"))
                .count();
        System.out.println(res);
    }
}
