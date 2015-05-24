import java.util.ArrayList;

public class Row {
    private ArrayList<Cell> cell;
    private int size;

    public Row(int...value)
    {
        for (int i : value) {
          cell.add(new Cell(i));
       }
    }

    public static Row moveUp(Row rowFirst, Row rowSecond) {
        for (int i = rowFirst.cell.size() - 1; i >= 0; i--) {
            Cell.add(rowSecond.cell.get(i), rowFirst.cell.get(i));
        }
        return rowFirst;
    }

    public static Row moveDown(Row rowFirst, Row rowSecond) {
        for (int i = rowFirst.cell.size() - 1; i >= 0; i--) {
            Cell.add(rowFirst.cell.get(i), rowSecond.cell.get(i));
        }
        return rowSecond;
    }

    public ArrayList <Cell> getCell() {
        return cell;
    }

    public void setCell(ArrayList <Cell> cell) {
        this.cell = cell;
    }

    public static int getSize(Row row) {
        return row.cell.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Row row = (Row) o;

        if (size != row.size) return false;
        return !(cell != null ? !cell.equals(row.cell) : row.cell != null);

    }

    @Override
    public int hashCode() {
        int result = cell != null ? cell.hashCode() : 0;
        result = 31 * result + size;
        return result;
    }

    @Override
    public String toString() {
        return "Row{" +
                "cell=" + cell +
                ", size=" + size +
                '}';
    }
}
