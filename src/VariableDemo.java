
public class VariableDemo {
	
	int a = 10;             //Non-static variable or Instance Variable 
	static int b = 20;      //Static Variable or Class Variable

	public static void main(String[] args) { 

		int c= 30;          //Local Variable
		
		System.out.println(c);
	    System.out.println(b);        // we can use anywhere in the class because its a class variable    
	   // System.out.println(a);       // we cannot use non-static variable without calling or referring
	}

}
