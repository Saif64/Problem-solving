package java

import java.util.Scanner;

public class Hulk {
        static void solve(int n){
            for(int i=1;i<n;i++){
                if(i%2==1){
                    System.out.print("I hate  that ");
                }
                else{
                    System.out.print("I love  that ");
                }
            }
            if(n%2==1){
                System.out.print("I hate it\n");
            }
            if(n%2==0){
                System.out.print("I love it\n");
            }
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        solve(n);
    }
}
