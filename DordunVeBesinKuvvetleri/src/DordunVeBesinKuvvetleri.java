import java.util.Scanner;

public class DordunVeBesinKuvvetleri {
    public static void main(String[] args){

        int n, i;
        Scanner kb = new Scanner(System.in);
        System.out.print("Sayi Giriniz: ");
        n = kb.nextInt();
        for (i = 1; i <= n; i *= 4)
            System.out.println("Dordun katlari: "+ i);

        for (i = 1; i <= n; i *= 5)
            System.out.println("Besin katlari: " + i);



    }
}
