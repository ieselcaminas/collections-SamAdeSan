package Interfaces_Comparables.Actividades.ninosbuenos;

import java.util.ArrayList;
import java.util.List;

public class NinyosBuenos {
    public static void main(String[] args) {
        List<Buenos> buenos = new ArrayList<>();

        buenos.add(new Buenos("80", 2));
        buenos.add(new Buenos("100", 12));
        buenos.add(new Buenos("100", 1));

        buenos.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
