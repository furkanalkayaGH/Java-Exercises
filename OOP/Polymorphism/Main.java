package OOP.Polymorphism;

public class Main {
    public static void main(String[] args) {
        
        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Matur matur = new Matur();

        Vehicle[] racers = {car, bicycle,matur };

        for(Vehicle x : racers){
            x.go();
        }
    }
}
