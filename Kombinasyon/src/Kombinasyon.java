import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        int a, b, c,i, eleman, secim;
        double komb;
        a = 1;
        b = 1;
        c = 1;

        System.out.print("Eleman sayisini giriniz : ");
        eleman = kb.nextInt();
        System.out.print("Secim sayisini giriniz : ");
        secim = kb.nextInt();

        for(i = 1;i <= eleman; i++){
            a *= i;
        }for(i = 1;i <= secim; i++){
            b *= i;
        }for(i = 1;i <= (eleman-secim); i++){
            c *= i;
        }

        komb = a / (b * c);
        System.out.println("Sonuc : "+komb);


    }
}
