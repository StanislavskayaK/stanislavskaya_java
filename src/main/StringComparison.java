import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string a: ");
        String a = scanner.nextLine().trim();

        System.out.print("Enter the second string b: ");
        String b = scanner.nextLine().trim();

        if (a.equals(b)) {
            System.out.println("Strings are identical");
        } else {
            System.out.println("Strings are not identical");
        }

        scanner.close();
    }
}
