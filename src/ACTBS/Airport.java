package ACTBS;
public class Airport {
	
	private String _name; 
	
	public Airport(String name) {
		if(name.length() != 3) {
			throw new RuntimeException("Name length not 3"); 
		} else if(!name.matches("[a-zA-Z]+")) {
			throw new RuntimeException("Airport Name cannot contain Numbers or symbols"); 
		}
		
		this._name = name;
	}
	
	public String getName() {
		return this._name;
	}
	
	@Override
	public String toString() {
		return "Airport name: " + this._name;
	}
}
