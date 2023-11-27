package TP1;
import java.util.Scanner;

public class Tp1_exo5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer;

        do {
            System.out.println("Enter the number of rows of your matrix:");
            int rows = scanner.nextInt();
            System.out.println("Enter the number of columns of your matrix:");
            int columns = scanner.nextInt();

            // Ask the user for values val1 and val2
            System.out.print("Enter value for val1: ");
            int val1 = scanner.nextInt();
            System.out.print("Enter value for val2: ");
            int val2 = scanner.nextInt();

            // Creating 2D array for the matrix
            int[][] array = new int[rows][columns];

            // Filling the matrix
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    if (i % 2 == 0) {
                        array[i][j] = val1;
                    } else {
                        array[i][j] = val2;
                    }
                }
            }

            // Printing the matrix to the screen
            System.out.println("The 2D array you created is:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println(); // Move to the next row
            }

            System.out.println("Do you want to run the program again?");
            System.out.println("Press Y to continue or anything else for no: ");
            scanner.nextLine(); // Consume the newline character
            answer = scanner.nextLine();
        } while (answer.equals("Y") || answer.equals("y"));

        System.out.println("Thank you, see you later!");
        scanner.close();
    }
}

