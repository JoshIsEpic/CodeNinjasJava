package f.Module.Loops;

public class C_Break {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int stop_loop = 1; //specify stop_loop at 1
		
		for  (int i = 0; i < 10; i++) { // start our loop that should repeat 10 times
			if (stop_loop > 5) { // check if stop_loop is equal to 5
				break; // leave the loop
			} else {
				System.out.println("The cycle continues!"); // otherwise output "The cycle continues!"
			}
			stop_loop++; // add 1 to stop_loop
		}
	}
}
