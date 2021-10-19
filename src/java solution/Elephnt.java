package java

import java.util.Scanner;

public class Elephnt {
    static void solve(int a){
        int count =0;

        for (int i = 1; i <= a; i += 5) {
            if (a > 5) {
                count++;
            }
        }
        if (a < 6){
            System.out.println(1);
        }
        else {
            System.out.println(count);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        solve(a);
    }
}
