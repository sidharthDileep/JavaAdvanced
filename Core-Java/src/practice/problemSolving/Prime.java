package practice.problemSolving;

public class Prime {

	public static void main(String[] args) {

		int n = 35;

		System.out.println(isPrime(n));

	}

	static int i = 2;

	static boolean isPrime(int n) {

		if (n == 0 || n == 1)
			return false;

		if (n == i)
			return true;

		if (n % i == 0)
			return false;

		i++;

		return isPrime(n);
	}
}
