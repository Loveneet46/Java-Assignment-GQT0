package Assignment;

import java.util.Scanner;

public class args {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
//	Addition of a+b
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println("Sum of a + b is ="+(a+b));
//	Subtraction of c-d
		int c = Integer.parseInt(args[2]);
		int d = Integer.parseInt(args[3]);
		System.out.println("Sub of c - d is ="+(c-d));
//	Multiplication of e*f	
		int e = Integer.parseInt(args[4]);
		int f = Integer.parseInt(args[5]);
		System.out.println("Mul of e * f is ="+(e*f));
//  Division of g/h
		int g = Integer.parseInt(args[6]);
		int h = Integer.parseInt(args[7]);
		System.out.println("Div of g / h is ="+(g/h));
		
		scan.close();
		
	}
}