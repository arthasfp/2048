public class Cell {
    private int value;

    public Cell(int value) {
        if (value == 0 || value == 2 || value % 4 == 0)
            this.value = value;
        else
            throw new IllegalArgumentException();
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public static Cell add(Cell first, Cell second) {
        if (first == null && second == null) {
            first = new Cell(0);
            second = new Cell(0);
        } else if (second != null && first == null) {
            first = new Cell(0);
            first.value = second.value;
            second.value = 0;
        } else if (first.equals(second)) {
            second.value += first.value;
            first.value = 0;
        } else if (second == null && first != null) {
            second = new Cell(0);
            second.value = first.value;
            first.value = 0;
        }
        return second;
    }

    public static boolean isEmpty(Cell cell) {
        if (cell == null || cell.value == 0)
            return true;
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cell cell = (Cell) o;
        return value == cell.value;
    }

    @Override
    public int hashCode() {
        return value;
    }

    @Override
    public String toString() {
        return "Cell{" +
                "value=" + value +
                '}';
    }
}
