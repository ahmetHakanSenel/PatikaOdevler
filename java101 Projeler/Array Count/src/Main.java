public class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 20, 10, 10, 20, 5, 20};

        int[] frequencies = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            if (frequencies[i] == -1) {
                continue;
            }

            int count = 1;

            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                    frequencies[j] = -1;
                }
            }

            frequencies[i] = count;
        }

        System.out.println("Tekrar Sayıları:");

        for (int i = 0; i < numbers.length; i++) {
            if (frequencies[i] != -1) {
                System.out.println(numbers[i] + " sayısı " + frequencies[i] + " kere tekrar edildi.");
            }
        }

    }
}