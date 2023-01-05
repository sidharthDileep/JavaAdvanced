package practice.problemSolving;

public class Fibonacci {

	public static void main(String[] args) {
		
		int n = 10;
		
		int a = 0, b = 1;
		int c = 0;
		while(n > 1) {
			c = a + b;
			a = b;
			b = c;
			n--;
		}
		
		System.out.println(c);

	}

}
