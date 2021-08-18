/**
 * Arrays1
 */
public class Alphabets {

    public static void main(String[] args) {
        char[] alphabets = new char[26];
        char ch = 65;
        for (int i = 0; i < alphabets.length; i++) {
            alphabets[i] = ch;
            ch++;
        }

        System.out.println(alphabets);
    }
}