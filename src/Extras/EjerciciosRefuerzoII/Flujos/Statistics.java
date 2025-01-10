package Extras.EjerciciosRefuerzoII.Flujos;

import java.util.ArrayList;
import java.util.List;
public class Statistics{
    public static void main(String[] args) {
        List<String> numeros = new ArrayList<>();

        numeros.add("25");
        numeros.add("30");
        numeros.add("20");

//        long cuantos = numeros.stream().mapToInt(s -> Integer.valueOf(s).filter(n -> n > 3 == 0).count();
//
//        double media = numeros.stream()
//                //convertimos a Int
//                .mapToInt(s -> Integer.valueOf(s))
//                //filtramos los que sean múltiplos de 3
//                .filter(number -> number % 3 == 0)
//                //y los contamos
//                .count();
//        System.out.printf("Hay %d números múltiplos de 3 y la media es %f%n", cuantos, media);

    }
}
