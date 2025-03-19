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

        char secondMostFrequent = findSecondMostFrequentChar(input);
        System.out.println("Ky tu co so lan xuat hien nhieu thu 2 trong chuoi la: " + secondMostFrequent);
        sc.close();
    }

    public static char findSecondMostFrequentChar(String input) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("Chuoi rong");
        }

        int[] charCount = new int[256];
        for (char c : input.toCharArray()) {
            charCount[c]++;
        }

        int firstMax = 0, secondMax = 0;
        for (int count : charCount) {
            if (count > firstMax) { 
                secondMax = firstMax;
                firstMax = count;
            } else if (count > secondMax && count != firstMax) {
                secondMax = count;
            }
        }

        for (char c : input.toCharArray()) {
            if (charCount[c] == secondMax) {
                return c;
            }
        }

        return '\0';
    }
}
