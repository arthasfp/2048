import org.junit.Test;

import static org.junit.Assert.*;


public class FieldTest {

    @Test
    public void testSetField_set_with_positive_value() throws Exception {
        Field field = new Field();
        Cell[][] test = field.setField(5);
        Cell[][] expected = new Cell[5][5];
        assertArrayEquals(expected, test);
    }

    @Test
    public void testSetField_set_with_zero_value() throws Exception {
        Field field = new Field();
        Cell[][] test = field.setField(0);
        Cell[][] expected = new Cell[0][0];
        assertArrayEquals(expected, test);
    }

    @Test(expected = NegativeArraySizeException.class)
    public void testSetField() throws Exception {
        Field field = new Field();
        Cell[][] test = field.setField(-5);
    }

    @Test
    public void testGetPositionInRow() throws Exception {

    }

    @Test
    public void testGetPositionInColumn() throws Exception {

    }

    @Test
    public void testAddTwoInRandomCell() throws Exception {

    }

    @Test
    public void testMoveAllRowsUp() throws Exception {

    }

    @Test
    public void testMoveAllRowsDown() throws Exception {

    }

    @Test
    public void testMoveAllColumnsLeft() throws Exception {

    }

    @Test
    public void testMoveAllColumnsRight() throws Exception {

    }

    @Test
    public void testGameOverWithWinner() throws Exception {

    }

    @Test
    public void testRealGameOver() throws Exception {

    }
}