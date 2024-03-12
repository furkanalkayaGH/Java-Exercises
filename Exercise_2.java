import java.util.Arrays;
public class Exercise_2 {
    
    public static void main(String[] args){

       /* String name = "Furkan_Alkaya";
        String sentence = "Please locate where 'locate' words occured ";

        System.out.println(sentence.indexOf("locate"));
        System.out.println("Your name's lenght is : " + name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

       // String val = "We are so called \"Vikings\" from the north";
        int myRandomNums = (int)(10*Math.random());
        System.out.println("My random number is : " + myRandomNums);
        */
        /* 
        ArrayList<Integer> myRandomList = new ArrayList<>();
           int myRandomNum = (int)(10*Math.random());
           myRandomList.add(myRandomNum);
           System.out.println(myRandomList);
        }
        System.out.println(myRandomList);
        */
        int[] myArray = new int[11];
        for(int i=0;i<=10;i++){
            int myRandomNum = (int)((10*Math.random()));
            myArray[i]= myRandomNum;
        }
        System.out.println("Array:" + Arrays.toString(myArray));
        
        



    }
}
