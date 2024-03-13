package OOP.Array_of_Objects;

public class Main {
    public static void main(String[] args) {
     
      Food food1 = new Food("Banana", "Yellow");
      Food food2 = new Food("Apple", "Red");
      Food food3 = new Food("Pear", "Green");

      Food[] fridge = {food1,food2,food3};

      
      System.out.println(food1.color);
      System.out.println(food3.name);

    }
    
}
