//Maurice Hanns CSC242 02-14-2018

import java.util.Scanner;

public class avgThree {

	public static void main(String [] args){
			
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number to compare:");
		int a = input.nextInt();
		System.out.println("Enter the second number to compare:");
		int b = input.nextInt();
		System.out.println("Enter the third number to compare:");
		int c = input.nextInt();
				
				System.out.println("The average of the three numbers entered is: " + numbers(a, b, c));

				
			}//main
			
			public static double numbers(int varA, int varB, int varC){
				
				int sum=0, average;
				
				sum = (varA + varB + varC);
				average = sum / 3;
				
				return average;
			}

}
