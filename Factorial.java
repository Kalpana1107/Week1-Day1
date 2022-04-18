package week1.day1;

public class Factorial {

	// Find the factorial of the number
	
	public static void main(String[] args) {
		int input = 6, fact = 1;
		
		for (int i = 1; i <= input; i++) {
			fact = fact * i;	
		}
		System.out.println(fact);
	}
}
