import java.util.Scanner;

public class Bai1d {
    public static void main (String[] args) {
        int n;
        System.out.println ("Nhap so nguyen duong n: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while (n <= 0) {
            System.out.println ("Nhap lai so nguyen duong n: ");
            n = sc.nextInt();
        }
        if (isPerfectNumber(n)){
            System.out.println("So " + n + " la so hoan hao");
        }
        else{
            System.out.println("So " + n + " khong phai la so hoan hao");
        }
        sc.close();
    }

    public static boolean isPerfectNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }
}
