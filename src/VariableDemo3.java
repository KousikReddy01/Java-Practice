
public class VariableDemo3 {
	
	 int i = 10;
	 static int j = 20;

	public static void main(String[] args) {
		
		System.out.println(j);         // ; is the indication where the statement Ends
		j = 30;                        // Here "J" is the Global Variable due to its Declaration
		System.out.println(j);
		int j = 40;					   // Here "J" is Local Variable
		System.out.println(j);
		
	    //System.out.println(k);       //This is Invalid Statement
		
		//System.out.println(i);
		
		

	}

}
