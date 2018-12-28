package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 */
		Queue<Integer> nums = new LinkedList<Integer>();
		System.out.println(nums.peek());
		//System.out.println(nums.element());
		System.out.println();
		nums.offer(1);
		nums.add(2);
		nums.offer(3);
		nums.add(4);
		nums.add(5);
		System.out.println(nums.peek());
		System.out.println(nums.element());

		System.out.println("\n" + nums + "\n");

		//remove and poll 4 element
		nums.remove();
		nums.poll();
		nums.remove();
		nums.poll();
		System.out.println("\n" + nums + "\n");
		//System.out.println(nums.remove());
		System.out.println(nums.poll());

		System.out.println();

		for(int i =1; i<=4; i++)
		{
			System.out.println(nums.offer(i) + " ");
		}

		System.out.println("\n" + nums + "\n");

		Iterator<Integer> scan = nums.iterator();

		//forEach loop
		nums.forEach((n) -> print(n));

		//while loop
		while(scan.hasNext())
		{
			System.out.println(scan.next());
		}

		System.out.println("\n");

	}

	// printing values for forEach loop
	public static void print(Integer n)
	{
		System.out.println("Values are " + n);
	}

}
