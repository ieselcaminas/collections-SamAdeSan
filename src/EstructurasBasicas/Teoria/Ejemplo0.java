package EstructurasBasicas.Teoria;
import java.util.List;
import java.util.ArrayList;
public class Ejemplo0 {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<Integer>();

        // Añadir elementos
        l1.add(0, 1);
        l1.add(1, 2);

        // Imprimir los elementos del array
        System.out.println(l1);

        List<Integer> l2 = new ArrayList<Integer>();

        l2.add(1);
        l2.add(2);
        l2.add(3);

        //Añadirá todos los elementos de l2 a partir del índice 1
        l1.addAll(1, l2);

        System.out.println(l1);

        // Elimina el elemento 1 del array
        l1.remove(1);

        System.out.println(l1);

        // Imprime el elemento en la posición 3 mediante get
        System.out.println(l1.get(3));

        //Reemplaza el elemento 0 por el número 5
        l1.set(0, 5);

        // Again printing the updated List 1
        System.out.println(l1);
    }
}
