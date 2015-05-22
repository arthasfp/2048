public class Row {
    private Cell cell;
    private int size;

    public Row(Cell cell, int size){
        this.cell = cell;
        this.size = size;
    }

    public Cell getCell() {
        return cell;
    }

    public void setCell(Cell cell) {
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
