package Extras.EjerciciosRefuerzoII.Flujos;

import Extras_T5.EjerciciosRefuerzoII.Flujos.Person;

import java.util.ArrayList;
import java.util.List;

public class Problema1 {
    public static void main(String[] args) {
        List<Extras_T5.EjerciciosRefuerzoII.Flujos.Person> personas = new ArrayList<Extras_T5.EjerciciosRefuerzoII.Flujos.Person>();
        Extras_T5.EjerciciosRefuerzoII.Flujos.Person p = new Extras_T5.EjerciciosRefuerzoII.Flujos.Person("Elver", "Galarga", 1968);
        personas.add(p);
        Extras_T5.EjerciciosRefuerzoII.Flujos.Person p2 = new Person("Pablo", "Motos", 2013);
        personas.add(p2);

        long cuantas = personas
                .stream()
                .filter(persona -> persona.getBirthYear() < 1970)
                .count();
        System.out.println(cuantas);

    }
}
