import java.util.Scanner;

public class JavaMethods {
    
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Enter Your Name: ");
    String name = scanner.nextLine();
    System.out.println("Enter Your Name: ");
    String surname = scanner.nextLine();
    System.out.println("Enter Your age: ");
    int age = scanner.nextInt();
    scanner.close();

    int num1 = 24;
    int num2 = 34;

    myMethod(name, age);
    System.out.println(nameSurname(name, surname));
    System.out.println(add(num1,num2));
    }

    static void myMethod(String name, int age){

    System.out.println("Hello, my name is "+ name +" and I am "+ age + " years old.");


    }
    static int add(int a, int b){
        return a+b;
    }
    static String nameSurname(String name, String surname){
        return name + surname; 
    }



}
