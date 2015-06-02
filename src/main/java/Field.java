import java.util.Arrays;

public class Field {
    private Row[] rows;
    private Column[] columns;

    public Field(int sizeOfField) {
        Cell[][] cells = new Cell[sizeOfField][sizeOfField];
        rows = new Row[sizeOfField];
        columns = new Column[sizeOfField];
        for (int i = 0; i < sizeOfField; i++) {
            for (int j = 0; j < sizeOfField; j++) {
                cells[i][j] = new Cell(0);
            }
        }
        for (int i = 0; i < sizeOfField; i++) {
            for (int j = 0; j < sizeOfField; j++) {
                rows[i] = new Row();
                rows[i].setCells(cells[i]);

            }
        }
        for (int i = 0; i < sizeOfField; i++) {
            for (int j = 0; j < sizeOfField; j++) {
                columns[i] = new Column();
                columns[i].setCells(cells[j]);
            }
        }
    }

    public Row[] getRows() {
        return rows;
    }

    public void setRows(Row[] rows) {
        this.rows = rows;
    }

    public Column[] getColumns() {
        return columns;
    }

    public void setColumns(Column[] columns) {
        this.columns = columns;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Field field = (Field) o;

        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(rows, field.rows)) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(columns, field.columns);

    }

    @Override
    public int hashCode() {
        int result = rows != null ? Arrays.hashCode(rows) : 0;
        result = 31 * result + (columns != null ? Arrays.hashCode(columns) : 0);
        return result;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < rows.length; i++) {
            result += "\n";
            for (int j = 0; j < rows.length; j++) {
                Cell[] cells = rows[i].getCells();
                result += " " + cells[i].getValue();
            }
        }
        return result;
    }
}

