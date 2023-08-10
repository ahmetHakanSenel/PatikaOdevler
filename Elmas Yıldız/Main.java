import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin (tek sayı): ");
        int n = scanner.nextInt();

        if (n % 2 == 0) {
            while (n%2==0){
                System.out.println("Lütfen tek sayı giriniz.");
                n = scanner.nextInt();
            }
        }

        int yildizSayisi = 1;
        int boslukSayisi = n / 2;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < boslukSayisi; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < yildizSayisi; j++) {
                System.out.print("*");
            }

            System.out.println();

            if (i < n / 2) {
                boslukSayisi--;
                yildizSayisi += 2;
            } else {
                boslukSayisi++;
                yildizSayisi -= 2;
            }
        }
    }
}
