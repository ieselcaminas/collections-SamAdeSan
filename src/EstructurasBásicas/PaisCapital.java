package EstructurasBásicas;

import java.util.HashMap;
import java.util.Map;

public class PaisCapital {
    public static void main(String[] args) {
        Map<String, String> pais = new HashMap<>();
        pais.put("España", "Madrid");
        pais.put("Argentina", "El Salvador");
        pais.put("Alemania", "Berlín");
        pais.put("Rusia", "Moscú");
        String paisIntroducido = "España";
        if (pais.containsKey(paisIntroducido)) {
            System.out.println("La capital de " + paisIntroducido + " es " + pais.get(paisIntroducido));
        } else System.out.println("ERR.");
    }
}
