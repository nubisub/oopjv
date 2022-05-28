// https://www.javaprogramto.com/2020/01/java-matrix-multiplication-threads.html
package Basic;
import java.util.Date;

public class KaliMatrix {

    public static void main(String[] args) {

        Date start = new Date();
        // matrix1
        int[][] matrix1 = MatrixGenerator.generateMatrix(1200, 1200);
        // matrix2
        int[][] matrix2 = MatrixGenerator.generateMatrix(1200, 1200);
        // hasil
        int[][] hasil = multiply(matrix1, matrix2);

        Date end = new Date();
        System.out.println("\nMenghabiskan Waktu (ms) : " + (end.getTime() - start.getTime()));
        System.out.println();

    }

    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        // jumlah baris
        int jumlahBaris = matrix1.length;
        // jumlah kolom
        int jumlahKolom = matrix2[0].length;
        // hasil
        int[][] hasil = new int[jumlahBaris][jumlahKolom];
        int columns2 = matrix2[0].length;

for (int i = 0; i < jumlahBaris; i++) {
    for (int j = 0; j < columns2; j++) {
        hasil[i][j] = 0;
        for (int k = 0; k < jumlahKolom; k++) {
            hasil[i][j] += matrix1[i][k] * matrix2[k][j];
        }
    }
}
        return hasil;
    }
}