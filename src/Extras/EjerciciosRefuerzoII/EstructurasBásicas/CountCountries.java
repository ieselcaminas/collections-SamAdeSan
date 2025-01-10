package Extras.EjerciciosRefuerzoII.EstructurasBásicas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CountCountries {
    public static void main(String[] args) throws IOException {System.out.println(contarPaises());}
    public static Map<String, Integer> contarPaises() throws IOException {
        BufferedReader leerPaises = new BufferedReader(new FileReader("files/Colfuturo-Seleccionados.csv"));
        Map<String, Integer> mapaPaises = new HashMap<>();
        String linea;
        Integer cuantosPaises;
        leerPaises.readLine();
        while ((linea = leerPaises.readLine()) != null) {
            String[] camposLinea = linea.split(",");
            String pais = camposLinea[6];
            cuantosPaises = mapaPaises.get(pais);

            if (cuantosPaises == null) {
                mapaPaises.put(pais, 1);
            }else mapaPaises.put(pais, cuantosPaises + 1);
        }
        leerPaises.close();
        return mapaPaises;
    }
}
