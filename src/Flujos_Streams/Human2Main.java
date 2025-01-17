package Flujos_Streams;

import java.util.ArrayList;
import java.util.List;

public class Human2Main {
    public static void main(String[] args) {
        List<Human2> human2 = new ArrayList<>();

        human2.add(new Human2("Samuel", 177));
        human2.add(new Human2("Athos", 165));
        human2.add(new Human2("Aarón", 190));

        human2.stream().sorted().forEach(System.out::println);
    }
}
