package ACTBS;

import java.util.*;

public class Flight {
	
	private String _origin, _destination, _fID;
	private int _year, _day, _month;
	private List<Section> sections; 
	
	public Flight(String fID,String origin, String destination, int year, int day, int month) {
		this._fID = fID;
		this._origin = origin;
		this._destination = destination;
		this._year = year;
		this._day = day;
		this._month = month;
	}
	
	public boolean hasAvailableSection(){
		return false; 
	}
	
	public String getOrigin() {
		return this._origin;
	}
	
	public String getDestination() {
		return this._destination;
	}
	
	public String getfID() {
		return this._fID; 
	}
	
	public boolean bookSeat(SeatClass seatClass, int row, int col) {
		Section sec = null;
		for(Section i: sections) {
			if(i.getSeatClass() == (seatClass)) {
				sec = i;
			} else {
				throw new RuntimeException("Invalid SeatClass");
			}
		}
		
		return sec.bookSeat(row, col);
	}
	
	@Override 
	public String toString() {
		return "Flight: " + this._origin + " " + this._destination; 
	}
	
	
	
	
}
