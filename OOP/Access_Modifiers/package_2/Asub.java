package OOP.Access_Modifiers.package_2;

import OOP.Access_Modifiers.package_1.*;

public class Asub extends A {
    public static void main(String[] args) {
        
        Asub asub = new Asub();
        //Protected variables can be accessed from diffirent packages and can be accessible from it's subclass
        System.out.println(asub.protectedMessage);
      
    }
}