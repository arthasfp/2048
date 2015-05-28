import java.util.Arrays;

/**
 * Created by Sergii on 27.05.2015.
 */
public class Field {
    Row[] rows;
    Column[] columns;

    public Field(int sizeOfField) {
        Cell[][] cells = new Cell[sizeOfField][sizeOfField];

        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells.length; j++) {
                cells[i][j] = new Cell(0);
                rows[i].setCells(cells[i]);
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
        return "Field{" +
                "rows=" + Arrays.toString(rows) +
                ", columns=" + Arrays.toString(columns) +
                '}';
    }
}
