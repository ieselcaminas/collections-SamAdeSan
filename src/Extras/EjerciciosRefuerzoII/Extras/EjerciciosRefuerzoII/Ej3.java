package Extras.EjerciciosRefuerzoII.Extras.EjerciciosRefuerzoII;

public class Ej3 {
    public static void main(String[] args) {
        System.out.println(sumaDigitos("3345")); // 3345 --> 3 + 3 + 4 + 5 = 15
    }
    public static int sumaDigitos(String digitos){
        int suma = 0;
        String res = "";
        for (int i = 0; i < digitos.length(); i++){
            suma += Integer.parseInt("" + digitos.charAt(i));
            res += digitos.length() + " + ";
            if (i < digitos.length() - 1){
                res += digitos.charAt(i) + " + ";
            }else res += digitos.charAt(i) + " = " + suma;
        }
        return suma;
    }
}
