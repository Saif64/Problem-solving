import java.util.Scanner;

public class LuckyDivision {
    static void solve(int n){
       String s = Integer.toString(n);

        int count=0;
        for(int i=0; i<s.length(); i++)
            if(s.charAt(i)=='4' || s.charAt(i)=='7')
                ++count;

        if(count == 7 || count == 4)
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        solve(n);
    }
}
