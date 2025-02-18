package Assignment;

public class VowelsBtoT {

	public static void main(String[] args) {
		 System.out.println("Vowels from B to T using for loop:");
	        for (char ch = 'B'; ch <= 'T'; ch++) {
	            if (isVowel(ch)) {
	                System.out.print(ch + " ");
	            }
	        }

	        System.out.println("\n\nVowels from B to T using while loop:");
	        char ch = 'B';
	        while (ch <= 'T') {
	            if (isVowel(ch)) {
	                System.out.print(ch + " ");
	            }
	            ch++;
	        }
	    }
	  
	    public static boolean isVowel(char ch) {
	        return ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
	    }
	}



