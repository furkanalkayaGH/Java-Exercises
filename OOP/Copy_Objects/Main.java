package OOP.Copy_Objects;

public class Main {
    public static void main(String[] args) {
        
        Car car1 = new Car("Lamborghini", "Aventador", 2023);
        //Car car2 = new Car("Ford", "Mustang", 1969);
        Car car2 = new Car(car1);

        System.out.println(car1);
        System.out.println(car2);

        //car1.copy(car2);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car1.getBrand());
        System.out.println(car2.getBrand());
        
    }
    
}
