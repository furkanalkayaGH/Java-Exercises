package OOP.Encapsulation;

public class Main {

    public static void main(String[] args) {
        
        Car car = new Car("Lamborghini", "Aventador", 2023);

        System.out.println(car.getBrand());
        System.out.println(car.getModel());
        System.out.println(car.getYear());

        car.setYear(2024);

        System.out.println(car.getYear());
    }
    
}
