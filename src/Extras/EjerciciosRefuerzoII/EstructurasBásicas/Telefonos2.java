package Extras.EjerciciosRefuerzoII.EstructurasBásicas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Telefonos2 {
    public static void main(String[] args) {
        ArrayList<String> telefonos = new ArrayList<>();
        telefonos.add("111");
        telefonos.add("222");
        Map<String, ArrayList<String>> agenda = new HashMap<>();
        agenda.put("Pepe", telefonos);
        telefonos = new ArrayList<>();
        telefonos.add("4444");
        telefonos.add("5555");

        agenda.put("Juan", telefonos);
        System.out.println("Los telefonos: " + telefonos);
        System.out.println();
        System.out.println(agenda);

    }
}
