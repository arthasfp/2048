import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class HelperTest {

    @Test
    public void test_move_up_column_with_positive_values() throws Exception {
        Column column = new Column(0, 2, 2, 4);
        Column result = moveUp(column);
        Column expected = new Column(8, 0, 0, 0);
        assertEquals(expected, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_move_up_column_with_negative_value_in_column() throws Exception {
        Column column = new Column(0, 2, -2, 4);
        Column result = moveUp(column);
    }

    @Test
    public void test_move_up_column_with_no_values() throws Exception {
        Column column = new Column(0, 0, 0, 0);
        Column result = moveUp(column);
        Column expected = new Column(0, 0, 0, 0);
        assertEquals(expected, result);
    }

    @Test
    public void test_move_down_column_with_positive_values() throws Exception {
        Column column = new Column(0, 2, 2, 4);
        Column result = moveDown(column);
        Column expected = new Column(0, 0, 0, 8);
        assertEquals(expected, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_move_down_column_with_negative_value_in_column() throws Exception {
        Column column = new Column(0, 2, -2, 4);
        Column result = moveDown(column);
    }

    @Test
    public void test_move_down_column_with_no_values() throws Exception {
        Column column = new Column(0, 0, 0, 0);
        Column result = moveDown(column);
        Column expected = new Column(0, 0, 0, 0);
        assertEquals(expected, result);
    }

    @Test
    public void test_move_left_row_with_positive_values() throws Exception {
        Row row = new Row(0, 2, 2, 4);
        Row result = moveLeft(row);
        Row expected = new Row(8, 0, 0, 0);
        assertEquals(expected, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_move_left_row_with_negative_value() throws Exception {
        Row row = new Row(0, 2, -2, 4);
        Row result = moveLeft(row);
    }

    @Test
    public void test_move_left_row_with_no_values() throws Exception {
        Row row = new Row(0, 0, 0, 0);
        Row result = moveLeft(row);
        Row expected = new Row(0, 0, 0, 0);
        assertEquals(expected, result);
    }

    @Test
    public void test_move_right_row_with_positive_values() throws Exception {
        Row row = new Row(0, 2, 2, 4);
        Row result = moveRight(row);
        Row expected = new Row(0, 0, 0, 8);
        assertEquals(expected, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_move_right_row_with_negative_value() throws Exception {
        Row row = new Row(0, 2, -2, 4);
        Row result = moveRight(row);
    }

    @Test
    public void test_move_right_row_with_no_values() throws Exception {
        Row row = new Row(0, 0, 0, 0);
        Row result = moveRight(row);
        Row expected = new Row(0, 0, 0, 0);
        assertEquals(expected, result);
    }

    @Test
    public void test_isEmpty_method_for_not_empty_row() throws Exception {
        Row row = new Row(0, 6, 0, 0);
        Row result = isEmpty(row);
        assertFalse(result);
    }

    @Test
    public void test_isEmpty_method_for_empty_row() throws Exception {
        Row row = new Row(0, 0, 0, 0);
        Row result = isEmpty(row);
        assertTrue(result);
    }
}
