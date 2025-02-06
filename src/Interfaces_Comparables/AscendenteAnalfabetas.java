package Interfaces_Comparables;

import Interfaces_Comparables.ClasesEjercicios.Pais;

import java.io.*;
import java.util.*;

public class AscendenteAnalfabetas {
    public static void main(String[] args) throws IOException {
        BufferedReader lector = new BufferedReader(new FileReader("files/illiterate.csv"));
        List<Pais> paises = new ArrayList<Pais>();
        Pais pais;
        String linea;
        String[] datos;
        lector.readLine();

        do {
            datos = lector.readLine().split(",");
            pais = new Pais(datos[0], Integer.parseInt(datos[1]));
            paises.add(pais);
        }
        while ((linea = lector.readLine()) != null);

        paises.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
