import java.util.Scanner;

public class Lanternfly
{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("The lanternfly is an invasive species and ");
        System.out.println("is a threat to our trees and plants.");
        
        System.out.print("How many did you squash this summer? ");
        int num = input.nextInt();
        
        if (num < 10) {
            System.out.println("You can do better than that!");
        } // end if statement
        else {
            System.out.println("Thanks for doing your part");
        } // end else statement
        
        System.out.print("How many more lanternflys are you planning to squash? ");
        int s = input.nextInt();
        
        if (s < 10) {
            System.out.println("You gotta get more of them");
        } // end if statement
        else if (s > 10) {
            System.out.println("That's the spirit");
        } // end else statement
        

        
    } // end main method

} // end class