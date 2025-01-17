package Flujos_Streams;

import java.util.ArrayList;
import java.util.List;

public class PersonMain {
    public static void main(String[] args) {
        List<Person> member = new ArrayList<>();

        member.add(new Person("Samuel", "Aded", 2006));
        member.add(new Person("Athos", "Tar", 2007));
        member.add(new Person("Aarón", "Ático", 2005));

        member.stream().sorted().forEach(System.out::println);
    }
}
