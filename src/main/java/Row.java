import java.util.Arrays;

public class Row {
    private Cell[] cells;

    public Row(int... values) {
        cells = new Cell[values.length];
        int temp = 0;
        while (temp < cells.length) {
            for (int value : values) {
                if (value < 0)
                    throw new IllegalArgumentException();
                cells[temp++] = new Cell(value);
            }
        }
    }

    public Cell[] getCells() {
        return cells;
    }

    public void setCells(Cell[] cells) {
        this.cells = cells;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Row row = (Row) o;

        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(cells, row.cells);

    }

    @Override
    public int hashCode() {
        return cells != null ? Arrays.hashCode(cells) : 0;
    }

    @Override
    public String toString() {
        return "Row{" +
                "cells=" + Arrays.toString(cells) +
                '}';
    }
}

