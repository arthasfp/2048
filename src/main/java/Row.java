import java.util.ArrayList;

public class Row {
    private ArrayList<Cell> cell = new ArrayList<Cell>();


    public Row(int...value)
    {
        for (int i : value) {
          cell.add(new Cell(i));

       }
    }

    public ArrayList <Cell> getCell() {
        return cell;
    }

    public void setCell(ArrayList <Cell> cell) {
        this.cell = cell;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Row row = (Row) o;

        return !(cell != null ? !cell.equals(row.cell) : row.cell != null);

    }

    @Override
    public int hashCode() {
        return cell != null ? cell.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Row{" +
                "cell=" + cell +
                '}';
    }
}
