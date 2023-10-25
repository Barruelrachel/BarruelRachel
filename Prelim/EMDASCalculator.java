import java.util.Scanner;

public class EMDASCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input two numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        // Input the operation
        System.out.print("Enter the operation (^ for power, *, /, +, -): ");
        scanner.nextLine(); 
        String operation = scanner.nextLine();
        
        double result;
        
        switch (operation) {
            case "^":
                result = Math.pow(num1, num2);
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Division by zero is not allowed.");
                    return;
                }
                break;
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            default:
                System.out.println("Invalid operation. Please enter ^, *, /, +, or -.");
                return;
        }
        
        System.out.println("Result: " + result);
        
        scanner.close();
    }
}