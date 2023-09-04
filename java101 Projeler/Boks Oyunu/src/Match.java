import java.util.Random;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run(){
        Random random = new Random();
        double randomValue = random.nextDouble();
        if(isCheck()){
            while (this.f1.health > 0 && this.f2.health > 0){
                if (randomValue > 0.5){
                    f2.health = f1.hit(f2);
                    System.out.println(f1.name + ": " + f1.health + " || " + f2.name + ": " + f2.health);
                    if(isWin()) break;
                    f1.health = f2.hit(f1);
                    System.out.println(f1.name + ": " + f1.health + " || " + f2.name + ": " + f2.health);
                    if(isWin()) break;
                }else{
                    f1.health = f2.hit(f1);
                    System.out.println(f1.name + ": " + f1.health + " || " + f2.name + ": " + f2.health);
                    if(isWin()) break;
                    f2.health = f1.hit(f2);
                    System.out.println(f1.name + ": " + f1.health + " || " + f2.name + ": " + f2.health);
                    if(isWin()) break;
                }
            }
        }else {
            System.out.println("Sporcuların sikletleri uymuyor!");
        }
    }

    boolean isCheck(){
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean isWin(){
        if (this.f1.health == 0){
            System.out.println(this.f2.name + " kazandı!!");
            return true;
        }

        if (this.f2.health == 0){
            System.out.println(this.f1.name + " kazandı!!");
            return true;
        }

        return false;
    }
}
