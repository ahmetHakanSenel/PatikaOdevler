import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double boy, kilo, vke;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz: ");
        boy = input.nextDouble();
        System.out.print("Lütfen kilonuzu girin: ");
        kilo = input.nextDouble();

        vke = kilo / Math.pow(boy,2);

        System.out.println("Vücut kitle indeksiniz: " + vke);


    }
}
