import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pehla number daalein:");
        double num1 = scanner.nextDouble();

        System.out.println("Operator daalein (+, -, *, /):");
        char operator = scanner.next().charAt(0);

        System.out.println("Dusra number daalein:");
        double num2 = scanner.nextDouble();

        double result = 0;

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
                if (num2 == 0) {
                    System.out.println("Error: Zero se divide nahi kar sakte.");
                    return;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Galat operator.");
                return;
        }

        System.out.println("Result: " + result);
        scanner.close();
    }
}
