package Assignment;

public class EvenNum121to60 {

	public static void main(String[] args) {
		 int num = 121;
	        do {
	            
	            if (num % 2 == 0) {
	                
	                System.out.println("Character equivalent of " + num + " is: " + (char) num);
	            }
	            num--;
	        } while (num >= 60);
	    }
	}