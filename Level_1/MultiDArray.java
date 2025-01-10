import java.util.Scanner;

class MultiDArray {
    public static void main(String[] args) {
        // Creating Scanner object
        Scanner sc = new Scanner(System.in);

        // Taking rows and columns input
        System.out.print("Enter row size: ");
        int row = sc.nextInt();
        System.out.print("Enter column size: ");
        int col = sc.nextInt();

        // Initialize a 2D array
        int[][] matrix = new int[row][col];

        // Taking input for the 2D array
        System.out.println("Enter the elements of the 2D Array:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Creating a 1D array
        int[] arr = new int[row * col];
        int index = 0;

        // Copy elements from 2D array to 1D array
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[index++] = matrix[i][j]; // Increment index after copying
            }
        }

        // Display the 1D array
        System.out.println("The elements of the 1D Array are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
