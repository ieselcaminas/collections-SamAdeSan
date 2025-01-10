package EstructurasBásicas;

import java.io.*;
import java.util.*;

public class Anagramas {
    public static void main(String[] args) throws IOException {
        System.out.println(generarMapa());
    }
    public static Map<String, ArrayList<String>> generarMapa() throws IOException {
        BufferedReader lector = new BufferedReader(new FileReader("files/spanish-dict.txt"));
        String desordenada;
        Map<String, ArrayList<String>> mapaPalabras = new HashMap<>();

        while ((desordenada = lector.readLine())!=null) {
            String ordenada = ordenarPalabra(desordenada);
            ArrayList<String> desordenadas = mapaPalabras.get(ordenada);
            if (desordenadas == null) {
                desordenadas = new ArrayList<>();
                desordenadas.add(desordenada);
                mapaPalabras.put(ordenada, desordenadas);
            }else {
                desordenadas.add(desordenada);
                mapaPalabras.put(ordenada, desordenadas);
            }
        }
        lector.close();
        return mapaPalabras;
    }
    private static String ordenarPalabra(String s) {
        char[] a = s.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }
}
