package Bai5;
import java.util.Scanner;

public class Bai5e {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so hang cua ma tran: ");
        int m = scanner.nextInt();
        System.out.println("Nhap so cot cua ma tran: ");
        int n = scanner.nextInt();

        double[][] M = new double[m][n];
        double[][] N = new double[n][m];

        System.out.println("Nhap phan tu cua ma tran M: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                M[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("Nhap phan tu cua ma tran N: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                N[i][j] = scanner.nextDouble();
            }
        }

        double[][] P = multiplyMatrices(M, N, m, n, m);
        System.out.println("Ma tran tich P: ");
        printMatrix(P, m, m);

        scanner.close();
        
        
    }

    public static double[][] multiplyMatrices(double[][] M, double[][] N, int m, int n, int p) {
        double[][] P = new double[m][p];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < n; k++) {
                    P[i][j] += M[i][k] * N[k][j];
                }
            }
        }
        return P;
    }

    public static void printMatrix(double[][] matrix, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
