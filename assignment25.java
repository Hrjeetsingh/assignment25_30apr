
//  Find the kth element in a linked list from the end of singlly linked list in :  In single traversal (using 2 pointer approch).

import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
    LinkedList ll = new LinkedList();
    ll.addItem(70);
    ll.addItem(60);
    ll.addItem(50);
    ll.addItem(40);
    ll.addItem(30);
    ll.addItem(20);
    ll.addItem(10);
    ll.printk(4);
    }
}
class LinkedList {
    private class Node {
    int data;
    Node next;
    
    
        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    private Node head;
    private Node tail;
    private int size;
    
    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    
    public int size() {
        return this.size;
    }
    
    public boolean isEmpty() {
        return this.size() == 0;
    }
    
    public void addItem(int item) {
   
        Node temp = new Node(item, head);
        
        if (this.size == 0) {
            this.head = this.tail = temp;
        }
    
        else {
            this.head = temp;
        }
        this.size++;
    }
    
    void printk(int k) 
    { 
        int length = 0; 
        Node temp = head; 
  
        for(int i=0;temp!=null;i++){
            temp = temp.next; 
            length++;
        }  
        temp = head; 
        
        
        int i = 1;
        while( i < length - k + 1){
            temp = temp.next; 
            i++;
        }
        System.out.println( k + "th Node from the end is " + temp.data); 
    }

}

//  Find the kth element in a linked list from the end of singlly linked list in :


class KthNodeFromEndOfLoopedList
{
    public KthNodeFromEndOfLoopedList()
    {
    }
    public ListNode returnLoopDetectionNode(ListNode loopedList)
    {
        ListNode fastNode = loopedList;
        ListNode slowNode = loopedList;
        while(fastNode.next.next != null)
        {
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
            if(slowNode == fastNode)
            {
                break;
            }
        }
        returns lowNode;
    }
    public int getLoopLength(ListNode loopDetectionNode)
    {
        //  Take two pointers at loop detection node and calculate loop length
        ListNode P1 = loopDetectionNode;
        ListNode P2 = loopDetectionNode;
        int loopLength = 1;
        do
        {
            loopLength++;
            P2 = P2.next;
        }
        while(P1 != P2);
        return(loopLength - 1);
    }
    public ListNode getMergingPointNode(ListNode loopedList,
        ListNode loopDetectionNode)
    {
        ListNode P1 = loopedList;
        ListNode P2 = loopDetectionNode;
        while(P1 != P2)
        {
            P1 = P1.next;
            P2 = P2.next;
        }
        return P1;
    }
    public int getMergingPointLength(ListNode loopedList,
        ListNode loopDetectionNode)
    {
        ListNode P1 = loopedList;
        ListNode P2 = loopDetectionNode;
        //  Calculate length till the merging point
        int length = 1;
        while(P1 != P2)
        {
            P1 = P1.next;
            P2 = P2.next;
            length++;
        }
        return(length - 1);
    }
    public static void main(String[] args)
    {
        // Need to find kth node from end of linked list that contains loop
        int k = 2;
        SingleLinkedList newList = newSingleLinkedList();
        newList.add(1);
        newList.add(2);
        ListNode loopNode = newList.add(3);
        newList.add(4);
        newList.add(5);
        ListNode endNode = newList.add(6);
        //  Creating a loop
        endNode.next = loopNode;
        ListNode loopedList = newList.getList();
        KthNodeFromEndOfLoopedList kthNodeList = newKthNodeFromEndOfLoopedList();
        ListNode loopDetectionNode = kthNodeList.returnLoopDetectionNode(loopedList);
        int loopLength = kthNodeList.getLoopLength(loopDetectionNode);
        int lengthTillMergingPoint = kthNodeList.getMergingPointLength(loopedList,
                loopDetectionNode);
        int lengthOfList = loopLength + lengthTillMergingPoint;
        if(k & gt; lengthOfList)
        {
            System.out.println("Cannot find kth in the linked list");
        }
        else
        {
            if(loopLength &gt;= k)
            {
                //  Need to traverse (loopLength-k nodes from mergingPointNode to get kth Node from end of the list)
                ListNode mergingPointNode = kthNodeList.getMergingPointNode(loopedList,
                        loopDetectionNode);
                ListNode kthNode = mergingPointNode;
                for(int i = 0; i < (loopLength - k); i++)
                {
                    if(kthNode != null)
                    {
                        kthNode = kthNode.next;
                    }
                }
                System.out.println(
                    "Kth Node from end of linked list that contains loop is "+
                    kthNode.data);
            }
            else
            {
                //  Need to traverse (lengthOfList-k nodes from head of the list to get kth Node from end of the list)
                ListNode kthNode = loopedList;
                for(int i = 0; i < (lengthOfList - k); i++)
                {
                    if(kthNode != null)
                    {
                        kthNode = kthNode.next;
                    }
                }
                System.out.println(
                    "Kth Node from end of linked list that contains loop is "+
                    kthNode.data);
            }
        }
    }
}



// reverse linklist 


class LinkedList {

	static Node head;

	static class Node {

		int data;
		Node next;

		Node(int d)
		{
			data = d;
			next = null;
		}
	}

	
	Node reverse(Node node)
	{
		Node prev = null;
		Node current = node;
		Node next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		node = prev;
		return node;
	}

	void printList(Node node)
	{
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	public static void main(String[] args)
	{
		LinkedList list = new LinkedList();
		list.head = new Node(85);
		list.head.next = new Node(15);
		list.head.next.next = new Node(4);
		list.head.next.next.next = new Node(20);

		System.out.println("Given Linked list");
		list.printList(head);
		head = list.reverse(head);
		System.out.println("");
		System.out.println("Reversed linked list ");
		list.printList(head);
	}
}

