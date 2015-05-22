public class Field {
    private Cell[][] cells;

    public Cell[][] setField(int sizeOfField){
        return cells = new Cell[sizeOfField][sizeOfField];
   }

    public int getPositionInRow(Cell[][] cell){
        int temp = (int) Math.random()*10;
        if (cell.length < temp)
            System.out.println("Try again!");
       return temp;
    }

    public int getPositionInColumn(Cell[][] cell){
        int temp = (int) Math.random()*10;
        for (int i = 0; i <cell.length ; i++) {
            if (cell.length < temp)
                System.out.println("Try again!");
        }
        return temp;
    }

    public Cell[][] addTwoInRandomCell(Cell[][] cell){
        if(Cell.isEmpty(cell[getPositionInRow(cell)][getPositionInColumn(cell)]))
        cell[getPositionInRow(cell)][getPositionInColumn(cell)] = new Cell(2);
        return cell;
    }

    public Cell[][] moveAllRowsUp(Cell[][] cell){return null;}
    public Cell[][] moveAllRowsDown(Cell[][] cell){return null;}
    public Cell[][] moveAllColumnsLeft(Cell[][] cell){return null;}
    public Cell[][] moveAllColumnsRight(Cell[][] cell){return null;}


}
