package dev.zelenin.practise2.printer;

import dev.zelenin.practise2.core.Matrix;

/**
 * Created by victor on 01.11.16.
 */
public class ConsolePrinter implements MatrixPrinter {
    @Override
    public void print(Matrix matrix) {
        System.out.println(matrix);
    }
}
