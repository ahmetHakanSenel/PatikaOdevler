public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;

    Fighter(String name, int damage, int health, int weight, int dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    int hit(Fighter foe){
        if (foe.isDodge()){
            System.out.println(foe.name + " gelen hasarı blokladı!");
            return foe.health;
        }
        System.out.println(this.name + " => " + foe.name + " " + this.damage + " hasar vurdu!");
        foe.health -= this.damage;

        if (foe.health <= 0)
            return 0;
        else
            return foe.health;
    }

    boolean isDodge(){
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.dodge;

    }
}
