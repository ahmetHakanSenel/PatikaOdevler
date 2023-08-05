import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double yaricap, pi = 3.14, cevre, alan, mAci, verAlan;
        Scanner input = new Scanner(System.in);

        System.out.print("Yarıcapı girin: ");
        yaricap = input.nextDouble();

        System.out.print("Merkez açı girin: ");
        mAci = input.nextDouble();

        alan = pi * Math.pow(yaricap,2);
        cevre = 2 * pi * yaricap;
        verAlan = (pi * Math.pow(yaricap,2) * mAci) / 360;

        System.out.println("Dairenin çevresi " + cevre + ", alanı " + alan + ", daire diliminin alanı " + verAlan);


    }
}
