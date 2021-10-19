package java

import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tc = scanner.nextInt();
        int count = 0;
        int[] a = new int[3];
        int sum = 0;
        for (int i = 0; i < tc; i++) {
            for (int row = 0; row < 3; row++) {
                a[row] = scanner.nextInt();
            }
            sum = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[j] == 1){
                    sum++;
                }
            }
            if (sum > 1){
                count++;
            }
        }
        System.out.println(count);
    }
}
