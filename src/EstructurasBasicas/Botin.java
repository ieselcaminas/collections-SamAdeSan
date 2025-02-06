package EstructurasBasicas;

import java.util.*;

public class Botin {
    public static void main(String[] args) {
        System.out.println("Botín repartido: " + repartoBotin(3, new String[]{"2", "10", "20", "50", "200", "500"}));
    }
    public static Map<Integer, String> repartoBotin(int ladrones, String[] cantidadEnBilletes){
        Map<Integer, String> reparto = new HashMap<>();
        int turno;
        String billete;

        for (int i = 0; i < ladrones; i++) {

            billete = cantidadEnBilletes[i];
            turno = i % ladrones;
            String botin = reparto.get(turno);

            if (botin == null){
                reparto.put(turno, billete);
            }else {
                reparto.put(turno, botin + " " + billete);
            }
        }
        return reparto;
    }
}
