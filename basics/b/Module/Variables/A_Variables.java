package b.Module.Variables;

public class A_Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * In Java we have different data storing values called Variables.
		 * Below I am going to list some types of variables and what they do.
		 * Later in this module we will print these values into the console.
		 * Variables are important to shorten strings, and change values.
		*/
		
		//Number Variables
		int myNumber = 50; // 'int' values are able to handle integer values
		float myFloat = (float) 32.0; // 'float' values are able to handle 32bit integers and decimals
		double myDouble = (double) 64.0; // 'double' values are able to handle 64bit integers and decimals
		
		//Letter Variables
		String myString = "Java is awesome!"; // 'string' values handle words with spaces in them
		char myChar = 'a'; // 'char' values can only handle a single character or number
		char myCharArray[] = {'a','b','c','1','2','3'}; // 'char' values can also hold an array of single characters or numbers
		
		//True / False Variables
		boolean myBoolean = true; // booleans handle true or false values
		
		
		//We can then output our variables to console using System.out.println();
		//System.out.println(); is used to output data into the console
		System.out.println(myNumber);
		System.out.println(myFloat);
		System.out.println(myDouble);
		System.out.println(myString);
		System.out.println(myChar);
		System.out.println(myCharArray);
		System.out.println(myBoolean);
	}

}
