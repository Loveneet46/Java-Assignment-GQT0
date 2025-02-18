package Assignment;

public class ASCIIValue {

	public static void main(String[] args) {
		 System.out.println("Using for loop:");
	        for (char ch = 'o'; ch >= 'c'; ch--) {
	            System.out.println("Character: " + ch + ", ASCII Value: " + (int) ch);
	        }

	  
	        System.out.println("\nUsing while loop:");
	        char ch = 'o';
	        while (ch >= 'c') {
	            System.out.println("Character: " + ch + ", ASCII Value: " + (int) ch);
	            ch--;
	    }
	}	
}
