import java.util.Scanner;

public class BasamakSayiToplami {
    public static void main(String[] args){

        Scanner kb= new Scanner(System.in);
        int n,basValue,result;
        basValue = 0;
        result = 0;
        /* 1643 / 10 = 164    1643 % 10 = 3
            164 / 10 = 16      164 % 10 = 4
             16 / 10 = 1        16 % 10 = 6
              1 / 10 = 0         1 % 10 = 1
              0 / 10 = 0                           */
        System.out.print("Sayi giriniz : ");
        n= kb.nextInt();
        while (n != 0){
            basValue = n % 10;
            result += basValue;
            n /= 10;
        }
        System.out.println(result);




    }
}
