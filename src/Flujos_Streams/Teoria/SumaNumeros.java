package Flujos_Streams.Teoria;

import java.util.ArrayList;
import java.util.List;

public class SumaNumeros {
    public static void main(String[] args) {
        List<Integer> numeros  = new ArrayList<>();
        numeros.add(32);
        numeros.add(-12);
        numeros.add(14);
        numeros.add(-1);

        long sumaPositivos = numeros.stream()
                .filter(numero -> numero > 0)
                .mapToInt(Integer::valueOf)
                .sum();
        long sumaNegativos = numeros.stream()
                .filter(numero -> numero < 0)
                .mapToInt(Integer::valueOf)
                .sum();

        System.out.println("Numeros de la lista: " + numeros);
        System.out.println();
        System.out.println("Suma de números positivos: " + sumaPositivos);
        System.out.println();
        System.out.println("Suma de números negativos: " + sumaNegativos);
    }
}
