import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password, newPassword;
        int secim;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adınız: ");
        userName = input.nextLine();

        System.out.print("Şifreniz: ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş yaptınız");
        } else {
            System.out.print("Bilgileriniz yanlış.\nŞifrenizi sıfırlamak için 1'e basın.");
            secim = input.nextInt();
            if (secim == 1) {
                input.nextLine(); // newline karakterini tüketmek için
                System.out.print("Yeni şifrenizi girin: ");
                newPassword = input.nextLine();
                while (newPassword.equals("java123")) {
                    System.out.print("Yeni şifreniz eskisiyle aynı olamaz. Başka bir şifre deneyin. ");
                    newPassword = input.nextLine();
                }
                System.out.println("Şifre başarıyla oluşturuldu.");
            }
        }
    }
}
