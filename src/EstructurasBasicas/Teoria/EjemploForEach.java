package EstructurasBasicas.Teoria;

import java.util.ArrayList;
/// El {@code for-each} Simplifica el recorrido de colecciones. No requiere índices, solo proporciona directamente el valor de cada elemento
public class EjemploForEach {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.add(6);
        nums.add(3);
        // Utilizamos la primera forma de recorrer la lista. Un bucle 'for' clásico.
        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }
        // Ahora utilizaremos la segunda forma de recorrer la lista con bucle 'for-each'.
        for (Integer num : nums) {
            // num' toma el valor de cada elemento de la lista en cada iteración.
            System.out.println(num);

        }
        ArrayList<String> cadenas = new ArrayList<>();
        cadenas.add("asd");
        cadenas.add("dff");
        cadenas.add("sdgfggg");
        for (int i = 0; i < cadenas.size(); i++) {
            // Imprimimos el índice 'i' junto con el valor de la posición 'i' en la lista
            System.out.println(i + " " + cadenas.get(i));
        }
        int contador = 0;
        for (String cadena : cadenas) {
            // Imprimimos el contador seguido de la cadena y luego aumentamos el contador después de haber aplicado el "for-each".
            System.out.println(contador++ + " " + cadena);
        }
    }
}
