package EstructurasBasicas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagramas {
    public static void main(String[] args) throws IOException{
        System.out.println(generarMapa());
    }
    public static Map<String, ArrayList<String>> generarMapa() throws IOException {
        BufferedReader lector = new BufferedReader(new FileReader("files/spanish-dict.txt"));
        String desordenada;
        Map<String, ArrayList<String>> mapaPalabras = new HashMap<>();

        while ((desordenada = lector.readLine()) != null) {
            String ordenada = ordenaarPalabra(desordenada);
            ArrayList<String> desordendas = mapaPalabras.get(ordenada);
            if (desordendas == null){
                desordendas = new ArrayList<>();
                desordendas.add(desordenada);
                mapaPalabras.put(ordenada, desordendas);
            }else {
                desordendas.add(ordenada);
                mapaPalabras.put(ordenada, desordendas);
            }
        }
        lector.close();
        return mapaPalabras;
    }
    private static String ordenaarPalabra(String s) {
        char[] a = s.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }
}
