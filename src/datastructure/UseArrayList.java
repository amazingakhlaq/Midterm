package datastructure;

import java.util.ArrayList;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */

		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		arrlist.add(14);
		arrlist.add(7);
		arrlist.add(39);
		arrlist.add(40);

		// remove element from arraylist
		arrlist.remove(14);
		// remove element from arraylist
		arrlist.remove(7);
		// get index
		arrlist.get(2);

		/* For Loop for iterating ArrayList */
		System.out.println("For Loop");
		for (int counter = 0; counter < arrlist.size(); counter++) {
			System.out.println(arrlist.get(counter));
		}

		//forEach loop
		arrlist.forEach((n) -> display(n));

		/* Advanced For Loop*/
		System.out.println("Advanced For Loop");
		for (Integer num : arrlist) {
			System.out.println(num);
		}

		/* While Loop for iterating ArrayList*/
		System.out.println("While Loop");
		int count = 0;
		while (arrlist.size() > count) {
			System.out.println(arrlist.get(count));
			count++;
		}

	}

	// printing values for forEach loop
	public static void display(Integer n)
	{
		System.out.println("Iterating Values are " + n);
	}

}
