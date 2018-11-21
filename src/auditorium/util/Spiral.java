package auditorium.util;

import java.security.InvalidParameterException;

public class Spiral {

    public static void main(String[] args) {
        int[][] matrix = createSpiralMatrix(11);
        print(matrix);
    }

    /**
     *  For example, if odd_size is 7 then the result should be
     *  the matrix described below:
     *
     *   31 30 29 28 27 26 49
     *   32 13 12 11 10 25 48
     *   33 14 3  2  9  24 47
     *   34 15 4  1  8  23 46
     *   35 16 5  6  7  22 45
     *   36 17 18 19 20 21 44
     *   37 38 39 40 41 42 43
     *
     * @param size size of columns and rows
     * @throws InvalidParameterException will be thrown if the specified size is not a odd number
     */
    public static int[][] createSpiralMatrix ( int size )  throws InvalidParameterException{
        int[][] matrix = new int[size][size];

        return matrix;
    }


    public static void print(int[][] matrix) {

    }
}