package Extras.EjerciciosRefuerzoII.Flujos;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Skin color?");
        String color = sc.nextLine();
        if (color.equals("black")) {
            System.out.println("Nigga");
        }
        else System.out.println("Pass");
    }
}
