package OOP.Dynamic_polymorphism;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Animal animal;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an animal: ");
        System.out.println("(1 = Cat and 2 = Dog)");
        int choice = scanner.nextInt();
        scanner.close();

        if(choice == 1){
            animal = new Cat();
            animal.speak();
        }
        else if (choice == 2){
            animal = new Dog();
            animal.speak();
        }
        else{
            animal = new Animal();
            System.out.println("You selected an invalid command...");
            animal.speak();
        }
    }
    
}
