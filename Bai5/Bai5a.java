package Bai5;

import java.util.Scanner;

public class Bai5a {
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
        
        double result = findMinEvenPositive(matrix);
        
        if (result == -1) {
            System.out.println("Khong tim thay so chan duong trong ma tran.");
        } else {
            System.out.println("So chan duong nho nhat trong ma tran la: " + result);
        }
    }
    public static double findMinEvenPositive(double[][] matrix) {
        double min = Double.MAX_VALUE;
        boolean found = false;
        
        for (double[] row : matrix) {
            for (double element : row) {
                if (element % 2 == 0 && element > 0 && element < min) {
                    min = element;
                    found = true;
                }
            }
        }   
        return found ? min : -1;
    }
    
}
