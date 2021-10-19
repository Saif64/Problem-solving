package java

import java.util.Scanner;

public class EvenOdds {
    static void solve(long n, long k){
        if(n%2==0){
            if(k<=n/2){
                System.out.println(2*k-1);
            }
            else{
                k=k-n/2;
                System.out.println(2*k);

            }
        }
        else{
            if(k<=(n/2)+1){
                System.out.println(2*k-1);
            }
            else{
                k=k-(n/2)-1;
                System.out.println(2*k);

            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
         long n = scanner.nextLong();
         long k = scanner.nextLong();
        solve(n,k);
    }
}
