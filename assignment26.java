//  Intersection of two linked lists

import java.util.*;

class iteoll{


static class Node
{
	int data;
	Node next;
};

static Node sortedIntersect(Node a,
							Node b)
{
	
	
	if (a == null || b == null)
		return null;

	

	
	
	if (a.data < b.data)
		return sortedIntersect(a.next, b);

	if (a.data > b.data)
		return sortedIntersect(a, b.next);

    
    Node temp = new Node();
	temp.data = a.data;

	
	temp.next = sortedIntersect(a.next,
								b.next);
	return temp;
}




static Node push(Node head_ref, int new_data)
{
	

	Node new_node = new Node();


	new_node.data = new_data;

	
	new_node.next = head_ref;

	head_ref = new_node;
	return head_ref;
}



static void printList(Node node)
{
	while (node != null)
	{
		System.out.print(" " + node.data);
		node = node.next;
	}
}


public static void main(String[] args)
{
	
	
	Node a = null;
	Node b = null;
	Node intersect = null;

	a = push(a, 6);
	a = push(a, 5);
	a = push(a, 4);
	a = push(a, 3);
	a = push(a, 2);
	a = push(a, 1);

	
	
	b = push(b, 8);
	b = push(b, 6);
	b = push(b, 4);
	b = push(b, 2);

	
	intersect = sortedIntersect(a, b);

	System.out.print("\n Linked list containing "
		+ "common items of a & b \n ");
	printList(intersect);

    }
}

/* Java program to check if linked list is palindrome */


class linkedList {
	public static void main(String args[])
	{
		Node one = new Node(1);
		Node two = new Node(2);
		Node three = new Node(3);
		Node four = new Node(4);
		Node five = new Node(3);
		Node six = new Node(2);
		Node seven = new Node(1);
		one.ptr = two;
		two.ptr = three;
		three.ptr = four;
		four.ptr = five;
		five.ptr = six;
		six.ptr = seven;
		boolean condition = isPalindrome(one);
		System.out.println("isPalidrome :" + condition);
	}
	static boolean isPalindrome(Node head)
	{

		Node slow = head;
		boolean ispalin = true;
		Stack<Integer> stack = new Stack<Integer>();

		while (slow != null) {
			stack.push(slow.data);
			slow = slow.ptr;
		}

		while (head != null) {

			int i = stack.pop();
			if (head.data == i) {
				ispalin = true;
			}
			else {
				ispalin = false;
				break;
			}
			head = head.ptr;
		}
		return ispalin;
	}
}

class Node {
	int data;
	Node ptr;
	Node(int d)
	{
		ptr = null;
		data = d;
	}
}



