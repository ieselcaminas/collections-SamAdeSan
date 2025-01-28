package Extras.EjerciciosRefuerzoII.Extras.EjerciciosRefuerzoII;

import java.util.Arrays;

public class Ej8 {
    public static void main(String[] args) {
        System.out.println(cualFalta(new int[]{4,3,6,2}));
    }
    public static int cualFalta(int[] numeros) {
        Arrays.sort(numeros);
        for (int i = 0; i < numeros.length - 1; i++) {
            if (numeros[i + 1] - numeros[i] > 1) {
                return numeros[i] + 1;
            }
        }
        return -1;
    }
}
