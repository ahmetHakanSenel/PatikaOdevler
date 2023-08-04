import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a, b, c;

        Scanner input = new Scanner(System.in);

        System.out.print("1. kenarı girin: ");
        a = input.nextInt();
        System.out.print("2. kenarı girin: ");
        b = input.nextInt();
        System.out.print("3. kenarı girin: ");
        c = input.nextInt();

        double u = (a+b+c)/2;
        double cevre = 2*u;
        double alan = Math.sqrt(u * (u-a) * (u-b) * (u-c));

        System.out.println("Üçgenin alanı: " + alan + ", çevresi: " + cevre);

    }
}
