package skaiciuenigma;

import java.util.Arrays;

public class SkaiciuEnigma {
    static Rotorius r;
    

    public static void main(String[] args) {
        Inicijuoti(2);
//        char[] map = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '_', 'a'
//                , 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n'
//                , 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', ' '
//                , '.', '+', '-', '*', '/', '!', '?', ',', '.'};
        char[] map = "1234567890_".toCharArray();
        
        String zinute_str = "54721836_09";
        char[] zinute_char = zinute_str.toCharArray();

        System.out.println("Pradine zinute : "+ String.valueOf(zinute_char));
        char[] gauta = Vykdyti_char(zinute_char, map);
        System.out.println("  Gauta zinute : " + String.valueOf(gauta));
        
//        int[] skaiciai = {1,2,3,4,5,6,7,8,9,10};
//        System.out.println("Pradine zinute : " + Arrays.toString(skaiciai));
//        int[] gauti = Vykdyti_int(skaiciai);
//        System.out.println("  Gauta zinute : " + Arrays.toString(gauti));
        

    }
    private static void Inicijuoti(int n){
        r = new Rotorius(n);
    }
    
    
    private static char[] Vykdyti_char(char[] zinute, char[] map) {
            int[] uzkoduota_zinute = new int[zinute.length];
            for(int j = 0; j < zinute.length; j++){
                for(int i =0; i< map.length; i++){
                    if(zinute[j]==map[i]){
                        uzkoduota_zinute[j] = r.Koduoti(i);
                        r.Pasukti();
                        break;
                    }
                }
            }
            char[] uzkoduota_zinute_char = new char[zinute.length];
            for(int k = 0; k < uzkoduota_zinute.length; k++){
                uzkoduota_zinute_char[k] = map[uzkoduota_zinute[k]];
            }
        return uzkoduota_zinute_char;
    }
    
        private static int[] Vykdyti_int(int[] zinute) {
            int[] uzkoduota_zinute = new int[zinute.length];
            for(int j = 0; j < zinute.length; j++){
                        uzkoduota_zinute[j] = r.Koduoti(zinute[j]);                
            }
        return uzkoduota_zinute;
    }
}
