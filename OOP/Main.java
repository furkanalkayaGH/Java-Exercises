package OOP;

public class Main {
    public static void main(String[] args) {

        Car myCar1 = new Car("Ford", "Mustang", 5421.0);
        Car myCar2 = new Car("Lamboghini", "Huracan", 249.865);


        System.out.println("My new car's brand is: "+ myCar2.brand + " and it's model is: " + myCar2.model);
        System.out.println("My friend's new car's model is: "+ myCar1.model);

        myCar2.start();

    }
}
