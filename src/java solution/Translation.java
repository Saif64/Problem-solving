import java.util.Scanner;

public class Translation {
    static void solve(String s, String t){
        new StringBuilder();
        StringBuilder s1;
        StringBuilder t1 = new StringBuilder();
        t1.append(t);
        s1 = t1.reverse();

       String r =  s1.toString();

        if (s.equals(r)){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String t = scanner.next();

        solve(s,t);
    }
}
