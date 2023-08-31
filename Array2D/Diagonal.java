public class Diagonal {
    public static void main(String[] args) {
        int[][] matrix = {
                { 3, 2, 1, 85 },
                { 9, 11, 5, 25 },
                { 6, 0, 13, 25 },
                { 7, 21, 14, 25 } };

        int ans = Diagonalsum(matrix);
        System.out.println(ans);
    }

    static int Diagonalsum(int[][] matrix) {
        int sum = 0;
        int k = matrix[0].length-1;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix.length != matrix[i].length) {
                return 0; 
            }
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j ) {
                    sum = sum + matrix[i][j];
                    sum = sum + matrix[i][k];
                    k--;
                }

            }
        }
        return sum;
    }

}
