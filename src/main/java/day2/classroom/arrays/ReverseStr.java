package day2.classroom.arrays;

public class ReverseStr {

	public static void main(String[] args) {
		
		// Here is the input
		String test = "feeling good";
		
		
		
		for (int i = test.length()-1; i >=0; i--) {
			
			System.out.print(test.charAt(i));
			
			//System.out.print("the charcters are" + text);
			
		}
		
		char[] array = test.toCharArray()
		
		for (int i = array.length-1; i >= 0; i--) {
		System.out.println(array[i]);
			
			
		}
		
//				for (int i = 0; i <= test.length()-1; i++) {
//					System.out.println("the charcters are" + i);
//				}

		// Build the logic to find the count of each
		/* Pseudo Code: 1
			a) Convert the String to character array
			b) Traverse through each character (using loop in reverse direction)
			c) Print the character (without newline -> like below
			   System.out.print(ch);
		*/

		
		
		
		/* Pseudo Code: 2
		a) Find the length of the string
		b) Traverse through each index from length-1 -> 0 (using loop in reverse direction)
		c) Find the character of the String using its index
		*/
		
		
		
		
		
		
		
		
		
	}

}