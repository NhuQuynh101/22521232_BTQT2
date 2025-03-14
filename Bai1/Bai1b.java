import java.util.Scanner;

public class Bai1b {
    public static void main (String[] args) {
        int n;
        System.out.println ("Nhap so nguyen duong n: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        while (n<=0) {
            System.out.println ("Nhap lai so nguyen duong n: ");
            n = sc.nextInt();
        }
        if (CheckAllOddDigit(n)){
            System.out.println("So " + n + " co toan chu so le");
        }
        else{
            System.out.println("So " + n + " khong co toan chu so le");
        }
        sc.close();
    }

    public static boolean CheckAllOddDigit(int n) {
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 == 0) {
                return false;
            }
            n /= 10;
        }
        return true;
    }
}
