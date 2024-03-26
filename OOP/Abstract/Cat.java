package OOP.Abstract;

public class Cat extends Animal {
    
    Cat(String name){
        this.name = name;
    }

    @Override
    public void make_sound(){
        System.out.println(name+" says meow!");
    } 
    
    @Override
    void go(){
        System.out.println("Cat is running");
    } 
}
