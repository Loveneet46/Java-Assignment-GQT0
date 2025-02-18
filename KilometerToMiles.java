package Assignment;

	import java.util.Scanner;
	
public class KilometerToMiles {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the Kilometer = ");
		
		int kms = scan.nextInt();
		
		double mile = kms * 0.621371;
		
		String formettedvalue = String.format("%.2f",mile);
		
		System.out.println(kms + " Kilometera is equal to "+formettedvalue+ "miles");
		scan.close();
	}
}
