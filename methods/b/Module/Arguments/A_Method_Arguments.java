package b.Module.Arguments;

public class A_Method_Arguments {
	
	/**
	 * We learned how to create methods, now let's pass arguments, or parameters into them.
	 * In this example, we are going to create a name string and make that a parameter that
	 * can be modified in the method's parenthesis.
	 */
	
	static void myMethod(String name) { //Creates a method with a parameter name
		System.out.println(name + " from CodeNinjas"); //Our println function with the name parameter
	}
	
	public static void main(String[] args) {
		myMethod("Josh"); //The parameter sets the name in our println function in our method
		myMethod("Tex");
		myMethod("Caius");
		myMethod("Angelica");
	}

}
