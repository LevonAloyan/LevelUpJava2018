package homework16.III_19.ruben_sharyan;

import java.security.*;

public class Spiral {

    public static void main(String[] args) {
        try {
            int[][] matrix = createSpiralMatrix(7);
            print(matrix);
        }catch (InvalidParameterException e){
            System.out.println("enter odd number");
        }
    }

    /**
     * For example, if odd_size is 7 then the result should be
     * the matrix described below:
     * <p>
     * 31 30 29 28 27 26 49
     * 32 13 12 11 10 25 48
     * 33 14 3  2  9  24 47
     * 34 15 4  1  8  23 46
     * 35 16 5  6  7  22 45
     * 36 17 18 19 20 21 44
     * 37 38 39 40 41 42 43
     *
     * @param size size of columns and rows
     * @throws InvalidParameterException will be thrown if the specified size is not a odd number
     */
    public static int[][] createSpiralMatrix(int size) throws InvalidParameterException {
        int[][] matrix = new int[size][size];
        if (size % 2 == 0) {
            throw new InvalidParameterException();
        }

        int row = matrix.length / 2;
        int col = row;
        int val = 1;
        matrix[row][col] = val;
        for (int i = 1; i <= matrix.length / 2; i++) {

            int step = 2 * i;
            row--;
            for (int j = 1; j <= step; j++) {
                val++;
                matrix[row][col] = val;
                col--;
            }
            col++;
            for (int j = 1; j <= step; j++) {
                row++;
                val++;
                matrix[row][col] = val;
            }
            for (int j = 1; j <= step; j++) {
                col++;
                val++;
                matrix[row][col] = val;

            }
            for (int j = 1; j <= step; j++) {
                row--;
                val++;
                matrix[row][col] = val;
            }
        }

        return matrix;
    }

    public static int getChakert(int n){
        if(n < 10)          return 1;
        if(n < 100)         return 2;
        if(n < 1000)        return 3;
        if(n < 10000)       return 4;
        if(n < 100000)      return 5;
        if(n < 1000000)     return 6;
        if(n < 10000000)    return 7;
        if(n < 100000000)   return 8;
        if(n < 1000000000)  return 9;

        return n;
    }

       public final static String []str = {
                    " ",
                    "  ",
                    "   ",
                    "    ",
                    "     ",
                    "      ",
                    "       ",
                    "        ",
                    "         ",
                    "          "


};


    public static void print(int[][] matrix) {
        int max =getChakert(matrix.length * matrix.length);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + str[max - getChakert(matrix[i][j])]);
            }
            System.out.println();
        }
    }
}

