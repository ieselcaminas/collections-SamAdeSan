package Flujos_Streams.Comparable;

import Flujos_Streams.Human;
import java.util.ArrayList;
import java.util.List;

public class Salario {
    public static void main(String[] args) {
        List<Human> humans = new ArrayList<>();
        Human h1 = new Human("Pepe", 1998.99);
        humans.add(h1);
        Human h2 = new Human("Jorge", 2000.95);
        humans.add(h2);

        humans.stream().sorted().forEach(n-> System.out.println(n.getSalary()));
    }
}
