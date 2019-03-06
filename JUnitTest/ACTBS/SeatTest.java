package ACTBS;

import ACTBS.SystemExceptions.ColumnOutOfBoundariesException;
import ACTBS.SystemExceptions.RowOutOfBoundariesException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SeatTest {
    @Test
    void testRowOutOfBoundaries() {
        assertThrows(RowOutOfBoundariesException.class, () -> new Seat(-1, 1));
        assertThrows(RowOutOfBoundariesException.class, () -> new Seat(101, 1));
    }

    @Test
    void testColumnOutOfBoundaries() {
        assertThrows(ColumnOutOfBoundariesException.class, () -> new Seat(1, -1));
        assertThrows(ColumnOutOfBoundariesException.class, () -> new Seat(1, 11));
    }

    @Test
    void testGetID() {
        assertEquals("1A", new Seat(1, 1).getID());
        assertEquals("100J", new Seat(100, 10).getID());
    }

}