package EstructurasBasicas;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

public class Telefonos2 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> agendaContacto = new HashMap<>();
        ArrayList<String> contacto1 = new ArrayList<>();
        contacto1.add("644618531");
        contacto1.add("644123456");

        ArrayList<String> contacto2 = new ArrayList<>();
        contacto2.add("722126534");
        contacto2.add("722926585");
        agendaContacto.put("Jose", contacto2);

        Scanner sc = new Scanner(System.in);

        System.out.println("Samuel: 1\n" + "Jose: 2\n");
        System.out.println("Selecciona a uno de los dos contactos para ver sus númereos de teléfono: ");
        switch (sc.nextInt()) {
            case 1: System.out.println("Teléfonos de Samuel: " + agendaContacto.get("Samuel"));
                break;
            case 2: System.out.println("Teléfonos de Jose: " + agendaContacto.get("Jose"));
            break;
        }
        sc.close();
    }
}
