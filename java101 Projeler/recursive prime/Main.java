import java.util.Scanner;

public class Main {

    static boolean isPrime(int number, int divisor) {
        if (number <= 2) {
            return (number == 2); // 2 asal sayıdır.
        }
        if (number % divisor == 0) {
            return false; // Eğer bölen bulunduysa asal değil
        }
        if (divisor * divisor > number) {
            return true; // Bölen yoksa asaldır.
        }
        return isPrime(number, divisor + 1); // Bir sonraki böle kadar devam et.
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int number = scanner.nextInt();

        if (isPrime(number, 2)) {
            System.out.println(number + " bir asal sayıdır.");
        } else {
            System.out.println(number + " bir asal sayı değildir.");
        }
    }

}
