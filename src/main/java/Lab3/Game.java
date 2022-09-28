package Lab3;

import java.util.Objects;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter name of 1st player: ");
        Player player1 = new Player(scan.nextLine());
        System.out.print("Enter name of 2nd player: ");
        Player player2 = new Player(scan.nextLine());
        Field a = new Field(player1, player2);
        a.gameOptions();
    }
}
