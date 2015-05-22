import java.util.Arrays;

public class Row {
    private Cell[] cell;
    private int size;

    public Row(Cell[] cell, int size) {
        this.cell = cell;
        this.size = size;
    }

    public static Row moveUp(Row rowFirst, Row rowSecond) {
        for (int i = rowFirst.cell.length - 1; i >= 0; i--) {
            Cell.add(rowSecond.cell[i], rowFirst.cell[i]);
        }
        return rowFirst;
    }

    public Row moveDown(Row rowFirst, Row rowSecond) {
        for (int i = rowFirst.cell.length - 1; i >= 0; i--) {
            Cell.add(rowFirst.cell[i], rowSecond.cell[i]);
        }
        return rowSecond;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Row row = (Row) o;
        if (size != row.size) return false;
        return Arrays.equals(cell, row.cell);
    }

    @Override
    public int hashCode() {
        int result = cell != null ? Arrays.hashCode(cell) : 0;
        result = 31 * result + size;
        return result;
    }

    @Override
    public String toString() {
        return "Row{" +
                "cell=" + Arrays.toString(cell) +
                ", size=" + size +
                '}';
    }
}
