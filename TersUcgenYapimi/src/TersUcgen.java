import java.util.Scanner;
public class TersUcgen {
    public static void main(String[]args){
        Scanner kb = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz :");
        int n = kb.nextInt();
        int i, k, j;
        for ( i = 0; i < n ; i++) {
            for ( j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for(k= 2 * n - 1;k >= (2 * i + 1);k--){
                System.out.print("*");

            }
            System.out.println();
        }

    }
}
