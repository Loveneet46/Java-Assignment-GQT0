package Assignment;

public class DivisibleByThree {
    public static void main(String[] args) {
        
        System.out.println("Numbers divisible by 3 (using for loop):");
        for (int i = 99; i >= 23; i--) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }

      
        System.out.println("\n\nNumbers divisible by 3 (using while loop):");
        int j = 99;
        while (j >= 23) {
            if (j % 3 == 0) {
                System.out.print(j + " ");
            }
            j--;
        }
    }
}