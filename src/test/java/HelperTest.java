import org.junit.Test;

import static org.junit.Assert.*;

public class HelperTest {

    @Test
    public void test_move_up_columns_in_empty_array_of_columns() throws Exception {
        Helper helper = new Helper();
        Column[] result = helper.moveUp(new Column[]{new Column(0, 0, 0), new Column(0, 0, 0), new Column(0, 0, 0)});
        Column[] expected = new Column[]{new Column(0, 0, 0), new Column(0, 0, 0), new Column(0, 0, 0)};
        assertArrayEquals(expected, result);
    }

    @Test
    public void test_move_up_columns_in_array_of_columns_with_one_value_in_first_cell() throws Exception {
        Helper helper = new Helper();
        Column[] result = helper.moveUp(new Column[]{new Column(2, 0, 0), new Column(0, 0, 0), new Column(0, 0, 0)});
        Column[] expected = new Column[]{new Column(2, 0, 0), new Column(0, 0, 0), new Column(0, 0, 0)};
        assertArrayEquals(expected, result);
    }

    @Test
    public void test_move_up_columns_in_array_of_columns_with_one_value_in_last_cell() throws Exception {
        Helper helper = new Helper();
        Column[] result = helper.moveUp(new Column[]{new Column(0, 0, 2), new Column(0, 0, 2), new Column(0, 0, 2)});
        Column[] expected = new Column[]{new Column(2, 0, 0), new Column(2, 0, 0), new Column(2, 0, 0)};
        assertArrayEquals(expected, result);
    }

    @Test
    public void test_move_up_columns_in_array_of_columns_with_two_different_values() throws Exception {
        Helper helper = new Helper();
        Column[] result = helper.moveUp(new Column[]{new Column(4, 0, 2), new Column(4, 0, 2), new Column(4, 0, 2)});
        Column[] expected = new Column[]{new Column(4, 2, 0), new Column(4, 2, 0), new Column(4, 2, 0)};
        assertArrayEquals(expected, result);
    }

    @Test
    public void test_move_up_columns_in_array_of_columns_with_two_different_values_in_other_positions() throws Exception {
        Helper helper = new Helper();
        Column[] result = helper.moveUp(new Column[]{new Column(2, 0, 4), new Column(2, 0, 4), new Column(2, 0, 4)});
        Column[] expected = new Column[]{new Column(2, 4, 0), new Column(2, 4, 0), new Column(2, 4, 0)};
        assertArrayEquals(expected, result);
    }

    @Test
    public void test_move_up_columns_in_array_of_columns_with_two_equal_values() throws Exception {
        Helper helper = new Helper();
        Column[] result = helper.moveUp(new Column[]{new Column(0, 2, 2), new Column(2, 2, 0), new Column(0, 0, 0)});
        Column[] expected = new Column[]{new Column(4, 0, 0), new Column(4, 0, 0), new Column(0, 0, 0)};
        assertArrayEquals(expected, result);
    }

    @Test
    public void test_move_up_columns_in_array_of_columns_with_three_values() throws Exception {
        Helper helper = new Helper();
        Column[] result = helper.moveUp(new Column[]{new Column(4, 2, 2), new Column(2, 2, 2), new Column(0, 0, 0)});
        Column[] expected = new Column[]{new Column(8, 0, 0), new Column(4, 2, 0), new Column(0, 0, 0)};
        assertArrayEquals(expected, result);
    }

    @Test
    public void test_move_up_columns_in_array_of_columns_with_four_values() throws Exception {
        Helper helper = new Helper();
        Column[] result = helper.moveUp(new Column[]{new Column(4, 2, 2, 2), new Column(2, 2, 2, 2), new Column(0, 0, 0, 0), new Column(2, 2, 4, 16)});
        Column[] expected = new Column[]{new Column(8, 2, 0, 0), new Column(8, 0, 0, 0), new Column(0, 0, 0, 0), new Column(8, 16, 0, 0)};
        assertArrayEquals(expected, result);
    }


    @Test(expected = IllegalArgumentException.class)
    public void test_move_up_column_with_negative_value_in_column() throws Exception {
        Helper helper = new Helper();
        Column[] result = helper.moveUp(new Column[]{new Column(4, -2, 2), new Column(2, 2, 2), new Column(0, 0, 0)});
    }

    @Test
    public void test_move_down_columns_in_empty_array_of_columns() throws Exception {
        Helper helper = new Helper();
        Column[] result = helper.moveDown(new Column[]{new Column(0, 0, 0), new Column(0, 0, 0), new Column(0, 0, 0)});
        Column[] expected = new Column[]{new Column(0, 0, 0), new Column(0, 0, 0), new Column(0, 0, 0)};
        assertArrayEquals(expected, result);
    }

    @Test
    public void test_move_down_columns_in_array_of_columns_with_one_value_in_first_cell() throws Exception {
        Helper helper = new Helper();
        Column[] result = helper.moveDown(new Column[]{new Column(2, 0, 0), new Column(0, 0, 0), new Column(0, 0, 0)});
        Column[] expected = new Column[]{new Column(0, 0, 2), new Column(0, 0, 0), new Column(0, 0, 0)};
        assertArrayEquals(expected, result);
    }

    @Test
    public void test_move_down_columns_in_array_of_columns_with_one_value_in_last_cell() throws Exception {
        Helper helper = new Helper();
        Column[] result = helper.moveDown(new Column[]{new Column(0, 0, 2), new Column(0, 0, 2), new Column(0, 0, 2)});
        Column[] expected = new Column[]{new Column(0, 0, 2), new Column(0, 0, 2), new Column(0, 0, 2)};
        assertArrayEquals(expected, result);
    }

    @Test
    public void test_move_down_columns_in_array_of_columns_with_two_different_values() throws Exception {
        Helper helper = new Helper();
        Column[] result = helper.moveDown(new Column[]{new Column(4, 0, 2), new Column(4, 0, 2), new Column(4, 0, 2)});
        Column[] expected = new Column[]{new Column(0, 4, 2), new Column(0, 4, 2), new Column(0, 4, 2)};
        assertArrayEquals(expected, result);
    }

    @Test
    public void test_move_down_columns_in_array_of_columns_with_two_different_values_in_other_positions() throws Exception {
        Helper helper = new Helper();
        Column[] result = helper.moveDown(new Column[]{new Column(2, 0, 4), new Column(2, 0, 4), new Column(2, 0, 4)});
        Column[] expected = new Column[]{new Column(0, 2, 4), new Column(0, 2, 4), new Column(0, 2, 4)};
        assertArrayEquals(expected, result);
    }

    @Test
    public void test_move_down_columns_in_array_of_columns_with_two_equal_values() throws Exception {
        Helper helper = new Helper();
        Column[] result = helper.moveDown(new Column[]{new Column(0, 2, 2), new Column(2, 2, 0), new Column(0, 0, 0)});
        Column[] expected = new Column[]{new Column(0, 0, 4), new Column(0, 0, 4), new Column(0, 0, 0)};
        assertArrayEquals(expected, result);
    }

    @Test
    public void test_move_down_columns_in_array_of_columns_with_three_values() throws Exception {
        Helper helper = new Helper();
        Column[] result = helper.moveDown(new Column[]{new Column(4, 2, 2), new Column(2, 2, 2), new Column(0, 0, 0)});
        Column[] expected = new Column[]{new Column(0, 0, 8), new Column(0, 2, 4), new Column(0, 0, 0)};
        assertArrayEquals(expected, result);
    }

    @Test
    public void test_move_down_columns_in_array_of_columns_with_four_values() throws Exception {
        Helper helper = new Helper();
        Column[] result = helper.moveDown(new Column[]{new Column(2, 2, 2, 4), new Column(2, 2, 2, 2), new Column(0, 0, 0, 0), new Column(2, 2, 4, 16)});
        Column[] expected = new Column[]{new Column(0, 0, 2, 8), new Column(0, 0, 0, 8), new Column(0, 0, 0, 0), new Column(0, 0, 8, 16)};
        assertArrayEquals(expected, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_move_down_column_with_negative_value_in_column() throws Exception {
        Helper helper = new Helper();
        Column[] result = helper.moveDown(new Column[]{new Column(4, -2, 2), new Column(2, 2, 2), new Column(0, 0, 0)});
    }

    @Test
    public void test_move_left_rows_in_empty_array_of_rows() throws Exception {
        Helper helper = new Helper();
        Row[] result = helper.moveLeft(new Row[]{new Row(0, 0, 0), new Row(0, 0, 0), new Row(0, 0, 0)});
        Row[] expected = new Row[]{new Row(0, 0, 0), new Row(0, 0, 0), new Row(0, 0, 0)};
        assertArrayEquals(expected, result);
    }

    @Test
    public void test_move_left_rows_in_array_of_rows_with_one_value_in_first_cell() throws Exception {
        Helper helper = new Helper();
        Row[] result = helper.moveLeft(new Row[]{new Row(2, 0, 0), new Row(0, 0, 0), new Row(0, 0, 0)});
        Row[] expected = new Row[]{new Row(0, 0, 2), new Row(0, 0, 0), new Row(0, 0, 0)};
        assertArrayEquals(expected, result);
    }

    @Test
    public void test_move_left_rows_in_array_of_rows_with_one_value_in_last_cell() throws Exception {
        Helper helper = new Helper();
        Row[] result = helper.moveLeft(new Row[]{new Row(0, 0, 2), new Row(0, 0, 2), new Row(0, 0, 2)});
        Row[] expected = new Row[]{new Row(0, 0, 2), new Row(0, 0, 2), new Row(0, 0, 2)};
        assertArrayEquals(expected, result);
    }

    @Test
    public void test_move_left_rows_in_array_of_rows_with_two_different_values() throws Exception {
        Helper helper = new Helper();
        Row[] result = helper.moveLeft(new Row[]{new Row(4, 2, 0), new Row(4, 2, 0), new Row(4, 2, 0)});
        Row[] expected = new Row[]{new Row(0, 4, 2), new Row(0, 4, 2), new Row(0, 4, 2)};
        assertArrayEquals(expected, result);
    }

    @Test
    public void test_move_left_rows_in_array_of_rows_with_two_different_values_in_other_positions() throws Exception {
        Helper helper = new Helper();
        Row[] result = helper.moveLeft(new Row[]{new Row(2, 0, 4), new Row(2, 0, 4), new Row(2, 0, 4)});
        Row[] expected = new Row[]{new Row(0, 2, 4), new Row(0, 2, 4), new Row(0, 2, 4)};
        assertArrayEquals(expected, result);
    }

    @Test
    public void test_move_left_rows_in_array_of_rows_with_two_equal_values() throws Exception {
        Helper helper = new Helper();
        Row[] result = helper.moveLeft(new Row[]{new Row(0, 2, 2), new Row(2, 2, 0), new Row(0, 0, 0)});
        Row[] expected = new Row[]{new Row(0, 0, 4), new Row(0, 0, 4), new Row(0, 0, 0)};
        assertArrayEquals(expected, result);
    }

    @Test
    public void test_move_left_rows_in_array_of_rows_with_three_values() throws Exception {
        Helper helper = new Helper();
        Row[] result = helper.moveLeft(new Row[]{new Row(4, 2, 2), new Row(2, 2, 2), new Row(0, 0, 0)});
        Row[] expected = new Row[]{new Row(0, 0, 8), new Row(0, 2, 4), new Row(0, 0, 0)};
        assertArrayEquals(expected, result);
    }

    @Test
    public void test_move_left_rows_in_array_of_rows_with_four_values() throws Exception {
        Helper helper = new Helper();
        Row[] result = helper.moveLeft(new Row[]{new Row(2, 2, 2, 4), new Row(2, 2, 2, 2), new Row(0, 0, 0, 0), new Row(2, 2, 4, 16)});
        Row[] expected = new Row[]{new Row(0, 0, 2, 8), new Row(0, 0, 0, 8), new Row(0, 0, 0, 0), new Row(0, 0, 8, 16)};
        assertArrayEquals(expected, result);
    }


    @Test(expected = IllegalArgumentException.class)
    public void test_move_left_rows_with_negative_value_in_row() throws Exception {
        Helper helper = new Helper();
        Row[] result = helper.moveLeft(new Row[]{new Row(4, -2, 2), new Row(2, 2, 2), new Row(0, 0, 0)});
    }

    @Test
    public void test_move_right_rows_in_empty_array_of_rows() throws Exception {
        Helper helper = new Helper();
        Row[] result = helper.moveRight(new Row[]{new Row(0, 0, 0), new Row(0, 0, 0), new Row(0, 0, 0)});
        Row[] expected = new Row[]{new Row(0, 0, 0), new Row(0, 0, 0), new Row(0, 0, 0)};
        assertArrayEquals(expected, result);
    }

    @Test
    public void test_move_right_rows_in_array_of_rows_with_one_value_in_first_cell() throws Exception {
        Helper helper = new Helper();
        Row[] result = helper.moveRight(new Row[]{new Row(2, 0, 0), new Row(0, 0, 0), new Row(0, 0, 0)});
        Row[] expected = new Row[]{new Row(2, 0, 0), new Row(0, 0, 0), new Row(0, 0, 0)};
        assertArrayEquals(expected, result);
    }

    @Test
    public void test_move_right_rows_in_array_of_rows_with_one_value_in_last_cell() throws Exception {
        Helper helper = new Helper();
        Row[] result = helper.moveRight(new Row[]{new Row(0, 0, 2), new Row(0, 0, 2), new Row(0, 0, 2)});
        Row[] expected = new Row[]{new Row(2, 0, 0), new Row(2, 0, 0), new Row(2, 0, 0)};
        assertArrayEquals(expected, result);
    }

    @Test
    public void test_move_right_rows_in_array_of_rows_with_two_different_values() throws Exception {
        Helper helper = new Helper();
        Row[] result = helper.moveRight(new Row[]{new Row(4, 0, 2), new Row(4, 0, 2), new Row(4, 0, 2)});
        Row[] expected = new Row[]{new Row(4, 2, 0), new Row(4, 2, 0), new Row(4, 2, 0)};
        assertArrayEquals(expected, result);
    }

    @Test
    public void test_move_right_rows_in_array_of_rows_with_two_different_values_in_other_positions() throws Exception {
        Helper helper = new Helper();
        Row[] result = helper.moveRight(new Row[]{new Row(2, 0, 4), new Row(2, 0, 4), new Row(2, 0, 4)});
        Row[] expected = new Row[]{new Row(2, 4, 0), new Row(2, 4, 0), new Row(2, 4, 0)};
        assertArrayEquals(expected, result);
    }

    @Test
    public void test_move_right_rows_in_array_of_rows_with_two_equal_values() throws Exception {
        Helper helper = new Helper();
        Row[] result = helper.moveRight(new Row[]{new Row(0, 2, 2), new Row(2, 2, 0), new Row(0, 0, 0)});
        Row[] expected = new Row[]{new Row(4, 0, 0), new Row(4, 0, 0), new Row(0, 0, 0)};
        assertArrayEquals(expected, result);
    }

    @Test
    public void test_move_right_rows_in_array_of_rows_with_three_values() throws Exception {
        Helper helper = new Helper();
        Row[] result = helper.moveRight(new Row[]{new Row(4, 2, 2), new Row(2, 2, 2), new Row(0, 0, 0)});
        Row[] expected = new Row[]{new Row(8, 0, 0), new Row(4, 2, 0), new Row(0, 0, 0)};
        assertArrayEquals(expected, result);
    }

    @Test
    public void test_move_right_rows_in_array_of_rows_with_four_values() throws Exception {
        Helper helper = new Helper();
        Row[] result = helper.moveRight(new Row[]{new Row(4, 2, 2, 2), new Row(2, 2, 2, 2), new Row(0, 0, 0, 0), new Row(2, 2, 4, 16)});
        Row[] expected = new Row[]{new Row(8, 2, 0, 0), new Row(8, 0, 0, 0), new Row(0, 0, 0, 0), new Row(8, 16, 0, 0)};
        assertArrayEquals(expected, result);
    }


    @Test(expected = IllegalArgumentException.class)
    public void test_move_right_rows_with_negative_value_in_row() throws Exception {
        Helper helper = new Helper();
        Row[] result = helper.moveRight(new Row[]{new Row(4, -2, 2), new Row(2, 2, 2), new Row(0, 0, 0)});
    }


    @Test
    public void test_isEmpty_method_for_empty_field() throws Exception {
        Helper helper = new Helper();
        assertTrue(helper.isFieldEmpty(new Row[]{new Row(0, 0, 0), new Row(0, 0, 0), new Row(0, 0, 0)}));
    }

    @Test
    public void test_isEmpty_method_for_not_empty_field() throws Exception {
        Helper helper = new Helper();
        assertFalse(helper.isFieldEmpty(new Row[]{new Row(0, 0, 0), new Row(2, 0, 0), new Row(0, 0, 0)}));
    }
}
