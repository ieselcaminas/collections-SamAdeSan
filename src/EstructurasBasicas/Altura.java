package EstructurasBasicas;

import java.util.ArrayList;
import java.util.Scanner;

public class Altura {

    public static int numeroAlumnos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número de alumnos: ");
        return sc.nextInt();
    }

    public static ArrayList<Double> leerAlturas(ArrayList<Double> alturas, int numeroAlumnos) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numeroAlumnos; i++) {
            System.out.println("Ingrese la altura del alumno " + (i + 1) + ": ");
            alturas.add(sc.nextDouble());
        }
        return alturas;
    }

    public static double mediaAlturas(ArrayList<Double> alturas) {
        double suma = 0;
        for (int i = 0; i < alturas.size(); i++) {
            suma += alturas.get(i);
        }
        return suma / alturas.size();
    }

    public static int calcularAlumnos_AlturaSuperior(ArrayList<Double> alturas, double media) {
        int contador = 0;
        for (int i = 0; i < alturas.size(); i++) {
            if (alturas.get(i) > media) {
                contador++;
            }
        }
        return contador;
    }

    public static int calcularAlumnos_AlturaInferior(ArrayList<Double> alturas, double media) {
        int contador = 0;
        for (int i = 0; i < alturas.size(); i++) {
            if (alturas.get(i) < media) {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        ArrayList<Double> alturas = new ArrayList<>();
        int numeroAlumnos = numeroAlumnos();
        alturas = leerAlturas(alturas, numeroAlumnos);

        double media = mediaAlturas(alturas);
        System.out.println("La media de las alturas es: " + media);

        int superior = calcularAlumnos_AlturaSuperior(alturas, media);
        int inferior = calcularAlumnos_AlturaInferior(alturas, media);

        System.out.println("Número de alumnos con altura superior a la media: " + superior);
        System.out.println("Número de alumnos con altura inferior a la media: " + inferior);
    }
}
