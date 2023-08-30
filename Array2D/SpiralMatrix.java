public class SpiralMatrix {

    public static void main(String[] args) {
        int[][] matrix = { { 3, 2, 1, 7 },
                { 9, 11, 5, 4 },
                { 6, 0, 13, 17 },
                { 7, 21, 14, 15 } };

        spiralPrint(4, 4, matrix);
    }
    
    static void spiralPrint(int m, int n, int a[][])
    {
        int i, strow = 0, stcolumn = 0;
 
        /*
        m - ending row index
        n - ending column index
        i - iterator
        */
 
        while (strow < m && stcolumn < n) {
            // Print the first row from the remaining rows
            for (i = stcolumn; i < n; ++i) {
                System.out.print(a[strow][i] + " ");
            }
            strow++;
 
            // Print the last column from the remaining
            // columns
            for (i = strow; i < m; ++i) {
                System.out.print(a[i][n - 1] + " ");
            }
            n--;
 
            // Print the last row from the remaining rows */
            if (strow < m) {
                for (i = n - 1; i >= stcolumn; --i) {
                    System.out.print(a[m - 1][i] + " ");
                }
                m--;
            }
 
            // Print the first column from the remaining
            // columns */
            if (stcolumn < n) {
                for (i = m - 1; i >= strow; --i) {
                    System.out.print(a[i][stcolumn] + " ");
                }
                stcolumn++;
            }
        }
    }

}
