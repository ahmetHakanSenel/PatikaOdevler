import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int n = scanner.nextInt();
        recursiveMethod(n);
    }

    public static void recursiveMethod(int num) {
        System.out.print(num + " ");

        if (num > 0) {
            recursiveMethod(num - 5);
            System.out.print(num + " ");
        } else {
            recursiveAdd(num);
        }
    }

    public static void recursiveAdd(int num) {
        if (num <= 0) {
            return;
        }

        System.out.print(num + " ");
        recursiveAdd(num + 5);
    }
}


