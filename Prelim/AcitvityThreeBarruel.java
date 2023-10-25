import java.util.Scanner;

public class AcitvityThreeBarruel{
   public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       
       double c1 = 100;
       double c2 = 150;
       double c3 = 120;
       double r1 = 20;
       double r2 = 30;
       
       double exchangeRate = 0.020;
       
       System.out.println("Menu"); 
       System.out.println("1. c1 = php" + c1); 
       System.out.println("2. c2 = php" + c2);
       System.out.println("3. c3 = php" + c3);
       System.out.println("Add-on");
       System.out.println("4. r1 = php" + r1);
       System.out.println("5. r2 = php" + r2); 
       
         System.out.println("Enter your order: ");
         int order = scan.nextInt();
         
         if (order < 1 || order >3)
         {
            System.out.println("Order Invalid");
         }
         else {
            System.out.println("Enter Quantity");
            int qty = scan.nextInt();
            
            System.out.print("Choose your Add-on: ");
            int addon = scan.nextInt();
          
            
            if(addon < 4 || addon> 5)
            {
               System.out.println("Add-on Invalid");
            }
            else{
               System.out.println("Enter Quantity");
               int qty1 = scan.nextInt();
              
               
               double total = 0.0;
            
            switch (order){
            case 1:
            total = c1 * qty;
            break;
            
            case 2:
            total = c2 * qty;
            break;
            
            case 3:
            total = c3 * qty;
            break;
            }
            
            double addontwo = 0.0;
            
            switch (addontwo){
            case 4:
            addontwo = r1 * qty1;
            break;
            
            case 5:
            addontwo = r2 * qty1;
            break;
         }
         }
         double totalcost = total + addontwo;
         
         double totalcostUSD = totalcost * exchangeRate;
         
         System.out.println("Total cose is: Php" + totalcost);
         
               System.out.println("Total cose is: USD" + totalcost);
}
   }   
   }
