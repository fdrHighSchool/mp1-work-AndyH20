import java.util.Scanner;

public class UserName {
  public static void main(String[] args) {
    // create Scanner object
    Scanner s = new Scanner(System.in);
    
    System.out.print("Are you a student or teacher: ");
    String c = s.nextLine();
    
    // choose student or teacher
    if(c.equalsIgnoreCase("Student")) {
        System.out.print("Enter your first name: ");
        String firstName = s.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = s.nextLine();
        System.out.print("What is your favorite number: ");
        String fav = s.nextLine();

        System.out.println((firstName) + getInital(lastName) + (fav) + "@nycstudents.net");
    }
    else {
        System.out.print("Enter your first name: ");
        String firstName = s.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = s.nextLine();
        System.out.print("What is your favorite number: ");
        String fav = s.nextLine();
        
        System.out.println(getInital(firstName) + (lastName) + (fav) + "@schools.nyc.gov");
    }
    System.out.println("How long do you want your password to be?");
    int pass = s.nextInt();
    
    generatePassword(pass);

    s.close();
  } // end main method

  
  /*
   * Name: getInital
   * Purpose: send back the first character (inital) of a name
   * Input: a name (String)
   * Return: a single character (String)
   */
  public static String getInital(String n) {
    return n.substring(0, 1);
} // end initialize method


public static String generatePassword(int length) {
    String password = "";
    
    for(int i = 0; i < length; i++) {
    int ca = (int)(Math.random() * (90-65+1) + 65);
    char cap = (char)(ca);
        //65-90 cap
        
    //int lo = (int)(Math.random() * (122-97+1) + 97);
    //char low = (char)(lo);
        //97-122 lower case
    //int sy = (int)(Math.random() * (47-33+1) + 33);
    //char sym = (char)(sy);
        //33-47 special symbols
    
    password += cap;
} // end loop
    System.out.println(password);


    
    //convert integer to char c =(char)i;
    
    //add the char to the password string
    
    return(password);
} //end pass
  /*
   * Name: generatePassword
   * Purpose: send back a random String of numbers and upper/lower letters
   * Input: length of password (int)
   * Return: String
   */

} // end class
