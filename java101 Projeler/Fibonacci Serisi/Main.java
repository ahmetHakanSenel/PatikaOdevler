import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Fibonacci serisi kac eleman olsun: ");
        int n = scanner.nextInt();

        int first = 0;
        int second = 1;

        System.out.print("Fibonacci serisi: " + first + " " + second);

        for (int i = 2; i < n; i++) {
            int next = first + second;
            System.out.print(" " + next);
            first = second;
            second = next;
        }

        System.out.println();
    }
}
