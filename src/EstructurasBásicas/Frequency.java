package EstructurasBásicas;

import java.util.HashMap;
import java.util.Map;

public class Frequency {
    public static void main(String[] args) {
        System.out.println(frequency(new String[]{"uno dos dos tres tres tres"}));
    }
    public static Map<String, Integer> frequency(String[] palabras) {
        Map<String, Integer> frecuencia = new HashMap<>();
        Integer contador;
        for (String palabra : palabras) {
            contador = frecuencia.get(palabra);
            if (contador == null) {
                frecuencia.put(palabra, 1);
            }else frecuencia.put(palabra, contador + 1);
        }
        return frecuencia;
    }
}
