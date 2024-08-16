import java.util.Scanner;

public class IT24102222Lab4Q2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input and validate exam marks
        double examMarks = inputMarks(scanner, "exam");
        double labMarks = inputMarks(scanner, "lab");

        // Input and validate percentage weights
        double examPercentage = inputPercentage(scanner, "exam");
        double labPercentage = inputPercentage(scanner, "lab");

        // Check if percentages add up to 100
        if (examPercentage + labPercentage != 100) {
            System.out.println("Error: The percentages must add up to 100.");
            scanner.close();
            return;
        }

        // Calculate the final mark
        double finalMark = (examMarks * examPercentage / 100) + (labMarks * labPercentage / 100);
        
        // Display the final mark
        System.out.printf("The final mark is: %.2f%n", finalMark);

        // Close the scanner
        scanner.close();
    }

    // Method to input and validate marks
    private static double inputMarks(Scanner scanner, String type) {
        double marks;
        while (true) {
            System.out.printf("Enter the %s marks (0-100): ", type);
            marks = scanner.nextDouble();
            if (marks >= 0 && marks <= 100) {
                break;
            } else {
                System.out.println("Error: Marks must be between 0 and 100.");
            }
        }
        return marks;
    }

    // Method to input and validate percentage weights
    private static double inputPercentage(Scanner scanner, String type) {
        double percentage;
        while (true) {
            System.out.printf("Enter the percentage for %s marks (0-100): ", type);
            percentage = scanner.nextDouble();
            if (percentage >= 0 && percentage <= 100) {
                break;
            } else {
                System.out.println("Error: Percentage must be between 0 and 100.");
            }
        }
        return percentage;
    }
}
