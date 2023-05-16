package a.Module.Methods;

public class A_Creating_Methods {

	/**
	 * Methods can be used to sections of code in a single line. It is not quite a variable,
	 * but like a variable, it does store data. The greatest purpose of methods is it
	 * increases the readability of your code, while also creating a reusable "block"
	 * of code. Overall, methods should be used, but not over used!
	 */
	
	static void myMethod() { //Creates a method named myMethod
		System.out.println("This method has a println function!");
		System.out.println("I can create multiple lines of code and call them all later.");
		System.out.println("Let\'s add one more line just for fun!");
	}
	
	public static void main(String[] args) {
		myMethod();
	}

}
