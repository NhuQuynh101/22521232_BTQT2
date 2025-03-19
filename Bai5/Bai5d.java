package Bai5;

import java.util.Scanner;
public class Bai5d {
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

        checkMatrixType(matrix, m, n);
        scanner.close();
    }

    public static void checkMatrixType(double[][] matrix, int m, int n) {
       if (m != n) {
        System.out.println("Ma tran khong phai la ma tran vuong");
        return;
       }
      
       boolean isUpperTriangular = true;
       boolean isLowerTriangular = true;

       for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            if (i > j && matrix[i][j] != 0) {
                isUpperTriangular = false;
            }
            if (i < j && matrix[i][j] != 0) {
                isLowerTriangular = false;
            }
        }
       }

       if (isUpperTriangular) {
        System.out.println("Ma tran la ma tran tam giac tren");
       }
       else if (isLowerTriangular) {
        System.out.println("Ma tran la ma tran tam giac duoi");
       }
       else {
        System.out.println("Ma tran khong phai la ma tran tam giac tren hoac duoi");
       }
    }
}
