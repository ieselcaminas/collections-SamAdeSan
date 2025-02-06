package EstructurasBasicas.Teoria;

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
        for (String valor : mapa1.values()) {
            System.out.print(valor + "-");
        }

        System.out.println("Listado completo de claves");
        // Para imprimir todas las claves del mapa, utilizamos otro bucle for-each.
        // mapa1.keySet() devuelve un conjunto de todas las claves del mapa.
        for (String clave : mapa1.keySet()) {
            System.out.print(clave + "-");
        }
        System.out.println("La traducción de 'rojo' es:" + mapa1.get("rojo"));

        if (!mapa1.containsKey("negro")) {
            // mapa1.containsKey("negro") verifica si la clave "negro" existe en el mapa.
            // Como "negro" no está en el mapa, la condición se cumple.
            System.out.println("No existe la clave 'negro'");
            // mapa1.getOrDefault("marrón", "No existe la clave marrón") intenta obtener el valor asociado
            // a la clave "marrón". Si no existe, devuelve el valor por defecto: "No existe la clave marrón".
        }

        System.out.println("La traducción de 'marron' es:" + mapa1.getOrDefault("marrón", "No existe la clave marrón"));

        mapa1.remove("rojo");
        // mapa1.remove("rojo") elimina del mapa la entrada con clave "rojo" y su valor asociado ("red").
        System.out.println(mapa1);
        // Finalmente, imprimimos el contenido actual del mapa.
    }
}
