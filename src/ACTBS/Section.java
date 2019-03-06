package ACTBS;

public class Section {
	private SeatClass _seatClass;
	private int[][] _seats; 
	
	public Section(SeatClass seatClass) {
		
		this._seatClass = _seatClass;
		
	}
	
	public SeatClass getSeatClass() {
		return this._seatClass; 
	}
	
	public boolean bookSeat(int row, int col) {
		return false; 
	}
}
