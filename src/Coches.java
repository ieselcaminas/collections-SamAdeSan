import java.util.*;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Scanner;

public class Coches {
    public static void main(String[] args) {
        ArrayList<String> coches = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el número de coches: ");
        String marca;
        do{
            marca = sc.nextLine();
            if (!marca.isEmpty()) {
                coches.add(marca);
            }
        } while (!marca.isEmpty());
        Collections.sort(coches);
        for (int i = 0; i < coches.size(); i++) {
            System.out.println(coches.get(i));
        }
    }
}
