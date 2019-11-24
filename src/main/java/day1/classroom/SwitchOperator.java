package day1.classroom;

public class SwitchOperator {

	/*
	 * Goal: Perform calculation based on the user input operations
	 * 
	 * inputs: 2,3 and "add"
	 * output: added value: 5
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a Switch case: type 'switch', followed by: ctrl + space + down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1)
	 * 2)
	 * 3) 
	 * 
	 */	
	
	public static void main(String[] args) {
		
		int a = 2;
		int b = 3;
		String operation = "add";
		int c;
		
		switch (operation) {
		case "add":
			c = a+b;
			System.out.println("Added value is" + c);
			break;
		case "sub":
			c = a-b;
			System.out.println("subtracted value is" + c);
			break;
		case "mul":
			c = a-b;
			System.out.println("multiplied value is" + c);
			break;
		case "div":
			c = a/b;
			System.out.println("divided value is" + c);
			break;

		default:
			c = a%b;
			System.out.println("Percentage value is" + c);
		}
		
		// Declare 2 integer numbers
		

		// Declare a String variable with input as operations (Tip:
		

		// Initiate switch case for operations
		
		
			// Within switch, include as case for add operation
		
		
			// Within switch, include as case for sub operation
		
		
			// Within switch, include as case for mul operation
		
		
			// Within switch, include as case for div operation
		
		
			// Within switch, include 'default' to handle other operations
		
		
		//end of switch case
		
	}

}
