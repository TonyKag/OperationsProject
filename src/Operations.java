import java.util.Scanner;

/**
 * @author Tony
 *
 */
public class Operations {
	// Store input values from command line or run configuration
	// inside variables with more meaniful name
	private String operation;
	private String input1;
	private String input2;
	// Other variables of type double to allow manipulation of values
	private double num1;
	private double num2;
	// Variable to represent result value, set to 0
	private double total = 0;
	
	public double getNum1() {
		return num1;
	}
	public double getNum2() {
		return num2;
	}
	public double getTotal() {
		return total;
	}
 	public String getOperation() {
		return operation;
	}
	public String getInput1() {
		return input1;
	}
	public String getInput2() {
		return input2;
	}
	public void setNum1(double n1) {
		num1 = n1;
	}
	public void setNum2(double n2) {
		num2 = n2;
	}
	public void setTotal(double tot) {
		total = tot;
	}
	public void setOperation(String oper) {
		operation = oper;
	}
	public void setInput1(String inp1) {
		input1 = inp1;
	}
	public void setInput2(String inp2) {
		input2 = inp2;
	}
	/**
	 * main method
	 *
	 */
	public static void main(String[] args) {
		Operations op = new Operations();
		op.inputValues();
		op.operating();	
	}

	/**
	 * method for input values using Scanner
	 *
	 */
	private void inputValues() {
		// Create a Scanner object and set it to the variable scanner
		Scanner scan = new Scanner(System.in);
		System.out.println("Please provide an operation:");
		setOperation(scan.nextLine()); 
		System.out.println("Please provide first number:");
		setInput1(scan.nextLine());
		System.out.println("Please provide the second number:");
		setInput2(scan.nextLine());
		scan.close();
		
		// Convert the String values for input into Double type numbers
		num1 = Double.parseDouble(input1);
		num2 = Double.parseDouble(input2);
	}
	/**
	 * method for calculation
	 *
	 */
	private void operating() {
		// Output sample to test execution at this point
		System.out.println("Operation: " + getOperation());
		System.out.println("Number 1: " + getInput1());
		System.out.println("Number 2: " + getInput2());
		
		// Check if the operation is equal to "A" for addition
		// Use the equals() method or equalsIgnoreCase() to evaluate string comparisons
		if (getOperation().equalsIgnoreCase("A")) {
			// Output the operation intended
			setTotal(getNum1() + getNum2());
			System.out.println("You have selected to Add values " + getNum1() + " and " + getNum2() + " which gives you a total of " + getTotal() + ".");
		} else if (getOperation().equalsIgnoreCase("S")) {
			// Output the operation intended
			setTotal(getNum1() - getNum2());
			System.out.println("You have selected to Subtracting values " + getNum1() + " and " + getNum2() + " which gives you a total of " + getTotal() + ".");
		} else if (getOperation().equalsIgnoreCase("M")) {
			// Output the operation intended
			setTotal(getNum1() * getNum2());
			System.out.println("You have selected to Multiplying values " + getNum1() + " and " + getNum2() + " which gives you a total of " + getTotal() + ".");
		} else if (getOperation().equalsIgnoreCase("D")) {
			// Output the operation intended
			setTotal(getNum1() / getNum2());
			System.out.println("You have selected to Dividing values " + getNum1() + " and " + getNum2() + " which gives you a total of " + getTotal() + ".");
		} else if (getOperation().equalsIgnoreCase("MM")) {
			// Output the operation intended
			setTotal(getNum1() % getNum2());
			System.out.println("You have selected to Modulus values " + getNum1() + " divided by " + getNum2() + " leaves a remainder of " + getTotal() + "." );
		} else {
			System.out.println("Operation is not supported");
		}
	}
}