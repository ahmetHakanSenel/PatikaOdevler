import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat, fiz, kim, trk, trh, mzk;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunu giriniz: ");
        mat = input.nextInt();
        System.out.print("Fizik notunu giriniz: ");
        fiz = input.nextInt();
        System.out.print("Kimya notunu giriniz: ");
        kim = input.nextInt();
        System.out.print("Türkçe notunu giriniz: ");
        trk = input.nextInt();
        System.out.print("Tarih notunu giriniz: ");
        trh = input.nextInt();
        System.out.print("Müzik notunu giriniz: ");
        mzk = input.nextInt();

        float ort = (mat+fiz+kim+trk+trh+mzk)/6;

        System.out.println("Ortalamanız: " + ort + (ort >= 60 ? " \nGeçtiniz" : "\nKaldınız"));
    }
}
