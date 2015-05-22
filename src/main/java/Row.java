import java.util.Arrays;

public class Row {
    private Cell[] cell;
    private int size;

    public Row(Cell[] cell, int size) {
        this.cell = cell;
        this.size = size;
    }

    public Row moveUp(Row rowFirst, Row rowSecond) {
        for (int i = size; i > 0 ; i--) {
            Cell.add(rowFirst.cell[i], rowSecond.cell[i]);
        }
        return rowSecond;
    }

    public Row moveDown(Field field) {
        Row result = null;
        return result;
    }

    public Cell[] getCell() {
        return cell;
    }

    public void setCell(Cell[] cell) {
        this.cell = cell;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


}
