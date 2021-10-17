import java.util.Scanner;

public class WorldCaps {
    static void solve(String word){
        char[] ch = word.toCharArray();
        ch[0] = Character.toUpperCase(ch[0]);
        for(int i=0; i < ch.length; i++){
            System.out.print(ch[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String value = scanner.next();

        solve(value);
    }
}
