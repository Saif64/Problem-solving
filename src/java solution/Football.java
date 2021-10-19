package java

import java.util.Scanner;

public class Football {
    static boolean solve(String str){
       if (str.contains("1111111") || str.contains("0000000")){
           return true;
       }
       return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String value = scanner.next();

        if (solve(value)){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
