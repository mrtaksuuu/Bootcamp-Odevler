import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz: ");
        int[] list=new int[inp.nextInt()];
        for(int i=0;i< list.length;i++){
            System.out.print("Dizinin " +(i+1)+". elemanı= ");
            list[i]=inp.nextInt();
        }
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
    }
}
