package Bai2;
import java.util.Scanner;

public class Bai2a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao mot chuoi ky tu: ");
        String input = sc.nextLine();

        while (input.isEmpty()) {
            System.out.println("Chuoi rong, hay nhap lai:");
            input = sc.nextLine();
        }

        int letterCount = 0;
        int spaceCount = 0;
        int digitCount = 0;
        int otherCount = 0;

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                letterCount++;
            } else if (Character.isWhitespace(c)) {
                spaceCount++;
            } else if (Character.isDigit(c)) {
                digitCount++;
            } else {
                otherCount++;
            }
        }

        System.out.println("Chu cai: " + letterCount + ", Khoang trang: " + spaceCount);
        System.out.println("So: " + digitCount + ", Cac ky tu khac: " + otherCount);

        sc.close();
    }
}

