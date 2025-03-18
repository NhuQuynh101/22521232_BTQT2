package Bai5;

import java.util.Scanner;

public class Bai5c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so hang cua ma tran: ");
        int m = scanner.nextInt();
        System.out.println("Nhap so cot cua ma tran: ");
        int n = scanner.nextInt();
        double[][] matrix = new double[m][n];
        System.out.println("Nhap phan tu cua ma tran: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }
        scanner.close();

        matrix = removeRowHasMaxSum(matrix, m, n);
        System.out.println("Ma tran sau khi xoa hang co tong lon nhat: ");
        for (double[] row : matrix) {
            for (double element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        scanner.close();
            
    }
    public static double[][] removeRowHasMaxSum(double[][] matrix, int m, int n) {
        double maxSum = 0;
        int rowToRemove = -1;
        for (int i = 0; i < m; i++) {
            double rowSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += matrix[i][j];
            }
            if (rowSum > maxSum) {
                maxSum = rowSum;
                rowToRemove = i;
            }
        }
        if (rowToRemove != -1) {
            double[][] newMatrix = new double[m - 1][n];
            int newRowIndex = 0;
            for (int i = 0; i < m; i++) {
                if (i != rowToRemove) {
                    for (int j = 0; j < n; j++) {
                        newMatrix[newRowIndex][j] = matrix[i][j];
                    }
                    newRowIndex++;
                }
            }
            return newMatrix;
        }
        return matrix;

        }
}
