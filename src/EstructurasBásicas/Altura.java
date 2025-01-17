package EstructurasBásicas;

import java.util.ArrayList;
import java.util.Scanner;

public class Altura {
    public static void main(String[] args) {
        System.out.println("Introduzca el valor de altura: ");
        Scanner sc = new Scanner(System.in);
        int numAlumnos = numeroAlumnos();
        double media;
        ArrayList<Double> alturas = new ArrayList<>();
        System.out.println(numAlumnos);
        System.out.println("Introduce las alturas: ");
        alturas = leerAlturas(alturas, numAlumnos);
        media = mediaAlturas(alturas);
        System.out.println("La media es: " + media);
        System.out.println("El alumnos de la lista es: " + alturas);

    }
    public static int numeroAlumnos() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }
    public static ArrayList<Double> leerAlturas(ArrayList<Double> alturas, int numeroAlumnos) {
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < numeroAlumnos(); i++){
            alturas.add(entrada.nextDouble());
        }
        return alturas;
    }
    public static double mediaAlturas(ArrayList<Double> alturas){
        double suma = 0;
        for (int i = 0; i < alturas.size(); i++){
            suma += alturas.get(i);
        }
        return suma / alturas.size();
    }
    public static double calcularAlumnos_AlturaSuperior(ArrayList<Double> alturas, Double media){
        int contador = 0;
        for (int i = 0; i < alturas.size(); i++){
            if (alturas.get(i) < media){
                contador++;
            }
        }
        return contador;
    }
    public static double calcularAlumnos_AlturaInferior(ArrayList<Double> alturas, Double media) {
        int contador = 0;
        for (int i = 0; i < alturas.size(); i++) {
            if (alturas.get(i) > media) {
                contador++;
            }
        }
        return contador;
    }
}
