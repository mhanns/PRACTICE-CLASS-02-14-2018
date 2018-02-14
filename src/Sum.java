//Maurice Hanns CSC242 02-14-2018

public class Sum {

	
	public static void main(String [] args){
	
		
		int a =2, b= 4;
		int c = addNumbers(a,b);
		System.out.println("The sum is: " + c);
		
		int r = addNumbers(3,18);
		System.out.println("The sum is: " + r);
		
		System.out.println("The sum is: " + addNumbers(6,21)); // will return the sum at Librarys
				
		
	}//main
	
	public static int addNumbers(int varA, int varB){
		int sum = varA + varB;
		return sum;
	}
	
	
}