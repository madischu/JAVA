import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        double[][] matrix = new double[3][4];
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a 3 by 4 matrix row by row: ");
            for (double[] row : matrix) {
                for (int j = 0; j < row.length; j++) {
                    row[j] = scanner.nextDouble();
                }
            }
        }

        for (int col = 0; col < 4; col++) {
            System.out.println("Sum of the elements at column " + col + " is " + sumColumn(matrix, col));
        }
    }
        public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0;
        for (double[] row : m) {
            sum += row[columnIndex];
        }
        return sum;
    }
}

