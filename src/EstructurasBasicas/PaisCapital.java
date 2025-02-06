package EstructurasBasicas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PaisCapital {
    public static void main(String[] args) {
        Map<String, String> pais = new HashMap<String, String>();

        pais.put("España", "Madrid");
        pais.put("Argentina", "El Salvador");
        pais.put("Alemania", "Berlín");
        pais.put("Rusia", "Moscú");

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un país: ");
        String nombre = sc.nextLine();

        if (pais.containsKey(nombre)) {
            System.out.println("Su capital es " + pais.get(nombre));
        }
        else System.out.println("ERROR DE SINTAXIS O NO ES VÁLIDO.");
    }
}
