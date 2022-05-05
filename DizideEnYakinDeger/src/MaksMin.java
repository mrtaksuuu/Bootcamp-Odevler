import java.util.Arrays;
import java.util.Scanner;
public class MaksMin {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int[] list = {1, 2, -3, 4, 52, 6, -78, 8};
        Arrays.sort(list);
        int enyakinMin=0;
        int enyakinMax=0;
        System.out.print("Sayı giriniz: ");
        int x=kb.nextInt();
        for(int i : list){
            if(x>i){
                enyakinMin=i;
            }
            if(x<i){
                enyakinMax=i;
                break;
            }
        }
        System.out.println("Girilen sayıya yakın küçük sayı: "+enyakinMin);
        System.out.print("Girilen sayıya yakın büyük sayı: "+enyakinMax);
    }

}
