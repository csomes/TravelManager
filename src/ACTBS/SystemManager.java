package ACTBS;

import ACTBS.SystemExceptions.*;

public class SystemManager {

    public void createAirport(String name) {}
    public void createAirline(String name) {}
    public void createFlight(String name1, String name2, String name3, int num1, int num2, int num3, String name4) {}

    public void createSection(String airline, String flightID, int rows, int cols, SeatClass seatClass) {

        try {
            new Section(rows, cols, seatClass);

        }
        catch(RowOutOfBoundsException e){
            System.out.println(String.format("SECTION NOT CREATED :: Airline: %s Flight: %s Class: %s :: REASON: %s", airline, flightID, seatClass, e.getMessage()));
        }
        catch(ColumnOutOfBoundsException e){
            System.out.println(String.format("SECTION NOT CREATED :: Airline: %s Flight: %s Class: %s :: REASON: %s", airline, flightID, seatClass, e.getMessage()));

        }
    }
    public void findAvailableFlights(String num1, String num2) {}
    public void bookSeat(String airline, String flightID, SeatClass seatClass, int row, char col) {

    }
    public void displaySystemDetails() {
        

    }
}
