import java.util.Scanner;

public class pyramid3{

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a positive integer n
        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int n = scanner.nextInt();

        // Check if the input is a positive integer
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Create a 2D array to store Pascal's Triangle
            int[][] triangle = new int[n][];
            
            // Generate Pascal's Triangle
            for (int i = 0; i < n; i++) {
                triangle[i] = new int[i + 1];
                triangle[i][0] = 1; // The first element of each row is 1
                triangle[i][i] = 1; // The last element of each row is 1
                
                // Compute the values in between
                for (int j = 1; j < i; j++) {
                    triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
                }
            }

            // Print Pascal's Triangle
            for (int i = 0; i < n; i++) {
                // Print leading spaces for formatting
                for (int j = 0; j < n - i - 1; j++) {
                    System.out.print(" ");
                }
                // Print the values of the current row
                for (int j = 0; j < triangle[i].length; j++) {
                    System.out.print(triangle[i][j] + " ");
                }
                System.out.println(); // Move to the next line
            }
        }

        // Close the scanner
        scanner.close();
    }
}
