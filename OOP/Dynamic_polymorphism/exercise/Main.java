package OOP.Dynamic_polymorphism.exercise;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        People people;

        System.out.println("What is your job? : ");
        System.out.println("1=Doctor, 2=Engineer, 3=Lawyer");
        int choice = scanner.nextInt();
        scanner.close();

        if(choice == 1){
            people = new Doctor();
            people.speak();
        }
        else if(choice == 2){
            people = new Engineer();
            people.speak();
        }
        else if(choice == 3){
            people = new Lawyer();
            people.speak();
        }
        else{
            System.out.println("Sadly...");
            people = new People();
            people.speak();
        }
    }
}
