public class MyMath {
    
    public static void main(String[] args) {
        int a;
        int b;

        a = 4;
        b = 12;

        // type casting
        float div = (float) a / b;
        int num = (int)div;  // loss of info
        
        System.out.println(a+b); //16
        System.out.println(a*b); //48
        System.out.println(div); //0.33333334
        System.out.println(a-b); // -8 
        System.out.println(a%b); // 4
        System.out.println(num); // 0
    }
}
