package f.Module.Loops;

public class D_Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 1; i < 10; i++) {
			if (i == 5) { // Check if i = 5
				continue; // Stop the loop for one cycle, that being cycle 5.
			}
			System.out.println("Cycle: " + i); // Print the cycle number
		}
	}

}
