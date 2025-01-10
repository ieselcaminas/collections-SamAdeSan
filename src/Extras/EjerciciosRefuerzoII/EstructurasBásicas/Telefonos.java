package Extras.EjerciciosRefuerzoII.EstructurasBásicas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Telefonos {
    public static void main(String[] args) {
        Map<String, Integer> contactos = new HashMap<>();
        contactos.put("Aitor Tilla", 666080913);
        contactos.put("Elvis Cocho", 635889977);
        contactos.put("Elsa Pato", 644616239);
        contactos.put("Pedro Sánchez", 606060606);
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un contacto: ");
        String contactoTel = entrada.nextLine();
        if (contactoTel.equals("Aitor Tilla")){
            System.out.println(contactos.get("Aitor Tilla"));
        }
        else if (contactoTel.equals("Elvis Cocho")){
            System.out.println(contactos.get("Elvis Cocho"));
        }
        else if (contactoTel.equals("Elsa Pato")){
            System.out.println(contactos.get("Elsa Pato"));

        }
    }
}