package Interfaces_Comparables.Actividades.tutankamon;

import java.util.ArrayList;
import java.util.List;

public class MainTutankamon {
    public static void main(String[] args) {
        List<Tesoros> tesoros = new ArrayList<>();

        tesoros.add(new Tesoros( "Flecha", 5, 1));
        tesoros.add(new Tesoros( "Sandalias", 10, 2));
        tesoros.add(new Tesoros( "Sarcófago", 1000, 1000));
        tesoros.add(new Tesoros( "Máscara", 1000, 10));
        tesoros.add(new Tesoros( "Flechas", 10, 2));

        System.out.println("Tesoros de Tutankamon: ");

        tesoros.stream().sorted().forEach(System.out::println);
    }
}
