import java.util.ArrayList;


public class Column {
    private ArrayList <Cell> cell = new ArrayList<Cell>();
    private int size;

    public Column(int ... value) {
        for (int i : value) {
            cell.add(new Cell(i));
        }
    }

    public static Column moveLeft(Column colFirst, Column colSecond) {
        for (int i = colFirst.cell.size() - 1; i >= 0; i--) {
            Cell.add(colSecond.cell.get(i), colFirst.cell.get(i));
        }
        return colFirst;
    }

    public static Column moveRight(Column colFirst, Column colSecond) {
        for (int i = colFirst.cell.size() - 1; i >= 0; i--) {
            Cell.add(colFirst.cell.get(i), colSecond.cell.get(i));
        }
        return colSecond;
    }

    public static int getSize(Column column) {
        return column.cell.size();
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

        if (size != column.size) return false;
        return !(cell != null ? !cell.equals(column.cell) : column.cell != null);

    }

    @Override
    public int hashCode() {
        int result = cell != null ? cell.hashCode() : 0;
        result = 31 * result + size;
        return result;
    }

    @Override
    public String toString() {
        return "Column{" +
                "cell=" + cell +
                ", size=" + size +
                '}';
    }
}



