
public class Practice1 {

	public static void main(String[] args) {
		//100 .. 0
		//1. Initiate the value to 100
		//2. check if the number is greater or equal 0
		//3. result = number % 5 
		//4. check if result == 0
		//5. if true: print it
		//6. else: raise power of 2 and print the result
		//7. decrement the number by 10
		//8. Repeat 2 to 7
		//9. end
	
		int result = 0;

		for(int n = 100; n >= 0; n -=10) {
			result = n % 5;
			if (result == 0) {
				System.out.println(n);
			}
		}
	}

	//
}
