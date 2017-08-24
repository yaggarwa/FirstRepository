package mytestpackage;

public class TestClassForAWS {
	
	public static void main (String args[]){
		System.out.println("Hello User");
		int result = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
		System.out.println("Sum of numbers = " + result);
	}

}
