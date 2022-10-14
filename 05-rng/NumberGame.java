import java.util.Scanner;
import java.util.Random;
public class NumberGame
{
  public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      Random r = new Random();

      System.out.println("What mode do you want?\nEasy\nMedium\nHard");
      String mode = s.nextLine();

      int maximum;
      if(mode.equalsIgnoreCase("Easy")) {
        int mysteryNumber = r.nextInt() + 1;
        maximum = 10;
      } // end if statement
      else if (mode.equalsIgnoreCase("Medium")) {
        int mysteryNumber = r.nextInt() + 1;
        maximum = 50;
      } // end else if statement
      else {
        int mysteryNumber = r.nextInt() + 1;
        maximum = 100;
      } // end else statement

      int mysteryNumber = r.nextInt(maximum) + 1;

      System.out.print("Enter your guess: ");
      int playerGuess = s.nextInt();
      // if the player guessed incorrectly
      if(playerGuess != mysteryNumber) {
          // if the player guessed too low
          if(playerGuess < mysteryNumber) {
              System.out.println("You were off by " + (mysteryNumber - playerGuess));
          } // end inner if statement
          // if the player didn't guess too low (meaning, incorrect and too high!)
          else {
              System.out.println("You were off by " + (playerGuess - mysteryNumber));
          } // end inner else statement
      } // end outer if statement
      // if the player didn't guess incorrectly (meaning, correct guess)
      else {
          System.out.println("Correct!");
      } // end outer else statement
      s.close();
  } // end main method
} // end class
