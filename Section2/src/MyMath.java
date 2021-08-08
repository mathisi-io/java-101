public class MyMath {
    
    public static void main(String[] args) {
        int a;
        int b;

        a = 4;
        b = 12;

        float div = (float) a / b;

        int num = (int)div;  // loss of info

        System.out.println(num);

        // System.out.println(a+b);
        // System.out.println(a*b);
        // System.out.println(div);
        // System.out.println(a-b);
        // System.out.println(a%b);
    }
}
