import java.util.Scanner;

public class GameUI {
    public static void main(String[] args) {
        Field field = new Field(4);
        Helper helper = new Helper();
        Scanner scanner = new Scanner(System.in);

        while (helper.isFieldEmpty(field.getRows())|| helper.isFieldEmpty(field.getColumns())){
            System.out.println("Push W to move up\nPush S to move down\nPush A to move left\nPush D to move right");
            helper.putTwoInRandomPosition(field.getRows());
            System.out.println(field.toString());
            String some = scanner.nextLine();
            if (some.equals("W"))
                helper.moveUp(field.getColumns());
            else if(some.equals("S"))
                helper.moveDown(field.getColumns());
            else if(some.equals("A"))
                helper.moveLeft(field.getRows());
            else if(some.equals("D"))
                helper.moveRight(field.getRows());
            else
                System.out.println("Wrong input!");

        }

    }





}
