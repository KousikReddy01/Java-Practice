
public class DataTypeDemo {
	
	static byte b1;
	static short s;
	static int i;
	static long l;
	static float f;
	static double d;
	static char c;
	static boolean b2;

	public static void main(String[] args) {
		
	/*	int a;
		System.out.println(a); */      
		
		
		System.out.println(b1);	 //If Global Variables are not Initialized "JVM" will give Default Values for Global Variables 
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
		System.out.println(b2);
		System.out.println("Hello");
		
		char c1 = 'A';
		char c2 = 'a';
		char c3 = '1';
		char c4 = '#';
		char c5 = ' ';
		char c6 = 'అ';
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);

	}

}
