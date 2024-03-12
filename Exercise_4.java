import java.util.*;

public class Exercise_4 {
    

public static void main(String[] args) {

   Calendar cal = Calendar.getInstance();

   int dayOfWeek = cal.get(Calendar.DAY_OF_MONTH);

   String dayOfWeekString = "";
   switch(dayOfWeek){
    case Calendar.SUNDAY:
        dayOfWeekString = "SUNDAY";
        break;
    case Calendar.MONDAY:
        dayOfWeekString = "MONDAY";
        break;
    case Calendar.TUESDAY:
        dayOfWeekString = "TUESDAY";
        break;
    case Calendar.WEDNESDAY:
        dayOfWeekString = "WEDNESDAY";
        break;
    case Calendar.THURSDAY:
        dayOfWeekString = "THURSDAY";
        break;
    case Calendar.FRIDAY:
        dayOfWeekString = "FRIDAY";
        break;
    case Calendar.SATURDAY:
        dayOfWeekString = "SATURDAY";
        break;
        
   }
   System.out.println(dayOfWeekString);
   System.out.println(dayOfWeek);

   


}
}
