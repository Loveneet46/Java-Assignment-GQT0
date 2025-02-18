package Assignment;

import java.util.Scanner;

public class ConvertInrToDollar {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Your Amount in INR = ");
		
		int amount = scan.nextInt();
		
		float USD = amount / 86;
		
		String formattedValue = String.format("%.2f",USD);
		
		System.out.print("₹"+ amount +" is equal to "+"$"+ formattedValue);	
		scan.close();
	}
}
