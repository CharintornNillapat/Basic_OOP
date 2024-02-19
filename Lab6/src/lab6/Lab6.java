package lab6;

import java.util.Scanner;

public class Lab6 {
   public static void main(String[] args) {
        Figure p1 = new Figure(1, "BLACK KING");
        Figure p2 = new Figure(2, "WHITE KING");

        Scanner scanner = new Scanner(System.in);

        BoardGame game = new BoardGame(p1, p2);
        game.playGame(scanner);
    }
}