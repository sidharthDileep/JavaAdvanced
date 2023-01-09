package practice.problemSolving;

public class Palindrome {

	public static void main(String[] args) {
		
		//String s = "malayalam";
		String s = "cppc";
		int n = s.length()-1;
		boolean flag = true;
		
		for(int i=0; i<n/2+1; i++) {
			if(s.charAt(i) != s.charAt(n)) {
				flag = false;
			}
			n--;
		}
		
		if(flag)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
		

	}

}
