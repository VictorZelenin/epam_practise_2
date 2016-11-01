package dev.zelenin.practise2.core;

/**
 * Created by victor on 01.11.16.
 */
public class Matrix {
    private int[][] matrix;

    public Matrix(int n, int m) {
        matrix = new int[n][m];
    }

    public int getElement(int i, int j) {
        return matrix[i][j];
    }

    public void setElement(int i, int j, int value) {
        matrix[i][j] = value;
    }

    public int getVerticalSize() {
        return matrix.length;
    }

    public int getHorizontalSize() {
        return matrix[0].length;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        for (int[] rows : matrix) {
            for (int cell : rows) {
                builder.append(cell).append(" ");
            }
            builder.append("\n");
        }

        return builder.toString();
    }
}
