package java

import java.util.Scanner;

public class AntonAndDanik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noGames = scanner.nextInt();
        String name = scanner.nextLine();
        name = name.toUpperCase();
        int countA = 0;
        int countD = 0;
        char winner;
        for (int i = 0; i < noGames; i++) {
            winner = name.charAt(i);
            if (winner == 'A')
                countA++;
            else if (winner == 'D')
                countD++;
        }

        if (countA > countD){
            System.out.println("Anton");
    }
        else if (countA < countD) {
            System.out.println("Danik");
        }
        else {
            System.out.println("FriendShip");
        }

    }
}
