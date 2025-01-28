package Extras.EjerciciosRefuerzoII.Extras.EjerciciosRefuerzoII;
public class Ej5 {
    public static void main(String[] args) {
        System.out.println("[1 2 3 4] 5 [6 7 8 9]");
        System.out.println("          |____> mediana");
        System.out.println("La mediana de los números es " + mediana(new int[]{1,2,3,4, 5, 6,7,8,9}));
    }
    public static double mediana(int[] nums) {
        double mediana;
        if (nums.length % 2 == 0){
            double nums1 = nums[nums.length / 2];
            double nums2 = nums[nums.length / 2 - 1];
            mediana = (nums1 + nums2) / 2;
        }
        else{
            mediana = nums [nums.length/2];
        }
        return mediana;
    }
}
