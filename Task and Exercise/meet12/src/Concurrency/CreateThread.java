// https://www.javaprogramto.com/2020/01/java-matrix-multiplication-threads.html
package Concurrency;

import Basic.*;

import java.util.ArrayList;
import java.util.List;

public class CreateThread {
    final static int availableThread = Runtime.getRuntime().availableProcessors();
    public static void multiply(int[][] matrix1, int[][] matrix2, int[][] result) {
        List threads = new ArrayList<>();
        int rows1 = matrix1.length;
        for (int i = 0; i < rows1; i++) {
            Task task = new Task(result, matrix1, matrix2, i);
            Thread thread = new Thread(task);
            thread.start();
            threads.add(thread);
            if (threads.size() % availableThread == 0) {
                waitForThreads(threads);
            }
        }
    }

    private static void waitForThreads(List threads) {
        for (Object thread : threads) {
            try {
                ((Thread) thread).join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        threads.clear();
    }
}