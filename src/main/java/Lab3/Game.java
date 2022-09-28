package Lab3;

import java.util.Objects;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter name of 1st player: ");
        Player player1 = new Player(scan.nextLine());
        System.out.print("enter name of 2nd player: ");
        Player player2 = new Player(scan.nextLine());
        Field a = new Field(player1, player2);
        a.startGame();
        System.out.println();
        System.out.println(player1.getInformation());
        System.out.println(player2.getInformation());

        System.out.println("Try again?");
//        if (Objects.equals(scan.nextInt(), 1)){
//            a.startGame();
//        }

//        System.out.println("        |           |       ");
//        System.out.println("    O   |           |   X   ");
//        System.out.println("        |           |       ");
//        System.out.println("----------------------------");
//        System.out.println("        |           |       ");
//        System.out.println("    O   |           |   X   ");
//        System.out.println("        |           |       ");
//        System.out.println("----------------------------");
//        System.out.println("        |           |       ");
//        System.out.println("    O   |           |   X   ");
//        System.out.println("        |           |       ");
    }
}
