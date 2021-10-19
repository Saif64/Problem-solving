package java

import java.util.Scanner;

public class InSearchOfAEasyProblem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];


        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }

        boolean flag = true;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1){
                flag = false;
            }
        }

        if (flag){
            System.out.println("EASY");
        }
        else {
            System.out.println("HARD");
        }
    }
}
