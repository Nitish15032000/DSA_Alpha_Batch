public class SpiralMatrix {

    public static void main(String[] args) {
        int[][] matrix = { { 3, 2, 1, 7 },
                { 9, 11, 5, 4 },
                { 6, 0, 13, 17 },
                { 7, 21, 14, 15 } };

        spiral(matrix);
    }

    private static void spiral(int[][] matrix) {
        int sr = 0;
        int sc = 0;
        int er = matrix.length - 1;
        int ec = matrix[0].length - 1;
        while (true) {
            // top
            for (int j = sc; j <= ec; j++) {
                System.out.print(matrix[sr][j]);
            }

            // right
            for (int i = sr + 1; i <= er; i++) {
                System.out.print(matrix[i][ec]);
            }

            // bottom
            for (int j = ec - 1; j >=sc; j--) {
                System.out.print(matrix[er][j]);
            }

            // left
            for (int i = er - 1; i >= sr+1; i--) {
                System.out.print(matrix[i][sc]);
            }

            sr++;
            sc++;
            er--;
            ec--;

            System.out.println();
        }
    }

}
