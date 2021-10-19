package java

import java.util.Scanner;

public class BearAndBigBrother {
    static void solve(int a, int b){
        int count = 0;
        while (a <= b){
            a = a * 3;
            b = b * 2;
            count++;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        solve(a,b);
    }
}
