package practice;

public class LinkedListOperations {
	
	Node head;
	
	static  class Node{
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	public static LinkedListOperations insert(LinkedListOperations list, int data) {
		
		Node new_node = new Node(data);
		
		if(list.head == null) {
			list.head = new_node;
		} else {
			Node last = list.head;
			while(last != null) {
				last = last.next;
			}
			last.next = new_node;
		}
		return list;
	}
	
	public static void printList(LinkedListOperations list) {
		Node currentNode = list.head;
		
		while(currentNode != null) {
			System.out.print(currentNode.data + " ");
			currentNode = currentNode.next;
		}
	}

	public static void main(String[] args) {

	}

}
