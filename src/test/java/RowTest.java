import org.junit.Test;

import static org.junit.Assert.*;


public class RowTest {

    @Test
    public void testMoveUp_with_two_possitive_values() throws Exception {
        Row result = Row.moveUp(new Row(new Cell[]{new Cell(2), new Cell(0), new Cell(8)}, 3), new Row(new Cell[]{new Cell(2), new Cell(4), new Cell(16)}, 3));
        Row expected = new Row(new Cell[]{new Cell(4), new Cell(4), new Cell(8)}, 3);
        assertEquals(expected, result);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testMoveUp_with_two_arrays_of_cells_with_different_size() throws Exception {
        Row result = Row.moveUp(new Row(new Cell[]{new Cell(2), new Cell(0), new Cell(8)}, 3), new Row(new Cell[]{new Cell(2)}, 3));
    }

    @Test
    public void testMoveDown() throws Exception {

    }
}