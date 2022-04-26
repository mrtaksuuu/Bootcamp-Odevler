import java.util.Scanner;
public class CiftSayiToplam {
    public static void main(String[] args){

        int n, sum = 0;
        Scanner kb = new Scanner(System.in);
        do {
            System.out.print("Sayi Giriniz : ");
            n = kb.nextInt();
            if (n % 4 == 0){
                sum += n;
            }
        }while (n % 2 == 0);
        System.out.println("Toplam : " + sum);


    }
}
