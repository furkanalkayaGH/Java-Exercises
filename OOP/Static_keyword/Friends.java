package OOP.Static_keyword;

public class Friends {
    static int numberOfFriends;
    String name;
    
    Friends(String name){
        this.name = name;
        numberOfFriends++;
    }

    static void myFriendsList(){
        
        System.out.println("You have "+ numberOfFriends + " friends!" );
    }

}
