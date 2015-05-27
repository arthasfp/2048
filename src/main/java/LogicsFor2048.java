
public class LogicsFor2048 {
    public Row moveLeft(Row row) {
        for (int i = 0; i < row.getCell().size(); i++) {
            if (i + 1 < row.getCell().size()) {
                if (row.getCell().get(i) != new Cell(0) && row.getCell().get(i + 1) == new Cell(0)) {
                    row.getCell().get(i + 1).setValue(row.getCell().get(i).getValue());
                    row.getCell().get(i).setValue(0);
                } else if (row.getCell().get(i).equals(row.getCell().get(i + 1))) {
                    row.getCell().get(i + 1).setValue(row.getCell().get(i + 1).getValue() + row.getCell().get(i).getValue());
                    row.getCell().get(i).setValue(0);
                }
            }
        }
        return row;
    }

    public Row moveRight(Row row) {
        for (int i = row.getCell().size() - 1; i >= 0; i--) {
            if (i + 1 >= 0) {
                if (row.getCell().get(i) != new Cell(0) && row.getCell().get(i + 1) == new Cell(0)) {
                    row.getCell().get(i + 1).setValue(row.getCell().get(i).getValue());
                    row.getCell().get(i).setValue(0);
                } else if (row.getCell().get(i).equals(row.getCell().get(i + 1))) {
                    row.getCell().get(i + 1).setValue(row.getCell().get(i + 1).getValue() + row.getCell().get(i).getValue());
                    row.getCell().get(i).setValue(0);
                }
            }
        }
        return row;
    }

    public Column moveDown(Column column) {
        for (int i = 0; i < column.getCell().size(); i++) {
            if (i + 1 < column.getCell().size()) {
                if (column.getCell().get(i) != new Cell(0) && column.getCell().get(i + 1) == new Cell(0)) {
                    column.getCell().get(i + 1).setValue(column.getCell().get(i).getValue());
                    column.getCell().get(i).setValue(0);
                } else if (column.getCell().get(i).equals(column.getCell().get(i + 1))) {
                    column.getCell().get(i + 1).setValue(column.getCell().get(i + 1).getValue() + column.getCell().get(i).getValue());
                    column.getCell().get(i).setValue(0);
                }
            }
        }
        return column;
    }

    public Column moveUp(Column column) {
        for (int i = column.getCell().size() - 1; i >= 0; i--) {
            if (i + 1 >= 0) {
                if (column.getCell().get(i) != new Cell(0) && column.getCell().get(i + 1) == new Cell(0)) {
                    column.getCell().get(i + 1).setValue(column.getCell().get(i).getValue());
                    column.getCell().get(i).setValue(0);
                } else if (column.getCell().get(i).equals(column.getCell().get(i + 1))) {
                    column.getCell().get(i + 1).setValue(column.getCell().get(i + 1).getValue() + column.getCell().get(i).getValue());
                    column.getCell().get(i).setValue(0);
                }
            }
        }
        return column;
    }

    public boolean isEmpty(Cell cell) {
        if (cell.getValue() == 0)
            return true;
        return false;
    }

    public int getPositionInRow(Row row) {
        int temp = 0;
        boolean a = true;
        while (a) {
            temp = (int) Math.random() * 10;
            if (row.getCell().size() > temp)
               a = false;
        }
        return temp;
    }

    public int getPositionInColumn(Column column) {
        int temp = 0;
        boolean a = true;
        while (a) {
            temp = (int) Math.random() * 10;
            if (column.getCell().size() > temp)
                a = false;
        }
        return temp;
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
            return isEmpty(rows[i].getCell().get(i));
        }
        return false;
    }

    public boolean realGameOver(Column[] columns) {
        for (int i = 0; i < columns.length; i++) {
            return isEmpty(columns[i].getCell().get(i));
        }
        return false;
    }

}


//if (value == 0 || value == 2 || value % 4 == 0)
//        this.value = value;
//        else
//        throw new IllegalArgumentException();

