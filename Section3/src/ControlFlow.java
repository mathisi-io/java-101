
public class ControlFlow {

	public static void main(String[] args) {
		// 1,2,3,4,5,6,7,8,9,10
		// 1,3,5,7,9 //odd numbers

		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		//i = 1;  1 % 2 => 5 != 0 -> Y
		//i = 2; 2 % 2 => 0 != 0 -> N
		
	}
}
