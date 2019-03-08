package ACTBS;

import java.util.*;

public class Airline {
	private String _name;
	private List<Flight> flightList; 
	
	public Airline(String name) {
		if(name.length() > 6 || name.length() < 1) {
			throw new RuntimeException("Airline name is greater than 5 char OR les than 1 char");
		}
		
		this._name = name;
	}
	
	public String getName() {
		return _name;
		
	}
	
	public ArrayList<Flight> findFlights(String origin, String destination) {
		ArrayList<Flight> flightList = new ArrayList<Flight>();
		for(Flight i: flightList) {
			if(origin.equals(i.getOrigin()) && destination.equals(i.getDestination())) {
				
				flightList.add(i); 
			}
		}
		return flightList;
	}
	
	
	
	public boolean book(String fID, SeatClass seatClass, int row, char col)  {
		int colNum = Character.getNumericValue(col);
		for(Flight i: flightList) {
			if(fID.equals(i.getfID())) {
				return i.bookSeat(seatClass, row, colToNum(col));
			}
		}
		
		return false; 
	}
	
	public boolean addFlight(String origin, String destination, int year, int month, int day, String fID) {
		Flight f = new Flight(fID, origin, destination, year, day, month);
		for(Flight i : flightList) {
			if(fID.equals(i.getfID())) {
				throw new RuntimeException("Duplicate Flight ID"); 
			}
		}
		
		flightList.add(f); 
		return true;
	}
	
	private int colToNum(char col) {
		int colNum = 0;
		switch(col) {
        	case 'a' :
        		colNum = 0;
        		break;
        	case 'b' :
        		colNum = 1;
        		break;
        	case 'c' :
        		colNum = 2;
        		break;
        	case 'd' :
        		colNum = 3;
        		break;
        	case 'e' :
        		colNum = 4;
        		break;
        	case 'f' :
        		colNum = 5;
        		break;
        	case 'g' :
        		colNum = 6;
        		break;
        	case 'h' :
        		colNum = 7;
        		break;
        	case 'i' :
        		colNum = 8;
        		break;
        	case 'j' :
        		colNum = 9;
        		break;
        	default :
        		break;
		}
		
		return colNum;
		
	}
	
	
	
}