import java.util.ArrayList;


public class Column {
    private ArrayList <Cell> cell = new ArrayList<Cell>();

    public Column(int ... value) {
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

        Column column = (Column) o;

        return !(cell != null ? !cell.equals(column.cell) : column.cell != null);

    }

    @Override
    public int hashCode() {
        return cell != null ? cell.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Column{" +
                "cell=" + cell +
                '}';
    }
}



