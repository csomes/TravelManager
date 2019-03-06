package ACTBS;

import java.util.*;

public class Flight {
	
	private String _origin, _destination;
	private int _year, _day, _month;
	private List<Section> sections; 
	
	public Flight(String _origin, String _destination, int _year, int _day, int _month) {
		this._origin = _origin;
		this._destination = _destination;
		this._year = _year;
		this._day = _day;
		this._month = _month;
	}
	
	public boolean hasAvailableSection(){
		return false; 
	}
	
	public String getOrigin() {
		return this._origin;
	}
	
	public String getdestination() {
		return this._destination;
	}
	
	public boolean bookSeat(SeatClass seatClass, int row, int col) throws Exception {
		Section sec = null;
		for(Section i: sections) {
			if(i.getSeatClass() == seatClass) {
				sec = i;
			} else {
				throw new Exception("Invalid SeatClass");
			}
		}
		
		return sec.bookSeat(row, col);
	}
	
	@Override 
	public String toString() {
		return "Flight: " + this._origin + " " + this._destination; 
	}
	
	
	
	
}
