package ACTBS;

import ACTBS.SystemExceptions.ColumnOutOfBoundaries;
import ACTBS.SystemExceptions.RowOutOfBoundaries;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SeatTest {
    @Test
    void testRowOutOfBoundaries() {
        assertThrows(RowOutOfBoundaries.class, () -> new Seat(-1, 1));
        assertThrows(RowOutOfBoundaries.class, () -> new Seat(101, 1));
    }

    @Test
    void testColumnOutOfBoundaries() {
        assertThrows(ColumnOutOfBoundaries.class, () -> new Seat(1, -1));
        assertThrows(ColumnOutOfBoundaries.class, () -> new Seat(1, 11));
    }

}