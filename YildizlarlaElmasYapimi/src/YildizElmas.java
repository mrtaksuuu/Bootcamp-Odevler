import java.util.Scanner;
public class YildizElmas {
    public static void main(String[]args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz :");
        int n = kb.nextInt();
        int i, k, j, m, y;

        for(i = 1; i <= n; i= i + 2) {       //Elmasın üst kısmını yapıyoruz.
            for(k = 1; k <= (n-i) / 2; k++)   //Sol tarafdaki boşlukları ayarlıyoruz.
                System.out.print(" ");

            for(k = 1; k <= i; k++)        // yıldız şeklimiz.
                    System.out.print("*");
                System.out.println();

        }
        for(j = n; j >= 1; j = j - 2) {    // Elmasın alt kısmını yapıyoruz
            for(m = 1; m <= (n - j) / 2 ; m++)       // Sol tarafdaki boşlukları ayarlıyoruz.
                System.out.print(" ");
            for(y = 1; y <= j; y ++)           // Yıldız şeklimiz.
                System.out.print("*");
            System.out.println();
        }



    }
}
