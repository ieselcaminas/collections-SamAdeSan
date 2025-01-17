package Flujos_Streams;

import java.util.ArrayList;
import java.util.List;

public class MemberMain {
    public static void main(String[] args) {
        List<Member> member = new ArrayList<>();

        member.add(new Member("Samuel", 177));
        member.add(new Member("Athos", 165));
        member.add(new Member("Aarón", 190));

        member.stream().sorted().forEach(System.out::println);
    }
}
