package b.Module.Variables;

public class C_Numbers_On_Numbers {

	public static void main(String[] args) {
		float scientificNotation = (float) 154.5e6; //Our integer is 154.5 raised to the power of 6.
		System.out.println(scientificNotation);
		
		//Primitive Data Types
		//Type, Name, Byte Size 
		byte myByte = 1; //Stores whole numbers from -128 through 127
		short myShort = 2; //Stores whole numbers from -32,768 through 32,767
		int myInt = 4; //Stores whole numbers from -2,147,483,648 through 2,147,483,647
		long myLong = 8; //Stores whole numbers from -9,223,372,036,854,775,808 through 9,223,372,036,854,775,807
		float myFloat = 4; //Stores fractional numbers. Sufficient for storing 6 to 7 decimal values
		double myDouble = 8; //Stores fractional numbers. Sufficient for storing 15 decimal values
		boolean myBool = true; //Stores true or false values.
		char myChar = '2'; //Stores a single character/letter or any ASCII values.
		
		System.out.println(myByte + myShort + myInt + myLong + myFloat + myDouble);
		System.out.println(myBool);
		System.out.println(myChar);
		
		//Non-Primitive Data Types
		//A variable not assigned, or is left at null, 0, or false.
	}
}