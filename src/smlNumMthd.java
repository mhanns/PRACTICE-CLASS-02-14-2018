//Maurice Hanns CSC242 02-14-2018

import java.util.Scanner;

public class smlNumMthd {
		
		public static void main(String [] args){
		
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the first numbers to compare:");
			int a = input.nextInt();
			System.out.println("Enter the second numbers to compare:");
			int b = input.nextInt();
			
			System.out.println("The smallest number you entered was: " + numbers(a, b));

			
		}//main
		
		public static int numbers(int varA, int varB){
			
			int smallest;
			
			if (varA < varB){
				smallest = varA;
			}
			else{
				smallest = varB;
			}
			
			return smallest;
		}
		
		
	}