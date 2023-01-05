package practice.problemSolving;

public class BitwiseAlgorithms {

	public static void main(String[] args) {

		int n1 = 101; // 4
		int n2 = 110; // 3

		String s1 = Integer.toString(n1);
		String s2 = Integer.toString(n2);

		System.out.println(s1 + " " + s2);

		System.out.println(binaryAddition(s1, s2)); // 

	}

	public static String binaryAddition(String n1, String n2) {

		int len1 = n1.length();
		int len2 = n2.length();

		int carry = 0;
		String sum = "";

		int maxLen = Math.max(len1, len2);
		for (int i = 0; i < maxLen; i++) {
			int p = i < len1 ? n1.charAt(len1 - 1 - i) - '0' : 0;
			int q = i < len2 ? n1.charAt(len2 - 1 - i) - '0' : 0;
			int tmp = p + q + carry;
			carry = tmp / 2;
			sum = tmp % 2 + sum;
		}

		return (carry == 0) ? sum : "1" + sum;
	}

}
