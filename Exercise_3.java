//import java.util.Scanner;

public class Exercise_3 {

    public static void main(String[] args) {
        
        /*Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter a Day as number(1 to 8): ");
        int day = scanner.nextInt();

        switch (day){

        case 1:
            System.out.println("Monday");
        break;

        case 2:
            System.out.println("Tuesday");
        break;

        case 3:
            System.out.println("Wednesday");
        break;

        default:
            System.out.println("so on");
        
        }
*/
/* 
        int num = 5;

        do{
            System.out.println(num);
            num +=1;
        }
        while (num<10);
*/
        String A = "java";
        String B = "java";

        System.out.println(A.length() + B.length());
        System.out.println(capitalizeFirstLetter(A) + " " + capitalizeFirstLetter(B));
        System.out.println(dict(A, B));
    
    }

    private static String capitalizeFirstLetter(String str){
    if (str == null || str.isEmpty()){
        return str;
    }
    
    return str.substring(0,1).toUpperCase() + str.substring(1);
    }

    private static String dict(String str_1, String str_2 ){
        if(str_1.compareTo(str_2)>0){
            return "Yes";
        }
        else{
            return "No";
        }
        
    }
}
