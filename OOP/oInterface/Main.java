package OOP.oInterface;

public class Main {
    public static void main(String[] args) {
        
        Hawk hawk = new Hawk();
        Rabbit rabbit = new Rabbit();
        Fish fish = new Fish();

        rabbit.flee();
        hawk.hunt();
        fish.hunt();
        fish.flee();
    }
    
}
