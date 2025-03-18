import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        
        System.out.println("Nhap cac phan tu cua mang, nhap phan tu khac so de ket thuc");
        while (sc.hasNextInt()) {
            arr.add(sc.nextInt());
        }

        int[] inputArray = arr.stream().mapToInt(i -> i).toArray();
        int[] longestSubsequence = findLongestSubsequence(inputArray);

        if (longestSubsequence.length == 0) {
            System.out.println("Khong ton tai");
        } else {
            System.out.println("Mang con dai nhat la: ");
            System.out.println(Arrays.toString(longestSubsequence));
        }
        sc.close();
    }

    public static int[] findLongestSubsequence(int[] arr) {
        if (arr.length == 0) {
            return new int[0];
        }
        
        HashSet<Integer> numSet = new HashSet<>();
        for (int num : arr) {
            numSet.add(num);
        }
        
        int maxLength = 0;
        int startOfLongest = 0;
        
        for (int num : arr) {
            if (!numSet.contains(num - 1)) { 
                int currentNum = num;
                int length = 1;
                
                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    length++;
                }
                
                if (length > maxLength) {
                    maxLength = length;
                    startOfLongest = num;
                }
            }
        }
        
        int[] longestSubarray = new int[maxLength];
        for (int i = 0; i < maxLength; i++) {
            longestSubarray[i] = startOfLongest + i;
        }
        
        return longestSubarray;
        
        
    }
}
