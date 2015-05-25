import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;


public class RowTest {

    @Test
    public void testMoveUp_with_two_possitive_arrays_of_cells() throws Exception {
        Row result = Row.moveUp(new Row(2, 0, 8), new Row(2, 4, 16));
        Row expected = new Row(4, 4, 8);
        assertEquals(expected, result);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testMoveUp_with_two_arrays_of_cells_with_different_size() throws Exception {
        Row result = Row.moveUp(new Row(2, 0, 8), new Row(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMoveUp_with_two_arrays_of_cells_with_one_negative_value() throws Exception {
        Row result = Row.moveUp(new Row(2, 0, 8), new Row(-2, 4, 16));
    }

    @Test
    public void testMoveDown_with_two_possitive_arrays_of_cells() throws Exception {
        Row result = Row.moveDown(new Row(2, 0, 8), new Row(2, 4, 16));
        Row expected = new Row(4, 4, 16);
        assertEquals(expected, result);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testMoveDown_with_two_arrays_of_cells_with_different_size() throws Exception {
        Row result = Row.moveDown(new Row(2, 0, 8), new Row(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMoveDown_with_two_arrays_of_cells_with_one_negative_value() throws Exception {
        Row result = Row.moveDown(new Row(2, 0, 8), new Row(-2, 4, 16));
    }

}