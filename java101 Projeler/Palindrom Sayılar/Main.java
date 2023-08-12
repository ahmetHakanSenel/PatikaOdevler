import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println(isPolindrome(159951));;
        System.out.println(isPolindrome(17852));;


    }

    static boolean isPolindrome(int num){
        int originalNumber = num;
        int reversedNumber = 0;

        while (num > 0){
            int lastDigit = num % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            num /= 10;
        }

        return originalNumber == reversedNumber ? true : false;

    }
}
