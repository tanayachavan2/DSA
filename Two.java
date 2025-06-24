public class Two {
    public static void main(String[] args) {
        // Declare and initialize a 2D array (3 rows, 4 columns)
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 2, 4, 6}
        };

        // Print the 2D array
        System.out.println("2D Array (Matrix):");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}


