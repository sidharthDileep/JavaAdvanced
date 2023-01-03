package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class LambdaExpAndMethodReference {

	public static void main(String[] args) {

		MathOperation addition = (a, b) -> a + b;

		MathOperation subtraction = (a, b) -> a - b;

		System.out.println(addition.solve(1, 2));

		Sayable say = (s) -> System.out.println(s);

		say.say("Hi..");

		Thread thread = new Thread(LambdaExpAndMethodReference::threadStatus);
		thread.start();

		BiFunction<Integer, Integer, Integer> adder = new Arithmetic()::add;
		adder.apply(10, 20);
		/*
		 * BiFunction<Integer, Integer, Integer> adder = (x, y) -> x+y; Integer result =
		 * adder.apply(10, 20);
		 */

		List<Runnable> list = new ArrayList<>();
		list.add(LambdaExpAndMethodReference::foo);

		for (Runnable r : list) {
			r.run();
		}

	}

	public static void greeting(String greet) {
		System.out.println(greet);
	}

	public static void threadStatus() {
		System.out.println("Thread is running..");
	}

	public static void foo() {
		System.out.println("foo");
	}

}

interface MathOperation {
	int solve(int a, int b);
}

interface Sayable {
	void say(String s);
}

class Arithmetic {
	public int add(Integer a, Integer b) {
		return a + b;
	}
}