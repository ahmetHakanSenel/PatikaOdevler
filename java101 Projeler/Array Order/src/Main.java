import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dizi boyutunu girin: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        int max=0, min = max;

        for (int i = 0; i < n; i++){
            System.out.print("Dizinin " + (i+1) + ". elemanını girin:");
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if (arr[i] < arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        System.out.println("Sıralama: " + Arrays.toString(arr));
    }
}