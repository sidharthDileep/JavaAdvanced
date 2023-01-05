package practice;

public class UnsortedBS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static String search(int[] arr, int n, int x) {
		
		if(arr[n-1] == x)
			return "Found";
		
		int backup = arr[n-1];
		arr[n-1] = x;
		
		
		
		return "";
	}

}
