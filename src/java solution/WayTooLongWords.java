import java.util.Scanner;

public class WayTooLongWords {
    public  static  void solve(String word){
        int length = word.length();
        for (int i = 0; i < word.length(); i++) {

            if(word.length() > 10){
                System.out.println(word.charAt(0) +"" + (length -2) + word.charAt(length - 1));
                break;
            }
            else {
                System.out.println(word);
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tc = scanner.nextInt();

        int i = 0;
        while (i<tc){
            String s = scanner.next();
            solve(s);
            i++;
        }
    }

}
