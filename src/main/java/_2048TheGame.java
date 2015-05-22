import java.util.Scanner;


public class _2048TheGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Field gameField = new Field();
        gameField.setField(5);
        gameField.addTwoInRandomCell(gameField.getCells());
        System.out.println("Put 1 to move all field up!\n Put 2 to move all field down!\n" +
                " Put 3 to move all field left!\n Put 4 to move all field right!");
        while (!gameField.gameOverWithWinner(gameField.getCells())|| !gameField.realGameOver(gameField.getCells())) {
            int value = scanner.nextInt();
            switch (value) {
                case 1:
                    System.out.println("You moved everithing up");
                    gameField.moveAllRowsUp(gameField.getCells());
                    break;
                case 2:
                    System.out.println("You moved everithing down");
                    gameField.moveAllRowsDown(gameField.getCells());
                    break;
                case 3:
                    System.out.println("You moved everithing left");
                    gameField.moveAllColumnsLeft(gameField.getCells());
                    break;
                case 4:
                    System.out.println("You moved everithing right");
                    gameField.moveAllColumnsRight(gameField.getCells());
                    break;
                default:
                    scanner.nextInt();
            }
        }
    }


}
