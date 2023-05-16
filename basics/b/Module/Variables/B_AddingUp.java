package b.Module.Variables;

public class B_AddingUp {
	
		public static void main(String[] args) {
		int myNum = 5;
		float myFloat = (float) 4.2;
		double myDouble = (double) 16.5;
		String goal = "Days Left: ";
		
		//We can add, subtract, multiply, or divide using (+, -, *, /)
		//These can be used inside of the a System.out.println(); function.
		System.out.println(goal + (myDouble + myFloat * myNum / 2));
		/**
		 * We must make sure to separate the number values from the string values.
		 * To do this, we must use '()'
		 * In our output we should see "Days Left: 27.0"
		 */
		
		//Three other operators are (%, ++, and --) We will go over these next
		System.out.println(10 % 6); // Modulus, the left over value of division. 4 is left over in this sample.
		int adding = 0;
		int subtracting = 0;
		
		adding ++; //Adding to our adding int value
		subtracting --; //Subtracting from out subtraction int value
		
		System.out.println(adding);
		System.out.println(subtracting);
	}
}
