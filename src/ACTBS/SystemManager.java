package ACTBS;

import java.util.*;

public class SystemManager {
	public List<Airport> airports = new ArrayList<Airport>(); 
	
    public void createAirport(String name) throws Exception {
    	Airport airport = new Airport(name);
    	for(Airport i: airports) {
    		if(airport.getName().equals(i.getName())){
    			throw new Exception("Duplicate Airport name"); 
    		} else {
    			airports.add(airport); 
    		}
    	}
    	
    }
    
    public void createAirline(String name) {
    	
    }
    public void createFlight(String name1, String name2, String name3, int num1, int num2, int num3, String name4) {}
    public void createSection(String name1, String name2, int num2, int num3, SeatClass name4) {}
    public void findAvailableFlights(String num1, String num2) {}
    public void bookSeat(String name1, String name2, SeatClass name4, int num1, char name3) {}
    public void displaySystemDetails() {}
}
