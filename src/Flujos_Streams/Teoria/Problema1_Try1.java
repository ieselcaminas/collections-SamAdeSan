package Flujos_Streams.Teoria;

import Flujos_Streams.Person;

import java.util.ArrayList;
import java.util.List;

public class Problema1_Try1 {
    public static void main(String[] args) {
        List<Person> personas = new ArrayList<>();
        personas.add(new Person("Samuel", "Aded", 2006));
        personas.add(new Person("Hugo", "Veintitrés", 2016));
        System.out.println(personas.stream()
                .filter(persona -> persona.getBirthYear() == 2006)
                .count()
        );

    }
}
