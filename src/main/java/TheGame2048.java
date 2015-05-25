import java.util.Scanner;


public class TheGame2048 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Field gameField = new Field();
        gameField.setField(5);
        gameField.addTwoInRandomCell(gameField.getCells());
        Row[] rows = gameField.getRows(gameField.getCells());
        Column[] columns = gameField.getColumns(gameField.getCells());
        System.out.println(" Push W to move all field up!\n Push S to move all field down!\n" +
                " Push A to move all field left!\n Push D to move all field right!");
        while (!gameField.gameOverWithWinner(rows) || !gameField.realGameOver(rows)) {
            String value = scanner.next();
            if (value.equals("W")) {
                System.out.println("You moved everything up");
                gameField.moveAllRowsUp(rows);
            } else if (value.equals("S")) {
                System.out.println("You moved everything down");
                gameField.moveAllRowsDown(rows);
            } else if (value.equals("A")) {
                System.out.println("You moved everything left");
                gameField.moveAllColumnsLeft(columns);
            } else if (value.equals("D")) {
                System.out.println("You moved everything right");
                gameField.moveAllColumnsRight(columns);
            }
            else
                System.out.println("Push correct button");
            System.out.println(gameField);

        }
    }
}
