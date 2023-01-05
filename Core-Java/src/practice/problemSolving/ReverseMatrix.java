package practice.problemSolving;

import java.util.Arrays;

public class ReverseMatrix {

	public static void main(String[] args) {
		
		int[][] matrix = {{1,2,3,4},
						  {5,6,7,8},
						  {9,10,11,12},
						  {13,14,15,16}};
		int n = matrix.length;

		reverseMatrix(matrix, n);


	}

	public static void reverseMatrix(int matrix[][], int n) {
		
		int c = matrix[0].length;
		int r = n;
		
		/*
		 * for(int i=r-1; i>=0; i--) { for(int j=c-1; j>=0; j--) { //swap(matrix, i, j);
		 * int temp = matrix[r-1-i][c-1-j]; matrix[r-1-i][c-1-j] = matrix[i][j];
		 * matrix[i][j] = temp; } }
		 */
		
		 for (int i = 0; i < n; i++) {
	            for (int j = i; j < n; j++) {
	                int temp = matrix[i][j];
	                matrix[i][j] = matrix[j][i];
	                matrix[j][i] = temp;
	            }
	        }

		System.out.println(Arrays.deepToString(matrix));
	}
	
	public static void swap(int[][] matrix, int i, int j) {
		
		int temp = matrix[i][j];
		matrix[i][j] = matrix[j][i];
		matrix[j][i] = temp;
		
	}

}
