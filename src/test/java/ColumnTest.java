import org.junit.Test;

import static org.junit.Assert.*;


public class ColumnTest {

    @Test
    public void testMoveLeft_with_two_possitive_arrays_of_cells() throws Exception {
        Column result = Column.moveLeft(new Column(2,0,8), new Column(2, 4,16));
        Column expected = new Column(4,4,8);
        assertEquals(expected, result);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testMoveLeft_with_two_arrays_of_cells_with_different_size() throws Exception {
        Column result = Column.moveLeft(new Column(2,0,8), new Column(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMoveLeft_with_two_arrays_of_cells_with_one_negative_value() throws Exception {
        Column result = Column.moveLeft(new Column(2,0,8), new Column(-2, 4,16));
    }

    @Test
    public void testMoveRight_with_two_possitive_arrays_of_cells() throws Exception {
        Column result = Column.moveRight(new Column(2, 0,8), new Column(2,4, 16));
        Column expected = new Column(4,4,16);
        assertEquals(expected, result);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testMoveRight_with_two_arrays_of_cells_with_different_size() throws Exception {
        Column result = Column.moveRight(new Column(2,0,8), new Column(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMoveRight_with_two_arrays_of_cells_with_one_negative_value() throws Exception {
        Column result = Column.moveRight(new Column(2, 0, 8), new Column(-2, 4, 16));
    }

    @Test
    public void testGetSize_with_few_values_in_array_of_cells() throws Exception{
        int result = Column.getSize(new Column(2, 0, 8));
        assertEquals(3, result);
    }

    @Test
    public void testGetSize_with_empty_array_of_cells() throws Exception{
        int result = Column.getSize(new Column());
        assertEquals(0, result);
    }
}





