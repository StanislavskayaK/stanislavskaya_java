import java.util.Scanner;

public class NumberOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number a: ");
        int a = scanner.nextInt();
        System.out.print("Enter number b: ");
        int b = scanner.nextInt();

        compareNumbers(a, b);
        performOperations(a, b);

        scanner.close();
    }

    private static void compareNumbers(int a, int b) {
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }
    }

    private static void performOperations(int a, int b) {
        System.out.println("Addition: " + a + " + " + b + " = " + (a + b));
        System.out.println("Subtraction: " + a + " - " + b + " = " + (a - b));
        System.out.println("Multiplication: " + a + " * " + b + " = " + (a * b));
        if (b != 0) {
            System.out.println("Division: " + a + " / " + b + " = " + ((double) a / b));
        } else {
            System.out.println("Cannot divide by zero");
        }
    }
}
