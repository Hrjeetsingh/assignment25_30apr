// Java program to add the
// elements in the stack
import java.io.*;
import java.util.*;

class Mystack {

	
	public static void main(String[] args)
	{

		// Default initialization of Stack
		Stack stack1 = new Stack();

		
		
		

	
		stack1.push(4);
		stack1.push(50);
		stack1.push(46);


        System.out.println("Popped element: "+ sta
		System.out.println(stack1);

	}
    
}

class rstack{
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
    public static void main(String[] args) {
        int a[]={5,8,6,4,5,5,8,6,5};
        System.out.println(removeDuplicates(a));
    }
}