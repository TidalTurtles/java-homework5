

import java.util.Arrays;
import java.util.Scanner;

public class HoltNoahAssignment5 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Noah Holt
		 * CS1150 Principles of computer science
		 * m/w section
		 * Due 3 mar
		 * Assignment 5
		 * This assignment is to create a loop to collect a set from the user and then display information from that set
		 * displayed info will include lowest int(exclude 0), largest int, number of ints, sum of ints, average int, 
		 * number of appearences of the smallest and largest int
		 */
		
		//this is what i found to get input into int array, took me 5 hours. was there an easier way???
		Scanner user = new Scanner(System.in);
		System.out.println("Enter a sequence of numbers with the last number being 0:");
		String input = user.nextLine();
		String[] stringArr = input.split(" ");
		final int size = stringArr.length;
		int[] intArr = new int[size];
		
		for (int i = 0; i < size; i++) {
			intArr[i] = Integer.valueOf(stringArr[i]);
		}
		
		int smallest = intArr[0];
		int largest = intArr[0];
		int numSmallest = 0;
		int numLargest = 0;
		int sumAll = 0;
		int avgValue = 0;
		int numValues = size-1;
		
		if(intArr[size-1] == 0) {
		//finding smallest and largest value given
			
			int q = 0;
					
			while (q < intArr.length-1) {
						
				if (intArr[q] < smallest) smallest = intArr[q];
				if (intArr[q] > largest) largest =intArr[q];
						
				q++;
			}
		//num of times values appear
			for (int i=0; i < intArr.length; i++) {
				if (intArr[i] == smallest) numSmallest += 1;
				if (intArr[i] == largest) numLargest += 1;
			}
		//sum it all up
			int s = 0;
			
			while (s < intArr.length) {
				sumAll += intArr[s];
				s++;
			}
		//average that mess	
			avgValue = sumAll / numValues;
			
			
		} else {
			System.out.println("Set must end with number 0");
		}
		
		
		System.out.println("Number of values entered: " + numValues);
		System.out.println("Smallest value given was: " + smallest + " and it appeared " + numSmallest + " times.");
		System.out.println("Largest value given was: " + largest + " and it appeared " + numLargest + " times.");
		System.out.println("The sum of all given values: " + sumAll);
		System.out.println("The average value given: " + avgValue);
		
		user.close();
		
	}

}
