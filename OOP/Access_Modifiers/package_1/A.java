package OOP.Access_Modifiers.package_1;

public class A {
    //Public variables can be accessed from anywhere
    public String publicMessage = "This is a public message";
    //Default variables can be accessed from same package and same class
    String defaultMessage = "This is a default message";
    protected String protectedMessage = "This is a protected message";
    private String privateMessage = "This is a private message";

    public static void main(String[] args) {
        //Private variables can only be accessed in same class
        A a = new A();
        System.out.println(a.privateMessage);
    }
}
