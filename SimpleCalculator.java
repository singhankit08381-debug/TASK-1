import java.util.Scanner;

class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Calculator!");
        System.out.println("Type 'exit' anytime to quit.\n");

        while (true) {
            System.out.print("Enter first number (or type exit): ");
            if (sc.hasNext("exit")) break;
            double num1 = sc.nextDouble();

            System.out.print("Enter operator (+, -, *, /): ");
            char op = sc.next().charAt(0);

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            switch (op) {
                case '+':
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case '-':
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case '*':
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case '/':
                    if (num2 != 0) {
                        System.out.println("Result: " + (num1 / num2));
                    } else {
                        System.out.println("Error: Division by zero!");
                    }
                    break;
                default:
                    System.out.println("Invalid operator!");
            }
            System.out.println(); // blank line for readability
        }

        System.out.println("Goodbye!");
        sc.close();
    }
}