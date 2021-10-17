import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class BoyOrGirl {
    static void solve(String str){
            str = str.toLowerCase();
        Set<Character> origSet = new LinkedHashSet<Character>();
        StringBuilder concat = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (origSet.add(str.charAt(i))) {
                concat.append(str.charAt(i));
            }
        }

        if (concat.length() % 2 != 0){
            System.out.println("IGNORE HIM!");
        }
        else {
            System.out.println("CHAT WITH HER");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        solve(word);
    }
}
