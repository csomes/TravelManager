package ACTBS;

import ACTBS.SystemExceptions.ColumnOutOfBoundaries;
import ACTBS.SystemExceptions.RowOutOfBoundaries;

public class Seat {
    private String ID;
    private boolean booked;

    public Seat(int row, int column) {
        if(row < 1 || row > 100)
            throw new RowOutOfBoundaries();
        if(column < 1 || column > 10)
            throw new ColumnOutOfBoundaries();

        this.ID = " " + row + (065+column);
    }
}
