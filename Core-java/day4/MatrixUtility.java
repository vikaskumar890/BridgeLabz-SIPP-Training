public class MatrixUtility {

    public static int[][] transpose(int[][] mat) {
        int[][] trans = new int[mat[0].length][mat.length];
        for (int i = 0; i < mat.length; i++)
            for (int j = 0; j < mat[0].length; j++)
                trans[j][i] = mat[i][j];
        return trans;
    }

    public static int determinant2x2(int[][] mat) {
        return mat[0][0] * mat[1][1] - mat[0][1] * mat[1][0];
    }

    public static double[][] inverse2x2(int[][] mat) {
        int det = determinant2x2(mat);
        if (det == 0) return null;

        double[][] inv = new double[2][2];
        inv[0][0] = mat[1][1] / (double) det;
        inv[0][1] = -mat[0][1] / (double) det;
        inv[1][0] = -mat[1][0] / (double) det;
        inv[1][1] = mat[0][0] / (double) det;
        return inv;
    }

    public static void printMatrix(int[][] mat) {
        for (int[] row : mat) {
            for (int v : row) System.out.print(v + " ");
            System.out.println();
        }
    }

    public static void printMatrix(double[][] mat) {
        for (double[] row : mat) {
            for (double v : row) System.out.printf("%.2f ", v);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] mat = {
                {4, 7},
                {2, 6}
        };

        System.out.println("Original:");
        printMatrix(mat);

        System.out.println("Transpose:");
        printMatrix(transpose(mat));

        System.out.println("Determinant: " + determinant2x2(mat));

        System.out.println("Inverse:");
        double[][] inv = inverse2x2(mat);
        if (inv != null) printMatrix(inv);
        else System.out.println("Matrix is not invertible.");
    }
}
