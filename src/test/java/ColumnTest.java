import org.junit.Test;

import static org.junit.Assert.*;


public class ColumnTest {

    @Test
    public void testMoveLeft_with_two_possitive_arrays_of_cells() throws Exception {
        Column result = Column.moveLeft(new Column(new Cell[]{new Cell(2), new Cell(0), new Cell(8)}), new Column(new Cell[]{new Cell(2), new Cell(4), new Cell(16)}));
        Column expected = new Column(new Cell[]{new Cell(4), new Cell(4), new Cell(8)});
        assertEquals(expected, result);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testMoveLeft_with_two_arrays_of_cells_with_different_size() throws Exception {
        Column result = Column.moveLeft(new Column(new Cell[]{new Cell(2), new Cell(0), new Cell(8)}), new Column(new Cell[]{new Cell(2)}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMoveLeft_with_two_arrays_of_cells_with_one_negative_value() throws Exception {
        Column result = Column.moveLeft(new Column(new Cell[]{new Cell(2), new Cell(0), new Cell(8)}), new Column(new Cell[]{new Cell(-2), new Cell(4), new Cell(16)}));
    }

    @Test
    public void testMoveRight_with_two_possitive_arrays_of_cells() throws Exception {
        Column result = Column.moveRight(new Column(new Cell[]{new Cell(2), new Cell(0), new Cell(8)}), new Column(new Cell[]{new Cell(2), new Cell(4), new Cell(16)}));
        Column expected = new Column(new Cell[]{new Cell(4), new Cell(4), new Cell(16)});
        assertEquals(expected, result);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testMoveRight_with_two_arrays_of_cells_with_different_size() throws Exception {
        Column result = Column.moveRight(new Column(new Cell[]{new Cell(2), new Cell(0), new Cell(8)}), new Column(new Cell[]{new Cell(2)}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMoveRight_with_two_arrays_of_cells_with_one_negative_value() throws Exception {
        Column result = Column.moveRight(new Column(new Cell[]{new Cell(2), new Cell(0), new Cell(8)}), new Column(new Cell[]{new Cell(-2), new Cell(4), new Cell(16)}));
    }

    @Test
    public void testGetSize_with_few_values_in_array_of_cells() throws Exception{
        int result = Column.getSize(new Column(new Cell[]{new Cell(2), new Cell(0), new Cell(8)}));
        assertEquals(3, result);
    }

    @Test
    public void testGetSize_with_empty_array_of_cells() throws Exception{
        int result = Column.getSize(new Column(new Cell[]{}));
        assertEquals(0, result);
    }
}





