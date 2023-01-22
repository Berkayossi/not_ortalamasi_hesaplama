public class Match {
    Boxer b1;
    Boxer b2;
    int minWeight;
    int maxWeight;

    Match(Boxer b1, Boxer b2, int minWeight, int maxWeight){
        this.b1 = b1;
        this.b2 = b2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void start(){
        int round=1;
        while(b1.health>0 && b2.health>0){
            System.out.println("------------ROUND"+ round +"------------");
            b1.health = b2.hit(b1);
            b2.health = b1.hit(b2);
            round++;
            matchInfo();
        }
        Win();

    }


    void matchInfo(){
        System.out.println(b1.name + "\n Kalan Can :" + b1.health);
        System.out.println("-------------");
        System.out.println(b2.name + "\n Kalan Can" + b2.health);
    }

    void Win(){
        if (b1.health <= 0){
            System.out.println("Maçı kazanan Boksör :" + b2.name);
        }
        else if(b2.health <= 0) {
            System.out.println("Maçı kazanan Boksör :" + b1.name);
        }
    }

}
