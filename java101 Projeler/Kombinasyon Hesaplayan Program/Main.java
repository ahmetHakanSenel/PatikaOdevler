import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        System.out.print("Enter the value of r: ");
        int r = scanner.nextInt();

        scanner.close();

        if (n < 0 || r < 0 || r > n) {
            System.out.println("Invalid input!");
        } else {
            int k = 1;
            for (int i = 1; i <= n; i++) {
                k *= i;
            }

            int s = 1;
            for (int i = 1; i <= r; i++) {
                s *= i;
            }

            for (int i = 1; i <= n - r; i++) {
                s *= i;
            }

            int result = k / s;
            System.out.println("C(" + n + "," + r + ") = " + result);
        }
    }
}
