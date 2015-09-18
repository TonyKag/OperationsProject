
public class Operations {

	public static void main(String[] args) {
		
		// Store input values from command line or run configuration
		// inside variables with more meaniful name
		String operation = args[0];
		String input1 = args[1];
		String input2 = args[2];
		// Other variables of type double to allow manipulation of values
		double num1;
		double num2;
		// Variable to represent result value, set to 0
		double total = 0;
		
		// Output sample to test execution at this point
		System.out.println("Operation: " + operation);
		System.out.println("Number 1: " + input1);
		System.out.println("Number 2: " + input2);
		
		// Convert the String values for input into Double type numbers
		num1 = Double.parseDouble(input1);
		num2 = Double.parseDouble(input2);
		
		// Check if the operation is equal to "A" for addition
		// Use the equals() method or equalsIgnoreCase() to evaluate string comparisons
		if (operation.equalsIgnoreCase("A")) {
			// Output the operation intended
			total = num1 + num2;
			System.out.println("You have selected to Add values " + num1 + " and " + num2 + " which gives you a total of " + total + ".");
		} else if (operation.equalsIgnoreCase("S")) {
			// Output the operation intended
			total = num1 - num2;
			System.out.println("You have selected to Subtracting values " + num1 + " and " + num2 + " which gives you a total of " + total + ".");
		} else if (operation.equalsIgnoreCase("M")) {
			// Output the operation intended
			total = num1 * num2;
			System.out.println("You have selected to Multiplying values " + num1 + " and " + num2 + " which gives you a total of " + total + ".");
		} else if (operation.equalsIgnoreCase("D")) {
			// Output the operation intended
			total = num1 / num2;
			System.out.println("You have selected to Dividing values " + num1 + " and " + num2 + " which gives you a total of " + total + ".");
		} else if (operation.equalsIgnoreCase("MM")) {
			// Output the operation intended
			total = num1 % num2;
			System.out.println("You have selected to Modulus values " + num1 + " divided by " + num2 + " leaves a remainder of " + total + "." );
		} else {
			System.out.println("Operation is not supported");
		}
	}
}
