package ACTBS;

import java.time.LocalDate;
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
    		System.out.println(R.getMessage());
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
    		System.out.println(R.getMessage());
    	}
    	
    }
    public void createFlight(String aname, String orig, String dest, int year, int month, int day, String fID) {
    	try {
    		if(dest.equals(orig)) {
    			throw new RuntimeException("Origin and Destination are the same"); 
    		}
    		
    		boolean validOrig = false; 
    		boolean validDest = false; 
    		for(Airport a: airports) {
    			if(a.getName().equals(orig)) {
    				validOrig = true;
    			}
    			if(a.getName().equals(dest)) {
    				validDest = true;
    			}
    		}
    		
    		if(validDest == false || validOrig == false) {
    			throw new RuntimeException("Either Origin or Destination (or both) of Flight are not valid"); 
    		}
    		
    		LocalDate localDate = LocalDate.now();
    		if(year < localDate.getYear() ) {
    			throw new RuntimeException("Invalid Date");
    		}
    		if( (month > 12 || day > 31) || (month < 0 || day < 0)) {
    			throw new RuntimeException("Invalid Date");
    		}
    		
    		
    		for(Airline i: airlines) {
    			if(aname.equals(i.getName())) {
    				i.addFlight(orig, dest, year, month, day, fID); 
    			}else {
    				throw new RuntimeException("Airline "+ aname + " does not exist!");  
    			}
    		}
    	}catch(RuntimeException R) {
    		System.out.println(R.getMessage());
    	}
    }

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
    
    public void findAvailableFlights(String orig, String dest) {
    	
    	for(Airline i: airlines) {
    		if(i.findFlights(orig, dest).size() == 0) {
    			System.out.println("No Available Flights"); 
    		}else {
    			for(Flight f: i.findFlights(orig, dest)) {
    				System.out.println("Airline: " + i);
    				System.out.println("Origin: " + orig);
    				System.out.println("Destination: " + dest);
    				System.out.println("Date: " + f.getDate());
    			}
    		}
    	}
    }
    public void bookSeat(String airline, String flightID, SeatClass seatClass, int row, char col) {

    }
    public void displaySystemDetails() {
        

    }
}
