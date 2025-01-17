package EstructurasBásicas;

import java.util.HashMap;
import java.util.Map;
public class LaMejorTerminacion {
    public static void main(String[] args) {
        System.out.println("La terminacion es: " + calcularMapaTerminaciones(new String[]{"00004", "03847", "39804"}));
    }
    public static Map<Character, Integer> calcularMapaTerminaciones (String[] boletos) {
        Map<Character, Integer> terminaciones = new HashMap<>();
        Character ultimo;
        Integer cont;
        // for-each para
        for (String boleto : boletos) {
            //valor terminacion
            ultimo = boleto.charAt(boleto.length() - 1);
            //obtenemos el valor de la clave.
            cont = terminaciones.get(ultimo);
            //Si la clave no existía, ponemos un 1. Si no, aumentamos en 1 el valor que tenemos.
            if (cont == null) {
                terminaciones.put(ultimo, 1);
            }else terminaciones.put(ultimo, cont + 1);
        }
        return terminaciones;
    }
}
