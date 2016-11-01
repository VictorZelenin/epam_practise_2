package dev.zelenin.practise2.factory;

import dev.zelenin.practise2.core.Matrix;

/**
 * Created by victor on 01.11.16.
 */
public class MatrixFactory {
    private static final int RANGE = 10;

    public static Matrix createMatrix(int n, int m) {
        Matrix matrix = new Matrix(n, m);

        for (int i = 0; i < matrix.getVerticalSize(); i++) {
            for (int j = 0; j < matrix.getHorizontalSize(); j++) {
                matrix.setElement(i, j, (int) (Math.random() * RANGE));
            }
        }

        return matrix;
    }

    public static void main(String[] args) {
        System.out.println(createMatrix(3, 3));
    }
}
