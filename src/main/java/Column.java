import java.util.Arrays;

public class Column {
    private Cell[] cell;
    private int size;

    public Column(Cell[] cell) {
        this.cell = cell;
    }

    public static Column moveLeft(Column colFirst, Column colSecond) {
        for (int i = colFirst.cell.length - 1; i >= 0; i--) {
            Cell.add(colSecond.cell[i], colFirst.cell[i]);
        }
        return colFirst;
    }

    public static Column moveRight(Column colFirst, Column colSecond) {
        for (int i = colFirst.cell.length - 1; i >= 0; i--) {
            Cell.add(colFirst.cell[i], colSecond.cell[i]);
        }
        return colSecond;
    }

    public static int getSize(Column column) {
        return column.cell.length;
    }

    public Cell[] getCell() {
        return cell;
    }

    public void setCell(Cell[] cell) {
        this.cell = cell;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Column column = (Column) o;
        if (size != column.size) return false;
        return Arrays.equals(cell, column.cell);
    }

    @Override
    public int hashCode() {
        int result = cell != null ? Arrays.hashCode(cell) : 0;
        result = 31 * result + size;
        return result;
    }

    @Override
    public String toString() {
        return "Column{" +
                "cell=" + Arrays.toString(cell) +
                ", size=" + size +
                '}';
    }
}



