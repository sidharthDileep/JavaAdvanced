package practice.problemSolving;

import java.util.Arrays;
import java.util.List;

public class SecondHighestAndSmallest {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(7, 4, 11, 45, 3, 1, 8, 54, 2);

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		int sec_max = Integer.MIN_VALUE;
		int sec_min = Integer.MAX_VALUE;

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) > max) {
				sec_max = max;
				max = list.get(i);
			}

		}
		System.out.println(sec_max);

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) < min) {
				sec_max = min;
				min = list.get(i);
			}

		}
		System.out.println(sec_max);
	}

}
