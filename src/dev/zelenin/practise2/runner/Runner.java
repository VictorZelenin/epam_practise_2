package dev.zelenin.practise2.runner;

import dev.zelenin.practise2.core.Matrix;
import dev.zelenin.practise2.factory.MatrixFactory;
import dev.zelenin.practise2.printer.ConsolePrinter;
import dev.zelenin.practise2.printer.MatrixPrinter;

import static dev.zelenin.practise2.logic.Adder.sum;

/**
 * Created by victor on 01.11.16.
 */
public class Runner {
    private static final int N = 3;
    private static final int M = 4;

    private static void run() {
        Matrix firstMatrix = MatrixFactory.createMatrix(N, M);
        Matrix secondMatrix = MatrixFactory.createMatrix(N, M);

        MatrixPrinter printer = new ConsolePrinter();
        printer.print(firstMatrix);
        printer.print(secondMatrix);
        printer.print(sum(firstMatrix, secondMatrix));
    }

    public static void main(String[] args) {
        run();
    }
}
