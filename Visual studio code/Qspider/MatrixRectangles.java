import java.util.*;

public class MatrixRectangles {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input matrix dimensions
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        // Input matrix elements
        int[][] matrix = new int[rows][columns];
        System.out.println("Enter the matrix elements (0 or 1):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Count rectangles
        int countRectangles = countRectangles(matrix);

        // Output result
        System.out.println("Number of rectangles filled with 1s and 0s: " + countRectangles);

        scanner.close();
    }

    // Function to count rectangles
    private static int countRectangles(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int count = 0;

        // Iterate through all possible rectangles
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                for (int k = i; k < rows; k++) {
                    for (int l = j; l < columns; l++) {
                        // Check if the rectangle contains only 1s or a mix of 1s and 0s
                        if (isRectangleValid(matrix, i, j, k, l)) {
                            count++;
                        }
                    }
                }
            }
        }

        return count;
    }

    // Function to check if a rectangle is valid
    private static boolean isRectangleValid(int[][] matrix, int startRow, int startCol, int endRow, int endCol) {
        for (int i = startRow; i <= endRow; i++) {
            for (int j = startCol; j <= endCol; j++) {
                if (matrix[i][j] != 1) {
                    return false; // Rectangle contains a 0
                }
            }
        }
        return true;
    }













    
}
