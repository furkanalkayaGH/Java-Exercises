package OOP;

public class Car {

    String brand;
    String model;
    double price;

    Car(String brand, String model,Double price ){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void start(){
        System.out.println("You started the "+ this.brand +" "+ this.model);
    }

}
