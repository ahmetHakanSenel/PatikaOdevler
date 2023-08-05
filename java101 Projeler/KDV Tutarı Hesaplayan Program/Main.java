import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double fiyat, kdv, sonFiyat;
        Scanner input = new Scanner(System.in);

        System.out.print("Ürün fiyatını girin: ");
        fiyat = input.nextFloat();

        if (fiyat<=1000)
            kdv = fiyat * 0.18;
        else
            kdv = fiyat * 0.08;

        sonFiyat = kdv + fiyat;

        System.out.println("KDV'siz fiyat: " + fiyat + "\nKDV'li fiyat: " + sonFiyat + "\nKDV tutarı: " + kdv);
    }
}
