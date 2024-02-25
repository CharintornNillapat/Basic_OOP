package lab6;

import java.util.Scanner;

public class BoardGame {

  static final int BOARD_SIZE = 10;

  private Board board = new Board();
  private Figure c1;
  private Figure c2;

    
    public BoardGame(Figure c1, Figure c2) {
    this.c1 = c1;
    this.c2 = c2;
  }
  public void playGame(Scanner scanner) { //รับอินพุตจากผู้ใช้และตรวจสอบการเคลื่อนที่ของหมาก
    while (true) {

      board.printBoard(c1.getPosition(), c2.getPosition(), c1, c2); // เเสดงสถานะของกระดาน
      System.out.println(" ");
      System.out.println("Enter movement for " + c1 + " (enter position 1-10, exit to quit):");
      String move1 = scanner.nextLine();

      validateAndMove(c1, move1, c2.getPosition(), scanner); // ตรวจสอบการเคลื่อนที่ที่ถูกต้อง

      board.printBoard(c1.getPosition(), c2.getPosition(), c1, c2); // เเสดงสถานะของกระดาน
      
      System.out.println(" ");
      System.out.println("Enter movement for " + c2 + " (enter position 1-10, exit to quit):"); // รับการเคลื่อนที่สำหรับหมากตัวสอง
      String move2 = scanner.nextLine();

      validateAndMove(c2, move2, c1.getPosition(), scanner); // ตรวจสอบการเคลื่อนที่ที่ถูกต้อง
    }
  }
  private void validateAndMove(Figure figure, String move, int otherFigurePosition, Scanner scanner) { //ตรวจสอบและทำการเคลื่อนที่
    while (true) {

      if (move.equalsIgnoreCase("exit")) {
        System.out.println(" ");
        System.out.println("Game exited.");
        System.exit(0);
      } else if (!isNumeric(move)) {
        
        System.out.println(" ");
        System.out.println("Invalid input of." + figure + " Please enter a number between 1 and 10, or 'exit' to quit.");
      } else if (Integer.parseInt(move) == figure.getPosition()) {
        
        System.out.println(" ");
        System.out.println(figure + " cannot move to its current position. Please try a different position.");
      } else {
        // ทำการเคลื่อนที่ตัวหมาก
        int desiredPosition = Integer.parseInt(move);
        boolean validMove = figure.move(desiredPosition, otherFigurePosition);
        if (!validMove) {
          
          System.out.println(" ");
          System.out.println("Invalid move for " + figure + ". Please try again.");
        } else {
          break;
        }
      }
      move = scanner.nextLine(); // รับค่าการเคลื่อนที่ใหม่
    }
  }
  private static boolean isNumeric(String str) { //ตรวจสอบว่าข้อมูลเป็นตัวเลขหรือไม่
    try {
      Double.parseDouble(str);
      return true;
    } catch (NumberFormatException e) {
      return false;
    }
  }
}
class Board {
    public void printBoard(int c1Position, int c2Position, Figure c1, Figure c2 ) { //เเสดงสถานะของกระดาน
        System.out.print("A B C D E F G H");
        System.out.println("8");
        for (int i = 1; i <= BoardGame.BOARD_SIZE; i++) {
            if (i == c1Position) {
                System.out.print("[" + c1 +"]");
            } else if (i == c2Position) {
                System.out.print("[" + c2 +"]");
            } else {
                System.out.print("[" + i +"]");
            }
            System.out.print(" ");
        }
        
    }
}
 class Figure {

  private int position;
  private String name;

  public Figure(int initialPosition, String name) {
    this.position = initialPosition;
    this.name = name;
  }

  public int getPosition() {
    return position;
  }

  public boolean move(int newPosition, int otherFigurePosition) {
    if (newPosition < 1 || newPosition > BoardGame.BOARD_SIZE || newPosition == otherFigurePosition) {
      return false; // การเคลื่อนที่ไม่ถูกต้อง
    } else {
      position = newPosition;
      return true;
    }
  }

  @Override
  public String toString() {
    return name;
  }
}