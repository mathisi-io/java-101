import java.util.Scanner;

public class StringAccumulator {
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String input = "";
        String text = "";
        
        System.out.println("Keep typing and when done, enter EXIT to stop the program");
        System.out.println("---------------------------------------------------------\n");

        do {
            input = reader.nextLine();
            text += input;
        } while (!input.equalsIgnoreCase("EXIT"));
        
        reader.close();
        
        System.out.println(text);
    }
}
