package Bai5;

import java.util.Scanner;

public class Bai5b {
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

        double avgMinPerCol = findAvgMinPerCol(matrix);
        System.out.println("Trung binh cong cac so nho nhat cua moi cot la: " + avgMinPerCol);
        
        
            
    }
    public static double findAvgMinPerCol(double[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        double[] minValues = new double[n];
        for (int j = 0; j < n; j++) {
            double min = matrix[0][j];
            for (int i = 1; i < m; i++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
            minValues[j] = min;
        }
        double sum = 0;
        for (double value : minValues) {
            sum += value;
        }
        return sum / n;
    }
}
