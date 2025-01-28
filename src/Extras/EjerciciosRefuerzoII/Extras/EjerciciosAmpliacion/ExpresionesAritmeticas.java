package Extras.EjerciciosRefuerzoII.Extras.EjerciciosAmpliacion;

import java.util.Stack;

public class ExpresionesAritmeticas {
    public static void main(String[] args) {
        System.out.println(calculo("2 3 +"));
    }

    public static boolean esNumero(String numero) {
        return Character.isDigit(numero.charAt(0));
    }

    public static int calculo(String expresionAritmetica) {
        String[] terminos = expresionAritmetica.split(" ");
        // meto y saco (pila) = Stack. Piensa en una pila de platos: pongo uno encima de la pila y luego lavo
        // el último que he puesto
        Stack<Integer> pila = new Stack<>();
        Integer num1, num2;
        for (int i = 0; i < terminos.length; i++) {
            if (esNumero(terminos[i])) {
                //Con Integer.parseInt(terminos[i]), convertimos la cadena terminos[i] en un Integer
                pila.push(Integer.parseInt(terminos[i]));
            } else if (terminos[i].equals("+")) { //equals se usa para comparar cadenas
                //En este sacamos sacamos los dos últimos operandos de la pila
                num2 = pila.pop();
                num1 = pila.pop();
                pila.push(num1 + num2);
            }
        }
        return pila.pop();
    }
}