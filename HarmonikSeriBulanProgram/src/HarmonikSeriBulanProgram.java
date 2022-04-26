import java.util.Scanner;

public class HarmonikSeriBulanProgram {
    public static void main(String[] args) {

        int n;
        double result, i;
        result = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("N sayisini giriniz: ");
        n = input.nextInt();
        for (i = 1; i <= n; i++)
            result += (1 / i);

        System.out.println(result);


    }
}
