public class Variables {
    public static void main(String[] args) {
        // Integers - whole numbers
        int age = 16;
        int year;
        //Integer - characters
        char letter = 'A';
        System.out.println(letter);  // A
        char letterA = 65;
        System.out.println(letterA); // A
        
        //boolean
        boolean isTodayHot = true;
        System.out.println(isTodayHot); //true
        isTodayHot = false;
        System.out.println(isTodayHot); //false;
        
        year = 2021;
        System.out.println(year); // 2021
        year = 2022;
        System.out.println(year); // 2022

        // Floats
        float rate;
        rate = 2.54f;
        double balance = 9434.78;

        System.out.println(rate); // 2.54
       
        //String
        String name = "Divine";

        String message = "My name is " + name + ", I am  " + age + " and my account balance is USD " + balance;
        System.out.println(message);
    }
}
