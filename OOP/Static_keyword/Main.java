package OOP.Static_keyword;

public class Main {
    public static void main(String[] args) {
        Friends friend1 = new Friends("Spongebob");
        Friends friend2 = new Friends("Patrick");
        Friends friend3 = new Friends("Sandy");

        
        System.out.println(Friends.numberOfFriends);

        Friends.myFriendsList();
    }
    
}
