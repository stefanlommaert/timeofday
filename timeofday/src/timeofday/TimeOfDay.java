package timeofday;

/**
 * Instances of this class store a time of day.
 * 
 * @invar The hours are between 0 and 23
 * 		| 0 <= getHours() && getHours() <= 23
 * @invar The minutes are between 0 and 59
 * 		| 0 <= geMinutes() && getMinutes() <= 59
 * 		
 */

public class TimeOfDay {
	
	private int minutesSinceMidnight;
	
	int getHours() { 
		return minutesSinceMidnight / 60;}
	int getMinutes() {
		return minutesSinceMidnight % 60;}
	void setHours(int hours) {
		minutesSinceMidnight = getMinutes() + hours * 60;}
	void setMinutes(int minutes) {
		minutesSinceMidnight = getHours() * 60 + minutes; }
	

}
