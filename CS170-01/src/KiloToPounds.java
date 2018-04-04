
public class KiloToPounds {
	//Property of the Class
	double kilograms,
		   pounds;
	
	//Behavior of the Class
	//Setters
	public void setKilograms (String kilo)  {
		kilograms = Double.parseDouble(kilo);
		pounds = kilograms * 0.62137;
	}
	public void setPounds (String pound) {
		pounds = Double.parseDouble(pound);
		kilograms = pounds * 1.609347;
	}
	//Getters
	public double getKilograms () {
		return kilograms;
	}
	public double getPounds() {
		return pounds;
	}

}
