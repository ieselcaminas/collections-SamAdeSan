package Extras.EjerciciosAmpliacion;

import java.util.Stack;

public class Parentesis {
    public static void main(String[] args) {
        System.out.println(parentizado("({[{}]))"));
    }
    public static boolean parentizado(String cadena){
        boolean parentizado;
        char caracter;
        char ultimo;
        Stack<Character> pila = new Stack<>();
        for (int i = 0; i < cadena.length(); i++) {
            caracter = cadena.charAt(i);
            if (caracter == '(' || caracter == '{' || caracter == '[') {
                pila.push(caracter);
            }else if (caracter == ')') {
                ultimo = pila.pop();
            }
        }
        return false;
    }
}
