package OOP.oInterface;

public class Fish implements Prey,Predator {

    @Override
    public void hunt(){
        System.out.println("*Fish is hunting the smaller fish*");
    }
    
    @Override
    public void flee(){
        System.out.println("*Fish is fleeing*");
    }

}
