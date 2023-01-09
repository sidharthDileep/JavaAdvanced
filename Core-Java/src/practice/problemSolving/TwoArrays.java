package practice.problemSolving;

import java.util.Arrays;
import java.util.stream.IntStream;

public class TwoArrays {

	public static void main(String[] args) {

		int arr1[] = { 1, 2, 3 };
		int arr2[] = { 1, 2, 4 };
		
		int len1 = arr1.length;
		int len2 = arr2.length;
		
		int arr[] = new int[len1+len2];

		arr = IntStream.concat(IntStream.of(arr1), IntStream.of(arr2))
				 .distinct()
				 .sorted()
				 .toArray();

		System.out.println(Arrays.toString(arr));

	}

}
