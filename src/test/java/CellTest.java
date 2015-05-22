import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CellTest {

    @Test
    public void testAdd_with_two_equals_positive_values() throws Exception {
        Cell result = Cell.add(new Cell(4), new Cell(4));
        Cell expected = new Cell(8);
        assertEquals(expected, result);
    }

    @Test
    public void testAdd_with_two_not_equals_positive_values() throws Exception {
        Cell result = Cell.add(new Cell(4), new Cell(8));
        Cell expected = new Cell(8);
        assertEquals(expected, result);
    }

    @Test
    public void testAdd_with_first_empty_value() throws Exception {
        Cell result = Cell.add(new Cell(0), new Cell(8));
        Cell expected = new Cell(8);
        assertEquals(expected, result);
    }

    @Test
    public void testAdd_with_second_empty_value() throws Exception {
        Cell result = Cell.add(new Cell(4), new Cell(0));
        Cell expected = new Cell(4);
        assertEquals(expected, result);
    }

    @Test
    public void testAdd_with_negative_value() throws Exception {
        Cell result = Cell.add(new Cell(-4), new Cell(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAdd_with_value_not_divided_by_two() throws Exception {
        Cell result = Cell.add(new Cell(5), new Cell(0));
    }

    @Test
    public void testIsEmpty_cell_with_some_value_inside() throws Exception{
          assertFalse(Cell.isEmpty(new Cell(4)));
    }

    @Test
    public void testIsEmpty_cell_with_no_value_inside() throws Exception{
          assertTrue(Cell.isEmpty(new Cell(0)));
    }
}