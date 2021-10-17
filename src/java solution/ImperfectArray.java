import  java.util.Scanner;

public class ImperfectArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();

        int product = 1;


        for (int limit = 0; limit < testcase; limit++) {
            boolean flag = false;
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int in = sc.nextInt();
                if (((int)Math.sqrt(in)*(int)Math.sqrt(in)) != in) {
                    flag = true;
                }
            }
            if(flag) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}

