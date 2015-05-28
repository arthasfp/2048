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
            }
        }
    }
}
