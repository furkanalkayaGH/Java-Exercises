package OOP.Inheritance;

public class Main {
    public static void main(String[] args) {
        
        Car car = new Car();
        Bicycle bike = new Bicycle();

        //go() and stop() methods can be accessed through all the child classes
        car.go();
        bike.go();

        //brand is only accesseble for car class and pedals is only accessible for bike class
        System.out.println(car.brand);
        System.out.println(bike.pedals);
    }
    
}
