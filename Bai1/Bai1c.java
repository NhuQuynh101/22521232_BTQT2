import java.util.Scanner;

public class Bai1c {
    public static void main (String[] args) {
        int n;
        System.out.println ("Nhap so nguyen duong n: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while (n <= 0) {
            System.out.println ("Nhap lai so nguyen duong n: ");
            n = sc.nextInt();
        }
        
        long P = ProductOfDivisors(n);
        System.out.println("Tich cac uoc so cua " + n + " la: " + P);
        sc.close();
    }

    public static long ProductOfDivisors(int n) {
        long P = 1;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                P *= i;
            }
        }
        return P;
    }
}