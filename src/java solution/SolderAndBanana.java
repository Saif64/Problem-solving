import java.util.Scanner;

public class SolderAndBanana {
    static void solve(int k, int n, int w){
        int sum = 0;
        int prod;

        for (int i = 1; i <= w; i++) {
            prod = k * i;
            sum = sum + prod;
        }

        int left = sum - n;

        if (left < 0){
            System.out.println(0);
        }
        else {
            System.out.println(left);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        int w = scanner.nextInt();

        solve(k, n, w);
    }
}
