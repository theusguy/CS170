/*********************************************************************************
Name: Usman Ahmed
Course: CS170-01
Lab #: Lab 2
Submission Date: 10:00 pm, Wed (10/4)
Brief Description: Operation class used to organize data given by user and 
display them in their proper categories.
*********************************************************************************/

package TimeConverter;

public class TimeConverter {
	//Constants
	private final int SECONDS_MAX = 60,
			MINUTES_MAX = 60,
			HOURS_MAX = 24,
			DAYS_MAX = 7;
	//Instance Variables
	private int seconds, minutes, hours, days, weeks;
	
	public TimeConverter() {
		
	}
	
	public TimeConverter(int seconds) {
		this.setSeconds(seconds);
	}
	public TimeConverter(int seconds, int minutes) {
		this.setSeconds(seconds);
		this.setMinutes(minutes);
	}
	public TimeConverter(int seconds, int minutes, int hours) {
		this.setSeconds(seconds);
		this.setMinutes(minutes);
		this.setHours(hours);
	}
	
	//WEEKS****************************************************************************
	public int getWeeks() {
		return this.days / DAYS_MAX;
	}
	
	//DAYS*****************************************************************************
	public void resetDays() {
		this.days = 0;
	}
	public int getDays() {
		return this.days % DAYS_MAX;
	}
	//HOURS****************************************************************************
	public void setHours(int hours) {
		//CHeck Hours for overlapping with Days
		this.checkHours(hours);
		
		//Set Hours
		this.hours = hours % HOURS_MAX;
	}
	
	public int setHours(int hours, boolean returnData) {
		this.checkHours(hours);
		return hours;
	}
	
	public int getHours() {
		return hours;
	}
	
	public void addDays(int days) {
		this.days += days;
	}
	
	public void checkHours(int hours) {
		if (hours >= HOURS_MAX) {
			this.addDays(hours/HOURS_MAX);
		}
	}
	
	//MINUTES***************************************************************************
	public void setMinutes(int minutes) {
		this.checkMinutes(minutes);
		this.minutes = minutes % MINUTES_MAX;
	}
	
	public int setMinutes(int minutes, boolean returnData) {
		this.checkMinutes(minutes);
		return minutes;
	}
	
	public int getMinutes() {
		return minutes;
	}
	
	public void addHours(int hours) {
		this.hours += this.setHours(hours, true);
	}
	
	public void checkMinutes(int minutes) {
		if (minutes >= MINUTES_MAX) {
			this.addHours(minutes/MINUTES_MAX);
		}
	}
	//SECONDS*****************************************************************************
	public void setSeconds(int seconds) {
		this.checkSeconds(seconds);
		this.seconds = seconds % SECONDS_MAX;
	}
	
	public int getSeconds() {
		return seconds;
	}
	
	public void addMinutes(int minutes) {
		this.minutes += this.setMinutes(minutes, true);
	}
	
	public void checkSeconds(int seconds) {
		if (seconds >= SECONDS_MAX) {
			this.addMinutes(seconds/SECONDS_MAX);
			
		}
	}
	
	//
}
