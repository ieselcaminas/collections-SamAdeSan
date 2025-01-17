package Flujos_Streams;

import java.util.ArrayList;
import java.util.List;

public class HumanMain {
    public static void main(String[] args) {
        List<Human> human = new ArrayList<>();

        human.add(new Human("Samuel", 177));
        human.add(new Human("Athos", 165));
        human.add(new Human("Aarón", 190));

        human.stream().sorted().forEach(System.out::println);
    }
}
