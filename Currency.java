import java.text.NumberFormat;
import java.util.*;

public class Currency {
    
    public static void main(String[] args) {
        double amount = 12.250; 

        
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.US);
        String formattedAmount = currencyFormat.format(amount);
        
        System.out.println(formattedAmount);


    }


}
