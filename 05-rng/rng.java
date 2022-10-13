import java.util.Scanner;
import java.util.Random;

public class rng
{
    public static void main(String []args) {
    
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        
        System.out.println("What mode do you want?\nEasy\nMedium\nHard");
        
        String mode = s.nextLine();
        
        if(mode.equalsIgnoreCase("Easy")) {
            int random = ((int)(Math.random() * 10 + 1));
            System.out.println("Guess a number from 1-10");
            int ans = s.nextInt();
            if(ans == (random)) {
                System.out.println("Correct");
            }
            else {
                System.out.println("Wrong");
                System.out.println(random);
            }
            //int number = r.nextInt(10) +1;
            //System.out.println(random);
        }
        else if(mode.equalsIgnoreCase("Medium")) {
            int random = (int)(Math.random() * 50 + 1);
            System.out.println("Guess a number from 1-50");
            int ans = s.nextInt();
            if(ans == (random)) {
                System.out.println("Correct");
            }
            else {
                System.out.println("Wrong");
                System.out.println(random);
            }
            //int number = r.nextInt(50) +1;
            //System.out.println(random);
        }
        else {
            int random = (int)(Math.random() * 100 + 1);
            System.out.println("Guess a number from 1-100");
            int ans = s.nextInt();
            if(ans == (random)) {
                System.out.println("Correct");
            }
            else {
                System.out.println("Wrong");
                System.out.println(random);
            }
            //int number = r.nextInt(100) +1;
            //System.out.println(random);
        }
        
        
        
        
    }
}