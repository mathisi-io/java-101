import java.time.LocalDate;
import java.util.Scanner;

/**
 * CurrencyExchange: Takes inputs (Source Currency, Amount and Destination
 * Currency) from user calculates the equivalent amount in Target currency based
 * on exchange rates outputs the result
 */
public class CurrencyExchange {

    public static void main(String[] args) {
        // Declaring and initializing exchange rates
        float EUR_USD = 1169.984f;
        float USD_EUR = 0.854730f;
        float GBP_EUR = 1.175194f;
        float EUR_GBP = 0.850940f;

        LocalDate today = LocalDate.now();
        System.out.println("****** Today: " + today + "**********");
        System.out.println("----------------------------------");
        System.out.println("** EUR -> USD : " + EUR_USD);
        System.out.println("** EUR -> GBP : " + EUR_GBP);
        System.out.println("** GPB -> EUR : " + GBP_EUR);
        System.out.println("** USD -> EUR : " + USD_EUR);
        System.out.println("**********************************");

        // Get input from the user
        Scanner reader = new Scanner(System.in);
        System.out.print("Amount received: ");
        double amount = reader.nextDouble();
        System.out.print("Currency (eg USD): ");
        String fromCcy = reader.next();
        System.out.print("Desired Currency: ");
        String toCcy = reader.next();
        reader.close();

        String ccy = fromCcy.toUpperCase() + "_" + toCcy.toUpperCase();
        double convertedAmount = 0.0;

        // Calculate amount in desired currency
        switch (ccy) {
            case "USD_EUR":
                convertedAmount = amount * USD_EUR;
                break;
            case "EUR_USD":
                convertedAmount = amount * EUR_USD;
                break;
            case "EUR_GBP":
                convertedAmount = amount * EUR_GBP;
                break;
            case "GBP_EUR":
                convertedAmount = amount * GBP_EUR;
                break;
            default:
                convertedAmount = -1;
        }

        //Output the result
        String message; 
        if (convertedAmount > 0) {
            message = fromCcy + " " + amount + " = "+ toCcy + " "+ convertedAmount;
        }else {
            message = "Unsupported currency conversion: "+ fromCcy + " -> " + toCcy;
        }
        System.out.println(message);
    }

}