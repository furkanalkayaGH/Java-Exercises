package OOP.Abstract;

public class Dog extends Animal {
    
    @Override
    public void make_sound(){
        System.out.println("Dog says bark!");
    } 

    @Override
    public void go(){
        System.out.println("Dog is running!");
    }
    
}
