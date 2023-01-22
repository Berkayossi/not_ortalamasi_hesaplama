
public class Boxer {
    String name;
    int weight;
    int health;
    double dodge;
    int damage;

    Boxer(String name, int weight, int health, double dodge, int damage){
        this.name = name;
        this.weight = weight;
        this.health = health;
        this.dodge = dodge;
        this.damage = damage;
    }

    public int hit(Boxer foe){
        if(dodge()==true){
            System.out.println("Rakip vuruştan kaçtı.");
            return foe.health;
        }
        else{
            System.out.println("Rakip Hasar Aldı.");
            return foe.health - this.damage;
        }


    }

    boolean dodge() {
        double randomValue = Math.random() * 100;
        return randomValue > this.dodge ;

    }




}
