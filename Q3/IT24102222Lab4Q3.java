import java.util.Scanner;

public class IT24102222Lab4Q3 {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        
        // Read the input number
        int number = scanner.nextInt();

        // Determine if the number is positive, negative, or zero using the ternary operator
        String result = (number > 0) ? "The number is Positive." :
                        (number < 0) ? "The number is Negative." :
                        "The number is Zero.";

        // Display the result
        System.out.println(result);

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}
