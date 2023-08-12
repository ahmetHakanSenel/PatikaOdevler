import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Taban değeri giriniz: ");
        int taban = scanner.nextInt();

        System.out.print("Üs değeri giriniz: ");
        int us = scanner.nextInt();

        int result = uslu(taban, us);
        System.out.println("Sonuç: " + result);


    }

    static int uslu(int taban, int us){
        if (us == 0)
            return 1;
        else if (us < 0)
            return 1/ uslu(taban, -us);
        else
            return taban * uslu(taban , us-1);
    }

}
