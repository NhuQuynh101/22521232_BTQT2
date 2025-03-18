package Bai4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        
        System.out.println("Nhap cac so nguyen duong (nhap ky tu khong phai so de ket thuc):");
        while (scanner.hasNextInt()) {
            list.add(scanner.nextInt());
        }
        scanner.close();
        
        int[] arr = list.stream().mapToInt(i -> i).toArray();
        System.out.println("So tam giac co the co: " + countTriangles(arr));
    }

    public static int countTriangles(int[] arr) {
        int n = arr.length;
        if (n < 3) {
            return 0;
        }

        int count = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] > arr[k]) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}


