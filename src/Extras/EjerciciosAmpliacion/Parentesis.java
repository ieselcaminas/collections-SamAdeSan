package Extras.EjerciciosAmpliacion;

import java.util.*;

public class Parentesis {
    public static void main(String[] args) {
        System.out.println(parentizado("({[]})"));
    }
    public static boolean parentizado(String cadena) {
        boolean formaParentesis;
        LinkedList<Character> cola = new LinkedList<>();
        char caracter;
        for (int i = 0; i < cadena.length(); i++) {
            caracter = cadena.charAt(i);
            if (caracter == '{' || caracter == '[' || caracter == '('){
                cola.addLast(caracter);
            }else if (caracter == ']' || caracter == '}' || caracter == ')'){
                if (cola.isEmpty()) {
                    return false;
                } else {
                    Character removed = cola.removeLast();
                    switch (caracter) {
                        case '}': formaParentesis = removed == '{';
                            break;
                        case ')': formaParentesis = removed == '(';
                            break;
                        case ']': formaParentesis = removed == '[';
                            break;
                        default: formaParentesis = false;
                    }
                    if (!formaParentesis) return false;
                }
            }
        }
        return cola.isEmpty();
    }

}