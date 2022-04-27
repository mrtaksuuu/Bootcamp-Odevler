import java.util.Scanner;
public class AsalSayi {
    public static void main(String[] args){

        boolean isPrime = true;

        for (int i = 2; i <= 100; i++){
            isPrime = true;

            for (int n=2; n<i; n++ ){
                if (i%n == 0) {
                    isPrime = false;
                }
            }
            if (isPrime){
                System.out.print(i + "//");
            }
        }
    }
}
