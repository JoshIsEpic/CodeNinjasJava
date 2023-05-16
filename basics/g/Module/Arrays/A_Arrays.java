package g.Module.Arrays;

public class A_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cars[] = { //Our string array with our car manufacturers
				"Toyota",
				"Mazda",
				"Subaru",
				"Datsun",
				"Mitsubishi",
				"Infinity",
				"Fuso",
				"Nissan",
				"Lexus",
				"Isuzu",
				"Mitsuoka",
				"Suzuki",
				"Honda",
				"Mitsubishi",
				"Scion"
				};
		
		for (int i = 0; i < 15; i++) { // Loop 14 times
			System.out.println(cars[i]); // Output the car's array number assigned to 'i'
		}
	}

}
