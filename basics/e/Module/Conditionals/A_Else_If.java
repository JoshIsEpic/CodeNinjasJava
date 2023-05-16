package e.Module.Conditionals;

public class A_Else_If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//if, else if, else
		
		int x = 1; //Our variable X
		for (int y = 0; y < 3; y++) { //Do not pay attention to this for now, you will learn for loops later
			if (x > y) { //This checks if X is greater than Y
				System.out.println("X is greater than Y!");
			} else if (x == y) { //This checks if X and Y are equal
				System.out.println("X and Y are equal!");
			} else { //This checks if Y is greater than X
				System.out.println("Y is greater than X!");
			}
		}
		
		//Long hand method
		
		int a = 12;
		if(a < 10) {
			System.out.println("Good Morning!");
		} else {
			System.out.println("Good Evening!");
		}
		
		//Short hand method
		
		int b = 12;
		String results = (b < 10) ? "Good Morning!" : "Good Evening!";
		System.out.println(results);
	}

}