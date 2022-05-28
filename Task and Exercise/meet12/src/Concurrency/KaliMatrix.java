// https://www.javaprogramto.com/2020/01/java-matrix-multiplication-threads.html
package Concurrency;

import java.util.Date;
import Basic.MatrixGenerator;

public class KaliMatrix {

    public static void main(String[] args) {

        Date start = new Date();

        int[][] matrix1 = MatrixGenerator.generateMatrix(1200, 1200);
        int[][] matrix2 = MatrixGenerator.generateMatrix(1200, 1200);

        int[][] result = new int[matrix1.length][matrix2[0].length];
        CreateThread.multiply(matrix1, matrix2, result);

        Date end = new Date();
        System.out.println("\nMenghabiskan Waktu (ms) : " + (end.getTime() - start.getTime()));
        System.out.println();
    }

}