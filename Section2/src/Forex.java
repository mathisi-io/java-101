public class Forex {
    public static void main(String[] args) {
        // Declaration and initialization
        String sourceCcy = "USD";
        String targetCcy = "EUR";
        float rate = 0.85008404f;
        double amount;
        double convertedAmount;
        String customer = "";

        // Assignment
        amount = 2357;
        customer = "John";

        // Process
        convertedAmount = amount * rate;
        // output
        System.out.println("Hey " + customer + " our today's rate is " + rate);
        System.out.println(
                "Here is " + targetCcy + " " + convertedAmount + " equivalent to your " + sourceCcy + " " + amount);

        // Second Customer
        customer = "Anne";
        sourceCcy = "EUR";
        targetCcy = "USD";
        rate = 1.17635f;
        amount = 54434.54;

        // Process
        convertedAmount = amount * rate;
        // output
        System.out.println("Hey " + customer + " our today's rate is " + rate);
        System.out.println(
                "Here is " + targetCcy + " " + convertedAmount + " equivalent to your " + sourceCcy + " " + amount);

    }
}
