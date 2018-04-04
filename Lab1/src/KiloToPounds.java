/*********************************************************************************
Name: Usman Ahmed
Course: CS170-01
Lab #: Lab 1
Submission Date: 10:00 pm, Wed (9/20)
Brief Description: Kilograms and Pounds Converter Class Blueprint. Contains methods
to facilitate the conversion from one unit of measurement to another.
*********************************************************************************/

public class KiloToPounds {
	//Property of the Class
	double kilograms,
		   pounds;
	
	//Behavior of the Class
	//Setters
	public void setKilograms (String kilo)  {
		kilograms = Double.parseDouble(kilo);
		pounds = kilograms * 2.20462;
	}
	public void setPounds (String pound) {
		pounds = Double.parseDouble(pound);
		kilograms = pounds * 0.453592;
	}
	//Getters
	public double getKilograms () {
		return kilograms;
	}
	public double getPounds() {
		return pounds;
	}

}
