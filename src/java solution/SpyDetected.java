import java.util.Scanner;

public class SpyDetected {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("testcase: ");
        int testcase = sc.nextInt();
            int index = 0;
            int flag = 0;
        for (int in = 0; in < testcase; in++) {
            System.out.print("array length: ");
            int n = sc.nextInt();
            int a[] = new int[n];

            for (int take = 0; take < a.length; take++) {
                a[take] = sc.nextInt();
            }
            for (int i = 0; i < a.length; i++) {
                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] != a[j]) {
                        index = j;
                    }
                }
                System.out.println(index+1);
                break;
            }
        }
    }
}

