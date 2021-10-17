import java.util.Scanner;

public class Word {
    static void solve(String s){
        String sl=s.toLowerCase();
        String su=s.toUpperCase();
        int l=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.toCharArray()[i]==sl.toCharArray()[i])
                l++;
        }
        int u=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.toCharArray()[i]==su.toCharArray()[i])
                u++;
        }
        if(l>u || l==u)
            System.out.println(s.toLowerCase());
        else
            System.out.println(s.toUpperCase());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        solve(s);
    }
}
