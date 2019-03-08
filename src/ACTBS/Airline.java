package ACTBS;

import java.util.*;

public class Airline {
	private String _name;
	private List<Flight> flightList; 
	
	public Airline(String name) throws Exception {
		if(name.length() > 6 || name.length() < 1) {
			throw new Exception("Airline name is greater than 6 char OR les than 1 char");
		}
		this._name = name;
	}
	
	public String getName() {
		return _name;
		
	}
	
	public boolean findFlights(String origin, String destination) {
		for(Flight i: flightList) {
			if(origin.equals(i.origin))
		}
	}
	
	
	
}
