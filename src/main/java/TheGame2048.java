import java.util.Scanner;


public class TheGame2048 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Field gameField = new Field();
        gameField.setField(5);
        gameField.addTwoInRandomCell(gameField.getCells());
        System.out.println("Push W to move all field up!\n Push S to move all field down!\n" +
                " Push A to move all field left!\n Push D to move all field right!");
        while (!gameField.gameOverWithWinner(gameField.getCells())|| !gameField.realGameOver(gameField.getCells())) {
            int value = scanner.nextInt();
            switch (value) {
                case 1:
                    System.out.println("You moved everything up");
                    gameField.moveAllRowsUp(gameField.getCells());
                    break;
                case 2:
                    System.out.println("You moved everything down");
                    gameField.moveAllRowsDown(gameField.getCells());
                    break;
                case 3:
                    System.out.println("You moved everything left");
                    gameField.moveAllColumnsLeft(gameField.getCells());
                    break;
                case 4:
                    System.out.println("You moved everything right");
                    gameField.moveAllColumnsRight(gameField.getCells());
                    break;
                default:
                    scanner.nextInt();
            }
        }
    }


}
