package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class CollectionsPractice {

	public static void main(String[] args) {

		Set<Integer> set = new TreeSet<>();

		List<Integer> list = Arrays.asList(2, 11, 5, 31, 7, 13, 3, 17, 23, 29);

		set.addAll(list);

		System.out.println(set);

		Stack<Integer> stack = new Stack<>();
		stack.push(2);
		stack.push(3);
		stack.push(5);
		stack.push(7);
		stack.pop();
		stack.push(11);

		System.out.println(stack);
		System.out.println(stack.add(13));
		System.out.println(stack.push(17));

		TreeSet<Integer> revSet = new TreeSet<>(Collections.reverseOrder());
		revSet.addAll(set);

		System.out.println(revSet);

		Employee emp1 = new Employee(1L, "Sidharth", "Dileep");
		Employee emp2 = new Employee(1L, "Arjun", "Ar");

		TreeSet<Employee> empSet = new TreeSet<>(Comparator.comparing(Employee::getLastName));
		empSet.add(emp1);
		empSet.add(emp2);

		empSet.forEach(e -> System.out.println(e.getFirstName()));

		try (FileOutputStream fileOutPutStream = new FileOutputStream("")) {

			String msg = "Hello";
			byte byteArray[] = msg.getBytes();
			fileOutPutStream.write(byteArray);

		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		

	}

}

class Employee {

	long id;
	String firstName;
	String lastName;

	public Employee(long id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
