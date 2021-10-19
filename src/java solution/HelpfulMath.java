package java

import java.util.Arrays;
import java.util.Scanner;

public class HelpfulMath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sr = scanner.next();
        sr  = sr.replace("+" , "");
        char[] s = sr.toCharArray();

        Arrays.sort(s);

        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]);
            if (i == s.length -1){
                continue;}
            System.out.print("+");
        }
        System.out.println();

    }
}
