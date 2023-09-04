public class Main {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10, 2, 6, 14, 8, 10, 12, 12, 16,15,1,1,3,8,494,12,3};

        System.out.println("Tekrar eden çift sayılar:");

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                boolean isDuplicate = false;
                for (int j = 0; j < i; j++) {//Tekrar edenlerin tekrar etmemesi için
                    if (numbers[j] == numbers[i]) {
                        isDuplicate = true;
                        break;
                    }
                }
                if (!isDuplicate) {
                    int count = 0;
                    for (int j = i; j < numbers.length; j++) {
                        if (numbers[j] == numbers[i]) {
                            count++;
                        }
                    }
                    if (count > 1) {
                        System.out.println(numbers[i]);
                    }
                }
            }
        }
    }
}