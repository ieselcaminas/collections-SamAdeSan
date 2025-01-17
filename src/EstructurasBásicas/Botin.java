package EstructurasBásicas;

import java.util.*;

public class Botin {
    public static void main(String[] args) {
        System.out.println(repartirBotin(2, new String[]{"10", "100", "20", "50", "200"}));
    }
    public static Map<Integer, String> repartirBotin(int ladrones, String[] billetes){
        Map<Integer, String> reparto = new HashMap<>();
        int toca;
        String billete;

        for (int i = 0; i < ladrones; i++) {
            billete = billetes[i];
            toca = i % ladrones;
            String botin = reparto.get(toca);
            if (botin == null){
                reparto.put(toca, billete);
            }
            else{
                reparto.put(toca, botin + " " + billete);
            }
        }
        return reparto;
    }
}
