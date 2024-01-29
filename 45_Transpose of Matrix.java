/* Problem Statement :-
Write a program to find the transpose of a square matrix of size N*N. Transpose of a matrix is obtained by changing rows to columns and columns to rows.
*/

// Answer :-

class Solution{
    public void transpose(int n, int[][] a) {

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
    }
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
