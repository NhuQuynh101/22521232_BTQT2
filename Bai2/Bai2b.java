package Bai2;
import java.util.Scanner;

public class Bai2b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao mot chuoi ky tu: ");
        String input = sc.nextLine();
        
        while (input.isEmpty()) {
            System.out.println("Chuoi rong, hay nhap lai:");
            input = sc.nextLine();
        }

        int sum = 0;
        StringBuilder numberBuffer = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                numberBuffer.append(c);
            } else {
                if (numberBuffer.length() > 0) {
                    sum += Integer.parseInt(numberBuffer.toString());
                    numberBuffer.setLength(0);
                }
            }
        }

        if (numberBuffer.length() > 0) {
            sum += Integer.parseInt(numberBuffer.toString());
        }

        System.out.println("Tong cac so trong chuoi la: " + sum);
        sc.close();
    }
}
