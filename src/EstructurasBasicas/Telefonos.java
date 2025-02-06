package EstructurasBasicas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Telefonos {
    public static void main(String[] args) {
        Map<String, Integer> telefonos = new HashMap<>();

        telefonos.put("Samuel", 644618531);
        telefonos.put("Jose", 649992214);
        telefonos.put("Juan", 722020399);
        telefonos.put("Jorge", 632613628);

        Scanner sc = new Scanner(System.in);

        System.out.println("Samuel: 1\n" + "Jose: 2\n" + "Juan: 3\n" + "Jorge: 4\n");
        System.out.println("Seleccione un contacto de estos: ");

        switch (sc.nextInt()) {
            case 1:
                System.out.println("El telefono de Samuel es: " + telefonos.put("Samuel", 644618531));
                break;
            case 2:
                System.out.println("El telefono de Jose es: " + telefonos.put("Jose", 649992214));
            break;
            case 3:
                System.out.println("El telefono de Juan es: " + telefonos.put("Juan", 722020399));
            break;
            case 4:
                System.out.println("El telefono de Jorge es: " + telefonos.put("Jorge", 632613628));
        }
        sc.close();
    }
}
