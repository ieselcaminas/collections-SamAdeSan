package Flujos_Streams.Actividades.felipe;

import java.util.ArrayList;
import java.util.List;

public class Felipe {
    public static void main(String[] args) {
        List<TareasFelipe> tareas = new ArrayList<>();
        tareas.add(new TareasFelipe(12, 12));
        tareas.add(new TareasFelipe(11, 12));
        tareas.add(new TareasFelipe(11, 2));

        tareas.stream().sorted().forEach(System.out::println);
    }
}
