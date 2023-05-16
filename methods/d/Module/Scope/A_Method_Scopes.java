package d.Module.Scope;

public class A_Method_Scopes { //This is a block
	
	public static void main(String[] args) { //This is a block
		
		//x cannot be used in this block
		
		int x = 5;
		
		//x can be used in this block
		
		System.out.println(x);
		
	}
	
	//x cannot be used in this block
}
