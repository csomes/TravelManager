package ACTBS;
public class Airport {
	
	private String _name; 
	
	public Airport(String name) throws Exception {
		if(name.length() != 3) {
			throw new Exception("Name length is wrong"); 
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
