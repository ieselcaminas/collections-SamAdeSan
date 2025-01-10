package Flujos_Streams.Teoria;

import java.util.ArrayList;
import java.util.List;

public class Problema4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(6);
        System.out.println(list.stream().
                        filter(p -> p >= 1 && p <= 5)
                        .count()
        );
    }
}
