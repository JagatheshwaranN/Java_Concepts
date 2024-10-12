package preparation.revise_1.loop;

public class LoopTilingExample {
    public static void main(String[] args) {
        int matrixSize = 1000;
        int blockSize = 10; // Size of each block

        // Initialize a matrix
        int[][] matrix = new int[matrixSize][matrixSize];
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                matrix[i][j] = i * matrixSize + j; // Some arbitrary initialization
            }
        }

        // Loop tiling
        for (int i = 0; i < matrixSize; i += blockSize) {
            for (int j = 0; j < matrixSize; j += blockSize) {
                // Process a block
                processBlock(matrix, i, j, blockSize);
            }
        }
    }

    // Method to process a block of the matrix
    private static void processBlock(int[][] matrix, int startRow, int startCol, int blockSize) {
        // Iterate over the block
        for (int i = startRow; i < startRow + blockSize; i++) {
            for (int j = startCol; j < startCol + blockSize; j++) {
                // Process each element of the block
                System.out.print(matrix[i][j] + " "); // Example: Print the element
            }
            System.out.println(); // Newline after processing each row of the block
        }
        System.out.println(); // Additional newline to separate blocks
    }
}
