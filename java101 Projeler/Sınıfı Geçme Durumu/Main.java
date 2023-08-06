import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fiz, kim, trk, trh, mzk;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunu giriniz: ");
        mat = input.nextInt();
        while (mat<0 || mat>100){
            System.out.print("Lütfen 0-100 aralığında sayı girin: ");
            mat = input.nextInt();
        }
        System.out.print("Fizik notunu giriniz: ");
        fiz = input.nextInt();
        while (fiz<0 || fiz>100){
            System.out.print("Lütfen 0-100 aralığında sayı girin: ");
            fiz = input.nextInt();
        }
        System.out.print("Kimya notunu giriniz: ");
        kim = input.nextInt();
        while (kim<0 || kim>100){
            System.out.print("Lütfen 0-100 aralığında sayı girin: ");
            kim = input.nextInt();
        }
        System.out.print("Türkçe notunu giriniz: ");
        trk = input.nextInt();
        while (trk<0 || trk>100){
            System.out.print("Lütfen 0-100 aralığında sayı girin: ");
            trk = input.nextInt();
        }
        System.out.print("Tarih notunu giriniz: ");
        trh = input.nextInt();
        while (trh<0 || trh>100){
            System.out.print("Lütfen 0-100 aralığında sayı girin: ");
            trh = input.nextInt();
        }
        System.out.print("Müzik notunu giriniz: ");
        mzk = input.nextInt();
        while (mzk<0 || mzk>100){
            System.out.print("Lütfen 0-100 aralığında sayı girin: ");
            mzk = input.nextInt();
        }

        float ort = (mat+fiz+kim+trk+trh+mzk)/6;

        System.out.println("Ortalamanız: " + ort + (ort >= 55 ? " \nGeçtiniz" : "\nKaldınız"));

    }
}
