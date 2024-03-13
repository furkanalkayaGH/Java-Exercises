package OOP.Object_Passing;

public class Main {
    public static void main(String[] args) {
        
        Car car1 = new Car("Lamborghini", "Huracan");
        Car car2 = new Car("Ford", "Mustang");

        SayName(car1);
        SayName(car2);
        Garage.ParkCar(car1);
        Garage.ParkCar(car2);
        
    }

    static void SayName(Car car){
        System.out.println("My car is: " + car.brand + " " + car.model);
    }
    
}
