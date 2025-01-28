package Extras.EjerciciosRefuerzoII.Extras.EjerciciosRefuerzoII;

public class Ej6 {
    public static void main(String[] args) {
        System.out.println(esHiperpar(10));
    }
    public static boolean esHiperpar(int num){
        int numIesimo;
        do {
            numIesimo = num % 10;
            num /= 10;
            if (numIesimo % 2 != 0){
                return false;
            }
        }
        while (num > 0);
        return true;
    }
    public static class Ej6_otraForma {
        public static void main(String[] args) {
            System.out.println(esHiperpar(242));
            System.out.println(esHiperpar(236));
        }
        public static boolean esHiperpar(int num){
            String numero = String.valueOf(num);
            char digito;
            for (int i = 0; i < numero.length(); i++){
                digito = numero.charAt(i);
                if (Integer.parseInt("" + digito) % 2 != 0){
                    return false;
                }
            }
            return true;
        }
    }
}
