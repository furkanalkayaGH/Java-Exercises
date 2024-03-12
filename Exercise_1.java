import java.util.Scanner;

public class Exercise_1 {

    public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);

      System.out.println("Enter a name, age and salary: ");

        System.out.println("===============");
        
        for(int i=0;i<3;i++){
            String name = scanner.nextLine();
            int age = scanner.nextInt();
            scanner.nextLine();
            double salary = scanner.nextDouble();
            scanner.nextLine();
            scanner.close();
        
        System.out.printf("%-15s%d%f%n", name, age, salary);

                
        
        }
        System.out.println("===============");



    }



}