package TP1;
import java.util.Scanner;

public class Tp1_exo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            // Initialize the array
            System.out.println("Enter the element " + (i + 1) + ":");
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            // Calculate the sum of the elements
            sum += array[i];
        }

        // Printing the result
        System.out.println("The sum of the array is: " + sum);
        scanner.close();
    }
    

}



