package dev.zelenin.practise2.logic;

import dev.zelenin.practise2.core.Matrix;

/**
 * Created by victor on 01.11.16.
 */
public class Adder {
    public static Matrix sum(final Matrix firstMatrix, final Matrix secondMatrix) {
        if (firstMatrix.getVerticalSize() != secondMatrix.getVerticalSize() ||
                firstMatrix.getHorizontalSize() != secondMatrix.getHorizontalSize()) {
            throw new IllegalArgumentException("Unexpected dimensions");
        }

        for (int i = 0; i < firstMatrix.getVerticalSize(); i++) {
            for (int j = 0; j < firstMatrix.getHorizontalSize(); j++) {
                int sumCell = firstMatrix.getElement(i, j) + secondMatrix.getElement(i, j);
                firstMatrix.setElement(i, j, sumCell);
            }
        }

        return firstMatrix;
    }
}
