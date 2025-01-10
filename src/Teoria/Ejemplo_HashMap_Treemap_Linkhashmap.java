package Teoria;

import java.util.HashMap;
import java.util.Map;
/// Nos permiten almacenar elementos asociando a cada clave un valor. Para cada clave tenemos un valor asociado. Podemos después buscar fácilmente un valor para una determinada clave.
public class Ejemplo_HashMap_Treemap_Linkhashmap {
    public static void main(String[] args) {
        Map<String, String> mapa1 = new HashMap<String, String>();
        //Mediante el metodo put agregamos un elemento a la colección de tipo HashMap.
        mapa1.put("rojo", "red");
        mapa1.put("verde", "green");
        mapa1.put("azul", "blue");
        mapa1.put("blanco", "white");

        System.out.println("Listado completo de valores");
        //Para imprimir todos los valores del mapa lo recorremos mediante un for-each
        for (String valor : mapa1.values())
            System.out.print(valor + "-");
        System.out.println();

        System.out.println("Listado completo de claves");
        for (String clave : mapa1.keySet())
            System.out.print(clave + "-");
        System.out.println();

        System.out.println("La traducción de 'rojo' es:" + mapa1.get("rojo"));

        if (!mapa1.containsKey("negro")) {
            System.out.println("No existe la clave 'negro'");
        }

        System.out.println("La traducción de 'marron' es:" + mapa1.getOrDefault("marrón", "No existe la clave marrón"));

        mapa1.remove("rojo");
        System.out.println(mapa1);
    }
}
