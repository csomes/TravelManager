package ACTBS;

import java.util.*;

import ACTBS.SystemExceptions.*;

public class SystemManager {

	public List<Airport> airports = new ArrayList<Airport>(); 
	public List<Airline> airlines = new ArrayList<Airline>(); 
	
    public void createAirport(String name) {
    	//How should we handle this if we don't use a Try-Catch? is this implementation OK?
    	try{
    		Airport airport = new Airport(name);
        	
        	for(Airport i: airports) {
        		if(airport.getName().equals(i.getName())){
        			System.out.println("Airport creation failed");
        			throw new RuntimeException("Duplicate Airport name"); 
        		}
        	}
        	
        	airports.add(airport); 
        	System.out.println("Airport " + airport.getName() + " created successfully"); 
    	}catch(RuntimeException R) {
    		System.out.println(R);
    	}
    	
    	
    	
    }
    
    public void createAirline(String name) {
    	try {
    		Airline airline = new Airline(name);
    	
    		for(Airline i: airlines) {
    			if(airline.getName().equals(i.getName())){
    				System.out.println("Airline creation failed");
    				throw new RuntimeException("Duplicate Airline name"); 
    			}
    		}
    	
    		airlines.add(airline); 
    		System.out.println("Airline " + airline.getName() + " created successfully"); 
    	}catch(RuntimeException R) {
    		System.out.println(R);
    	}
    	
    }
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
