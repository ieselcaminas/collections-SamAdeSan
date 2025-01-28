package Extras.EjerciciosRefuerzoII.Flujos;

import Extras_T5.EjerciciosRefuerzoII.Flujos.Person;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args) {
        List<Extras_T5.EjerciciosRefuerzoII.Flujos.Person> personas = new ArrayList<Extras_T5.EjerciciosRefuerzoII.Flujos.Person>();
        Extras_T5.EjerciciosRefuerzoII.Flujos.Person p1 = new Extras_T5.EjerciciosRefuerzoII.Flujos.Person("Elver", "Galarga", 1968);
        personas.add(p1);
        Extras_T5.EjerciciosRefuerzoII.Flujos.Person p2 = new Person("Pablo", "Ahrre", 2013);
        personas.add(p2);
        long res = personas.stream()
                .filter(persona -> persona.getFirstName() == "A")
                .count();
        System.out.println(res);
    }
}
