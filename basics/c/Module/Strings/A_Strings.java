package c.Module.Strings;

public class A_Strings {

	public static void main(String[] args) {
		//We know how to output words to the console using Strings, but we can do a lot more with them.
		//We are able to perform more functions on them to adjust how they interact.
		
		//In this sample, we are going to find the length of our string text
		String sample1 = "LongStringOfInformation";
		System.out.println("The string is " + sample1.length() + " characters long!");
		
		//In this sample, we are going to change the case of the strings
		String sample2 = "Hello World!";
		System.out.println(sample2.toUpperCase());
		System.out.println(sample2.toLowerCase());
		
		//In this sample we are going to find the location of our key word "Java"
		String sample3 = "This string has the word Java in it somewhere...";
		System.out.println(sample3.indexOf("Java"));
		
		//In this sample we are going to concatenate two variables together into a println
		String firstName = "John";
		String lastName = "Doe";
		System.out.println(firstName.concat(lastName));
		
		/**
		 * When using special characters in strings incorrectly, we will run into errors.
		 * This is because some special characters are a function in Java and interfere
		 * with your code. We will go through ways to work around this to use special
		 * characters in Java strings.
		 */
		
		/**
		 * Use \' to type a single quote
		 * Use \" to type a double quote
		 * Use \\ to type a back slash
		 */
		String sample4 = "Single quote: \', Double quote \", Back slash: \\";
		System.out.println(sample4);
		
		/**
		 * There are other escape functions which use the backslash. Here are a few:
		 * Use \n for a new line
		 * Use \r to carriage return
		 * Use \t to tab
		 * Use \b to backspace
		 * Use \f to form feed
		 * 
		 * For the time being you will not need to use these, and we will cover them more in another module
		 */
	}

}
