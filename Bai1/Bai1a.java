import java.util.Scanner;

public class Bai1a {
    public static void main (String[] args) {
        int n;
        System.out.println ("Nhap so nguyen duong n: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while (n <= 0) {
            System.out.print ("Nhap lai so nguyen duong n: ");
            n = sc.nextInt();
        }
        int i = findfirstDigit(n);
        System.out.println("Chu so dau tien cua " + n + " la: " + i);

        sc.close();
    }

    public static int findfirstDigit(int n) {
        while (n >= 10) {
            n /= 10;
        }
        return n;
    }
}