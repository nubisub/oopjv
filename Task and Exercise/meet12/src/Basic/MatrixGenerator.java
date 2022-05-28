// https://www.javaprogramto.com/2020/01/java-matrix-multiplication-threads.html
package Basic;
import java.util.Random;

public class MatrixGenerator {

    public static int[][] generateMatrix(int rows, int columns) {
        int[][] result = new int[rows][columns];
        Random random = new Random();

        // random matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = random.nextInt(100) * 10;
            }
        }
        return result;
    }
}