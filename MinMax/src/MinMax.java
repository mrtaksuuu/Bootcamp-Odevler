import java.util.Scanner;
public class MinMax {
    public static void main(String[] args){

        Scanner inp =new Scanner(System.in);
        int maks=0;
        int min=0;
        for (int i=1; i<=4; i++)
        {
            System.out.print(i+". sayiyi giriniz: ");
            int sayi = inp.nextInt();

            if (i==1)
            {
                maks=sayi;
                min=sayi;
            }

            if (sayi>maks)
                maks=sayi;

            if (sayi<min)
                min=sayi;
        }

        System.out.println("En buyuk olani: "+maks);
        System.out.println("En kucuk olani: "+min);



    }
}
