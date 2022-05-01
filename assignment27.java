"1. Program to find size of Doubly Linked List
2. Remove the nodes which are greater than 25 in the double linked list

10->29->34->12->50->7

Output

10->12->7"


// A complete working Java program to
// find size of doubly linked list.
import java.io.*;
import java.util.*;

// Represents a doubly linked list node
class Node
{
	int data;
	Node next, prev;
	Node(int val)
	{
		data = val;
		next = null;
		prev = null;
	}
}

class sizedoubll
{

	
	
	static Node push(Node head, int data)
	{
		Node new_node = new Node(data);
		new_node.next = head;
		new_node.prev = null;
		if (head != null)
			head.prev = new_node;
		head = new_node;
			
		return head;
	}


	static int findSize(Node node)
	{
		int res = 0;
		while (node != null)
		{
				res++;
				node = node.next;
		}

		return res;
	}

	public static void main(String args[])
	{
		Node head = null;
		head = push(head, 4);
		head = push(head, 3);
		head = push(head, 2);
		head = push(head, 1);
		System.out.println(findSize(head));
	}
}




// linked list that are greater than
// the specified value x
class GFG
{


static class Node
{
	int data;
	Node prev, next;
};



static Node push(Node head_ref, int new_data)
{
	
	Node new_node = new Node();


	new_node.data = new_data;

	
	
	new_node.prev = null;

	
	new_node.next = (head_ref);

	
	if ((head_ref) != null)
		(head_ref).prev = new_node;

	
	(head_ref) = new_node;
	
	return head_ref;
}




static Node deleteNode(Node head_ref, Node del)
{
	// base case
	if (head_ref == null || del == null)
		return null;

	
	if (head_ref == del)
		head_ref = del.next;

	
	
	if (del.next != null)
		del.next.prev = del.prev;

	
	
	if (del.prev != null)
		del.prev.next = del.next;

	return head_ref;
}





static Node deleteGreaterNodes(Node head_ref, int x)
{
	Node ptr = head_ref;
	Node next;

	while (ptr != null)
	{
		next = ptr.next;
		
		
		if (ptr.data > x)
			deleteNode(head_ref, ptr);
		ptr = next;
	}
	return head_ref;
}



static void printList(Node head)
{
	while (head != null)
	{
		System.out.print( head.data + " ");
		head = head.next;
	}
}


public static void main(String args[])
{

	Node head = null;

	
	
	head = push(head, 9);
	head = push(head, 11);
	head = push(head, 4);
	head = push(head, 8);
	head = push(head, 10);

	int x = 9;

	System.out.print( "Original List: ");
	printList(head);

	head=deleteGreaterNodes(head, x);

	System.out.print( "\nModified List: ");
	printList(head);
}
}


