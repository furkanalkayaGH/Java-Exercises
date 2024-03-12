public class Exercise_5 {
    public static void main(String[] args) {
        Games game_1 = new Games("Persona 3 Reload", "JRPG", 2024, true);
        Games game_2 = new Games("Project Zomboid", "Survival",2013 , false);

        game_1.getInfo();
        game_1.play();
        
        game_2.getInfo();
        game_2.play();
    }
}

class Games {
    String name;
    String genre;
    int releaseYear;
    boolean isItFun;

    Games(String name, String genre, int releaseYear,boolean isItFun){
        this.name = name;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.isItFun = isItFun;
    }

    void play(){
        System.out.println("You played " + this.name);
        if(this.isItFun == true){
            System.out.println("And it was fun!");
        }
        else System.out.println("You didn't like it :(");
    }
    void getInfo(){
        System.out.println(this.name +" is released at "+ this.releaseYear+ " and it's genre is "+ this.genre);
    }
}
