import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list = {1, 5, 9, 8, 7, 4, 6, 3, 2, 1, 59, 95, 94, 5, 94, 4};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı girin: ");
        int sayi = scanner.nextInt();

        int nearestSmaller = -1;
        int nearestLarger = -1;

        for (int i : list) {
            if (i < sayi) {
                if (nearestSmaller == -1 || i > nearestSmaller) {
                    nearestSmaller = i;
                }
            } else if (i > sayi) {
                if (nearestLarger == -1 || i < nearestLarger) {
                    nearestLarger = i;
                }
            }
        }

        if (nearestSmaller != -1) {
            System.out.println("Girilen sayıdan küçük en yakın sayı: " + nearestSmaller);
        } else {
            System.out.println("Girilen sayıdan küçük en yakın sayı bulunamadı.");
        }

        if (nearestLarger != -1) {
            System.out.println("Girilen sayıdan büyük en yakın sayı: " + nearestLarger);
        } else {
            System.out.println("Girilen sayıdan büyük en yakın sayı bulunamadı.");
        }
    }
}
