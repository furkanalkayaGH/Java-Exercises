import java.util.*;

public class Calendar_ex {

    public static void main(String[] args) {

    Calendar calendar = Calendar.getInstance();
    int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
    int month = calendar.get(Calendar.MONTH);
    int day = calendar.get(Calendar.DATE);
    int year = calendar.get(Calendar.YEAR);

    String[] daysOfWeek = {"Pazar", "Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi"};
    String[] months = {"Ocak", "Şubat", "Mart", "Nisan", "Mayıs", "Haziran", "Temmuz", "Ağustos", "Eylül", "Ekim", "Kasım", "Aralık"};
    
    System.out.println(day + " " + months[month].toUpperCase() + " " + year + " " + daysOfWeek[dayOfWeek].toUpperCase());
       
    
 }
}
