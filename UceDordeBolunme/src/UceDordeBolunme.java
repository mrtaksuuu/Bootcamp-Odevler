import java.util.Scanner;

public class UceDordeBolunme {
    public static void main(String[] args) {
        int k,sum=0, sayi=0;
        double average;
        Scanner kb = new Scanner(System.in);
        System.out.println("Sayi giriniz : ");
        k = kb.nextInt();
        for (int i = 0; i <= k; i++) {
            if (i % 3 == 0 && i % 4 == 0){
                sum += i;
                sayi += 1;
            }
        }
        average = sum / sayi;
        System.out.println("3 ve 4 e bolunen sayilarin toplami : " + average);


    }
}
