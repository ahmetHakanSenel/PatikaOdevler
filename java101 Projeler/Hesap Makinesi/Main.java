import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            int sayi1, sayi2, islem, sonuc = 0;
            Scanner input = new Scanner(System.in);

            System.out.print("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\n5-Üs alma\n6-Karekök alma\nBir işlem seçin: ");
            islem = input.nextInt();

            switch (islem){
                case 1:
                    System.out.print("Toplancak sayıları girin(sayı girmeyi bitirmek için 0 girin): ");
                    sayi1 = input.nextInt();
                    while (sayi1!=0){
                        sonuc += sayi1;
                        sayi1 = input.nextInt();
                    }
                    System.out.println("Girdiğiniz sayıların toplamı: " + sonuc);
                    break;
                case 2:
                    System.out.print("Sırayla birinci ve ikinci sayıyı girin: ");
                    sayi1 = input.nextInt();
                    sayi2 = input.nextInt();
                    System.out.println("Çıkarma işleminin sonucu: " + (sayi1 - sayi2));
                    break;
                case 3:
                    System.out.print("Çarpılacak sayıları girin(sayı girmeyi bitirmek için 0 girin): ");
                    sayi1 = input.nextInt();
                    sonuc = 1;
                    while (sayi1!=0){
                        sonuc *= sayi1;
                        sayi1 = input.nextInt();
                    }
                    System.out.println("Girdiğiniz sayıların çarpımı: " + sonuc);
                    break;
                case 4:
                    System.out.print("Sırayla birinci ve ikinci sayıyı girin: ");
                    sayi1 = input.nextInt();
                    sayi2 = input.nextInt();
                    System.out.println("Bölme işleminin sonucu: " + ((float)sayi1/sayi2));
                    break;
                case 5:
                    System.out.print("Önce sayıyı sonra üssünü girin: ");
                    sayi1 = input.nextInt();
                    sayi2 = input.nextInt();
                    System.out.println("İşlemin sonucu: " + Math.pow(sayi1,sayi2));
                    break;
                case 6:
                    System.out.print("Karekökü alınacak sayıyı girin: ");
                    sayi1 = input.nextInt();
                    System.out.print("Girdiğiniz sayının karekökü: " + Math.sqrt((float)sayi1));
                    break;
            }

    }
}
