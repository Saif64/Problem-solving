import java.util.Scanner;

public class WaterMelon {

    private static void solve(int num){
           if(num % 2 == 0 && num != 2){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int num = scanner.nextInt();


        solve(num);
        }
    }
