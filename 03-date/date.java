
/**
 * Write a description of class date here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
public class date
{
    public static void main(String []args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the day of the week: ");
        String day = s.nextLine();
        
        System.out.print("Enter the month: ");
        String month = s.nextLine();
        
        System.out.print("Enter the year: ");
        String year = s.nextLine();
        
        System.out.print("Enter the day of the month: ");
        String dayOfMonth = s.nextLine();
        
        System.out.println("American format: " + day + ", " + month + " " + dayOfMonth + ", " + year);
        System.out.println("European format: " + day + " " + dayOfMonth + " " + month + " " + year);
        
        s.close();

    }// end of main
}//end of class