package day2.classroom.arrays;

import java.util.Arrays;

public class MissingElement {

	
	public static void main(String[] args) {

		// Here is the input
		int[] data = {3,2,4,6,7,8};
		
		Arrays.sort(data);
		
		//System.out.println("the number is " + data [data.length-1]);

		
		for (int i = data[0]; i < data.length; i++) {
			
			
			
			if (i!=data[i-data[0]]) {
				System.out.println("The missing number is " + i);
				
			}
		}
		/*
		 Pseudo Code:
		 1) Arrange the array in ascending order
		 2) Traverse through each array item
		 3) Compare consecutive items -> 
		 		the next one should be = previous one + 1
		 4) If the following one is not +1 -> Print as missing
		 */
		
		
		
		
		
		
		
		// Print the second largest number	
		
		
	}

}
