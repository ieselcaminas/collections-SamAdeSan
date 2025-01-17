package EstructurasBásicas.Teoria;

import java.util.ArrayList;

public class Ejemplo1 {
    public static void main(String[] args) {
        ArrayList<String> coches = new ArrayList<String>();
        coches.add("Seat");
        coches.add("Audi");
        coches.add("BMW");
        coches.add("Honda");
        System.out.println(coches.get(0));
        for (int i = 0; i < coches.size(); i++) {
            System.out.println(coches.get(i));
        }
        coches.remove(0);
        System.out.println("_____________Sin el que esta en posicion 0______________");
        for (int i = 0; i < coches.size(); i++) {
            System.out.println(coches.get(i));
        }
    }
}
