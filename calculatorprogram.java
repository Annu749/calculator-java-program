import java.util.Scanner;
public class calculatorprogram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter first number:");
        double num1 = sc.nextDouble();
        
        System.out.println("Enter an operator (+, -, *, /):");
        char operator = sc.next().charAt(0);
        
        System.out.println("Enter second number:");
        double num2 = sc.nextDouble();
        
        double result = 0;
        boolean valid = true;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero");
                    valid = false;
                }
                break;
            default:
                System.out.println("Error: Invalid operator");
                valid = false;
        }

        if (valid) {
            System.out.println("Result: " + result);
        }
        
        sc.close();
    }
}
