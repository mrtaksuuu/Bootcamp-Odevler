import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {

        Scanner kb= new Scanner(System.in);
        int n, k, i, total;
        System.out.print("Ussu alinacak sayiyi giriniz : ");
        n= kb.nextInt();
        System.out.print("Us olacak sayiyi giriniz : ");
        k= kb.nextInt();
        total = 1;

        for (i = 1; i <= k; i++){
            total *= n;
        }
        System.out.println(n+ "Cevap : " +total);



    }
}
