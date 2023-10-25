import java.util.Scanner;

public class activity1{
   public static void main(String args[]){
      
      System.out.println("Activity 1: What does the animal say\n");
      System.out.println("1. Cat");
      System.out.println("2. Dog");
      System.out.println("3. Bird");
      System.out.println("4. Goat");
      
      int choice = getUserChoice();     
   
      switch (choice){
         case 1:
            System.out.println("\nMEOW MEOW MEOW!!!");
            break;
         case 2:
            System.out.println("\nAWH AWH AWH!!!");
            break;
         case 3:
            System.out.println("\nTWIT TWIT TWIT!!!");
            break;
         case 4:
            System.out.println("\nMEH MEH MEH!!!\n");
            break;
         default:
            System.out.println("\nInvalid choice. Please select a valid option.\n");
      }    
  }   
  public static int getUserChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter your choice (1-4): ");
        int choice = scanner.nextInt();
        scanner.close();
        return choice;      
  }
}