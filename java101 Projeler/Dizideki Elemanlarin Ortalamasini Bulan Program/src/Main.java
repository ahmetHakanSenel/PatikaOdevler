public class Main {
    public static void main(String[] args) {
        int [] numbers = {1,5,9,8,7,4,6,3,2,1,59,95,94,5,94,4};
        double sum = 0;
        for (int Numbers: numbers){
            sum += 1.0/Numbers;
        }

        double harmonic = numbers.length / sum;
        System.out.println("Harmonik ortalama: " + harmonic);

    }
}