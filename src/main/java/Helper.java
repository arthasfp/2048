
public class Helper {

    public Column[] moveUp(Column[] columns) {
        Cell[] cell = new Cell[0];
        for (int i = 0; i < columns.length; i++) {
            cell = columns[i].getCells();
            for (int l = 0; l < cell.length; l++) {
                for (int k = 0; k < cell.length; k++) {
                    if (k + 1 < cell.length) {
                        if (cell[k].getValue() == cell[k + 1].getValue()) {
                            cell[k].setValue(cell[k].getValue() + cell[k + 1].getValue());
                            cell[k + 1].setValue(0);
                        }
                    }
                }
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
            columns[i].setCells(cell);
        }

        return columns;
    }

    public static void main(String[] args) {
        System.out.println(new Helper().moveUp(new Column[]{new Column(4, 2, 2, 2), new Column(2, 2, 2, 2), new Column(0, 0, 0, 0), new Column(2, 2, 4, 16)}));
    }
}
