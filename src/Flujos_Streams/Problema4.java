package Flujos_Streams;

import java.util.ArrayList;
import java.util.List;

public class Problema4 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(6);
        lista.add(4);
        lista.add(8);
        lista.add(3);

        long cantidad = lista.stream()
                .filter(numero -> numero >= 1 && numero <=5)
                .count();
        System.out.println("Hay " + cantidad + " números que estan entre 1 y 5.");
    }
}
