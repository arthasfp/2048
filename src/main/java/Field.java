import java.util.Arrays;
import java.util.Collections;

public class Field {
    private Cell[][] cells;
    private Row[] rows;
    private Column[] columns;

    public Cell[][] setField(int sizeOfField) {
        return cells = new Cell[sizeOfField][sizeOfField];
    }

    public int getPositionInRow(Cell[][] cell) {
        int temp = (int) Math.random() * 10;
        if (cell.length < temp)
            System.out.println("Try again!");
        return temp;
    }

    public int getPositionInColumn(Cell[][] cell) {
        int temp = (int) Math.random() * 10;
        for (int i = 0; i < cell.length; i++) {
            if (cell.length < temp)
                System.out.println("Try again!");
        }
        return temp;
    }

    public Cell[][] addTwoInRandomCell(Cell[][] cell) {
        if (Cell.isEmpty(cell[getPositionInRow(cell)][getPositionInColumn(cell)]))
            cell[getPositionInRow(cell)][getPositionInColumn(cell)] = new Cell(2);
        return cell;
    }

    public Cell[][] moveAllRowsUp(Row[] rows) {
        for (int i = 0; i < rows.length; i++) {
            if (i + 1 < rows.length)
                Row.moveUp(rows[i], rows[i + 1]);
        }
        return null;
    }

    public Cell[][] moveAllRowsDown(Row[] rows) {
        for (int i = 0; i < rows.length; i++) {
            if (i + 1 < rows.length)
                Row.moveDown(rows[i], rows[i + 1]);
        }
        return null;
    }

    public Cell[][] moveAllColumnsLeft(Column[] columns) {
        for (int i = 0; i < columns.length; i++) {
            if (i + 1 < columns.length)
                Column.moveLeft(columns[i], columns[i + 1]);
        }
        return null;
    }

    public Cell[][] moveAllColumnsRight(Column[] columns) {
        for (int i = 0; i < columns.length; i++) {
            if (i + 1 < columns.length)
                Column.moveRight(columns[i], columns[i + 1]);
        }
        return null;
    }

    public boolean gameOverWithWinner(Row[] rows) {
        for (int i = 0; i < rows.length; i++) {
            return rows[i].getCell().get(i).equals(new Cell(2048));
        }
        return false;
    }

    public boolean gameOverWithWinner(Column[] columns) {
        for (int i = 0; i < columns.length; i++) {
            return columns[i].getCell().get(i).equals(new Cell(2048));
        }
        return false;
    }

    public boolean realGameOver(Row[] rows) {
        for (int i = 0; i < rows.length; i++) {
            return Cell.isEmpty(rows[i].getCell().get(i));
        }
        return false;
    }

    public boolean realGameOver(Column[] columns) {
        for (int i = 0; i < columns.length; i++) {
            return Cell.isEmpty(columns[i].getCell().get(i));
        }
        return false;
    }

    public Cell[][] getCells() {
        return cells;
    }

    public void setCells(Cell[][] cells) {
        this.cells = cells;
    }

    public Row[] getRows(Cell[][] cells) {
        Row[] rows = new Row[cells.length];
        for (int i = 0; i < cells.length; i++) {
            rows[i] = new Row();
            for (int j = 0; j < cells.length; j++) {
                rows[i].getCell().add(cells[i][j]);
            }
        }
        return rows;
    }

    public void setRows(Row[] rows) {
        this.rows = rows;
    }

    public Column[] getColumns(Cell[][] cells) {
        Column[] columns = new Column[cells.length];
        for (int i = 0; i < cells.length; i++) {
            columns[i] = new Column();
            for (int j = 0; j < cells.length; j++) {
                columns[i].getCell().add(cells[i][j]);
            }
        }
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

        if (!Arrays.deepEquals(cells, field.cells)) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(rows, field.rows)) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(columns, field.columns);

    }

    @Override
    public int hashCode() {
        int result = cells != null ? Arrays.deepHashCode(cells) : 0;
        result = 31 * result + (rows != null ? Arrays.hashCode(rows) : 0);
        result = 31 * result + (columns != null ? Arrays.hashCode(columns) : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Field{" +
                "cells=" + Arrays.toString(cells) +
                ", rows=" + Arrays.toString(rows) +
                ", columns=" + Arrays.toString(columns) +
                '}';
    }
}
