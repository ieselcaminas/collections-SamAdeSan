package Extras.EjerciciosRefuerzoII.Extras.EjerciciosRefuerzoII;

import java.util.HashMap;
import java.util.Map;
public class Ej4 {
    public static void main(String[] args) {
        System.out.println(moda(new int[]{3,4,5,5,6,3,4}));
    }
    public static int moda(int[] nums){
        Map<Integer, Integer> mapa = new HashMap<>();
        Integer veces;
        for (int i = 0; i < nums.length; i++) {
            veces = mapa.get(nums[i]);
            if (veces == null) {
                mapa.put(nums[i], 1);
            }else mapa.put(nums[i], mapa.get(nums[i]) + 1);
        }
        return 0;
    }
}
