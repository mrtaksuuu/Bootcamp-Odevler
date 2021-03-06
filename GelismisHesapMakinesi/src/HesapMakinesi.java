import java.util.Scanner;
public class HesapMakinesi {
    static void plus() {
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". sayi :");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Sonuc : " + result);
    }

    static void minus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kac adet sayi gireceksiniz :");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayi :");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Sonuc : " + result);
    }

    static void times() {
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". sayi :");
            number = scan.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Sonuc : " + result);
    }

    static void divided() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kac adet sayi gireceksiniz :");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayi :");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Boleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Sonuc : " + result);
    }

    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban degeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Us degeri giriniz :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuc : " + result);
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayi giriniz :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuc : " + result);
    }

    static void mod(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Modu alinacak sayi :");
        int a = scan.nextInt();
        System.out.print("Kaca gore mod alinsin :");
        int b= scan.nextInt();
        int result=0;

        result= a % b;
        System.out.println("Sonuc :" + result);
    }
    static void dikdortgen(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Uzun kenari girin :");
        int uzun= scan.nextInt();
        System.out.print("Kisa kenari girin :");
        int kisa= scan.nextInt();
        int alan, cevre;

        alan = uzun * kisa;
        cevre = (uzun + kisa) * 2;
        System.out.println("Alan :" + alan);
        System.out.println("Cevre :" + cevre);

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu =
                  "1- Toplama ????lemi\n"
                + "2- ????karma ????lemi\n"
                + "3- ??arpma ????lemi\n"
                + "4- B??lme i??lemi\n"
                + "5- ??sl?? Say?? Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikd??rtgen Alan ve ??evre Hesab??\n"
                + "0- ????k???? Yap";
        do {
            System.out.println(menu);
            System.out.print("L??tfen bir i??lem se??iniz :");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    dikdortgen();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanl???? bir de??er girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);
    }
}
