import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Yıl giriniz: ");
        int year = input.nextInt();

        boolean artikYil = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        if (artikYil) {
            System.out.println(year + " bir artık yıldır.");
        } else {
            System.out.println(year + " bir artık yıl değildir.");
        }
    }
}
