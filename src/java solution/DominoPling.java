import java.util.Scanner;

public class DominoPling {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int k = sc.nextInt();

            int ans = (n*k)/2;

            System.out.println(ans);
        }
    }
