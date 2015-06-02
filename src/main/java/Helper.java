public class Helper {

    public Column[] moveUp(Column[] columns) {
        Cell[] cell;
        for (int i = 0; i < columns.length; i++) {
            cell = columns[i].getCells();
            checkFromBeginningToUpOrRight(cell);
            ckeckFromEndToUpOrRight(cell);
            columns[i].setCells(cell);
        }
        return columns;
    }

    private void ckeckFromEndToUpOrRight(Cell[] cell) {
        for (int m = 0; m < cell.length; m++) {
            for (int j = cell.length - 1; j >= 0; j--) {
                if (j - 1 >= 0) {
                    if (cell[j].getValue() == cell[j - 1].getValue()) {
                        cell[j - 1].setValue(cell[j].getValue() + cell[j - 1].getValue());
                        cell[j].setValue(0);
                    }
                    if (cell[j].getValue() != 0 && cell[j - 1].getValue() == 0) {
                        int temp = cell[j].getValue();
                        cell[j].setValue(cell[j - 1].getValue());
                        cell[j - 1].setValue(temp);
                    }
                }
            }
        }
    }

    private void checkFromBeginningToUpOrRight(Cell[] cell) {
        for (int l = 0; l < cell.length; l++) {
            for (int k = 0; k < cell.length; k++) {
                if (k + 1 < cell.length) {
                    if (cell[k].getValue() == cell[k + 1].getValue()) {
                        cell[k].setValue(cell[k].getValue() + cell[k + 1].getValue());
                        cell[k + 1].setValue(0);
                    }
                }
            }
        }
    }

    public Column[] moveDown(Column[] columns) {
        Cell[] cell;
        for (int i = 0; i < columns.length; i++) {
            cell = columns[i].getCells();
            ckeckFromEndToDownOrLeft(cell);
            ckeckFromBeginningToDownOrLeft(cell);
            columns[i].setCells(cell);
        }

        return columns;
    }

    private void ckeckFromBeginningToDownOrLeft(Cell[] cell) {
        for (int l = 0; l < cell.length; l++) {
            for (int k = 0; k < cell.length; k++) {
                if (k + 1 < cell.length) {
                    if (cell[k].getValue() == cell[k + 1].getValue()) {
                        cell[k].setValue(cell[k].getValue() + cell[k + 1].getValue());
                        cell[k + 1].setValue(0);
                    }
                    if (cell[k].getValue() != 0 && cell[k + 1].getValue() == 0) {
                        int temp = cell[k].getValue();
                        cell[k].setValue(cell[k + 1].getValue());
                        cell[k + 1].setValue(temp);
                    }
                }
            }
        }
    }

    private void ckeckFromEndToDownOrLeft(Cell[] cell) {
        for (int m = 0; m < cell.length; m++) {
            for (int j = cell.length - 1; j >= 0; j--) {
                if (j - 1 >= 0) {
                    if (cell[j].getValue() == cell[j - 1].getValue()) {
                        cell[j - 1].setValue(cell[j].getValue() + cell[j - 1].getValue());
                        cell[j].setValue(0);
                    }
                }
            }
        }
    }

    public Row[] moveRight(Row[] rows) {
        Cell[] cell;
        for (int i = 0; i < rows.length; i++) {
            cell = rows[i].getCells();
            checkFromBeginningToUpOrRight(cell);
            ckeckFromEndToUpOrRight(cell);
            rows[i].setCells(cell);
        }
        return rows;
    }

    public Row[] moveLeft(Row[] rows) {
        Cell[] cell;
        for (int i = 0; i < rows.length; i++) {
            cell = rows[i].getCells();
            ckeckFromEndToDownOrLeft(cell);
            ckeckFromBeginningToDownOrLeft(cell);
            rows[i].setCells(cell);
        }
        return rows;
    }

    public boolean isFieldEmpty(Row[] rows) {
        for (int i = 0; i < rows.length; i++) {
            Cell[] cells = rows[i].getCells();
            for (int j = 0; j < cells.length; j++) {
                if (cells[j].getValue() != 0)
                    return false;
            }
        }
        return true;
    }

    public Row[] putTwoInRandomPosition(Row[] rows) {
//        int randomCell = 0;
//        while (randomCell < rows.length) {
//            randomCell = (int) Math.random() * 10;
//        }
//        for (int i = 0; i < rows.length; i++) {
//            Cell[] cells = rows[i].getCells();
//            if (i == randomCell)
//                cells[i].setValue(randomCell);
//        }
        return rows;
    }
}
