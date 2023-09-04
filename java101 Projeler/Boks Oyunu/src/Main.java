
public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Harun", 12, 100, 100, 50);
        Fighter f2 = new Fighter("Sarar", 20, 85, 85, 30);

        Match match = new Match(f1,f2,70,105);
        match.run();

    }
}