package day2.classroom.arrays;

public class CharacterOccurance {


	public static void main(String[] args) {

		// Here is the input
		String test = "I am getting better with Java";

		// Here is what the count you need to find
		char ch = 't';
		int totalCount = 0;
		
		char[] data = test.toCharArray();
		for (int i = 0; i < data.length; i++) {
			if (data[i]=='t') {
				totalCount++;
				
			}
			
			
		}
		System.out.println("Character maches" + totalCount);
		
		// Build the logic to find the count of each
		/* Pseudo Code:
			a) Convert the String to character array
			b) Traverse through each character (using loop)
			c) If the given character matches the expected character (ch),
			   Then, increment totalCount
		*/

		
		
		
		
		
		
		
		
		
		// Print the count here
		
		
	}

}
