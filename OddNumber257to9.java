package Assignment;

public class OddNumber257to9 {

	public static void main(String[] args) {
		 System.out.println("Using for loop:");
	      
	        for (int i = 257; i >= 9; i--) {
	            if (i % 2 != 0) { 
	                System.out.print(i + " ");
	            }
	        }

	        System.out.println("\n\nUsing while loop:");
	        // Using while loop
	        int j = 257;
	        while (j >= 9) {
	            if (j % 2 != 0) {
	                System.out.print(j + " ");
	            }
	            j--;
	  }
   }
}


