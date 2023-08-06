import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.print("Bir sayı girin: ");
            int num = scanner.nextInt();

            if (num % 2 == 1) {
                break;
            }

            if (num % 2 == 0 && num % 4 == 0) {
                sum += num;
            }
        }

        System.out.println("Girilen çift ve 4'ün katları olan sayıların toplamı: " + sum);

    }
}
