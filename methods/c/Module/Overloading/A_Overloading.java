package c.Module.Overloading;

public class A_Overloading {
	
	/**
	 * Overloading is useful in java to improve the readability of code by holding
	 * holding multiple variables in their own methods. This can also be useful to use
	 * multiple of the same variables without having any redundancy issues.
	 */

	static int plusMethodInt(int x, int y) { //Two methods can call the same variables x, and y in this example
		return x + y; //Each of these methods add x and y together.
	}
	
	static double plusMethodDouble(double x, double y) {
		return x + y;
	}
	
	public static void main(String[] args) {
		int myNum1 = plusMethodInt(10, 4); //We can call our methods and their internal variables to use in our code
		double myNum2 = plusMethodDouble(2.4, 6.2); //This one has a different value but will run independently
		System.out.println(myNum1); //14
		System.out.println(myNum2); //8.6
	}

}
