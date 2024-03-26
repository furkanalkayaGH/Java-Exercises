package OOP.Abstract;


public abstract class Animal {

    String name;
    public abstract void make_sound();
    
    abstract void go();
    
public static void run(){
    System.out.println("Animal ran!");
}

    public static void main(String[] args) {
        
        Cat cat = new Cat("Osuruklu");
        Dog dog = new Dog();

        cat.make_sound();
        cat.go();
        dog.make_sound();
        
    }
}
