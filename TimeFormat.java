// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
	String time = (args[0]);
	int hours = Integer.parseInt("" + time.charAt(0) + time.charAt(1));
	int minutes = Integer.parseInt("" + time.charAt(3) + time.charAt(4));

	String symbol = (hours < 12 ? "AM" : "PM");

	int displayHours;
	if (hours == 12) {
	displayHours = 12;
	} else if (hours == 0) {
	displayHours = 0;	}
	else if (hours > 12 && hours < 24) { 
		displayHours = hours - 12;
	} else {
		displayHours = hours;
	}
	System.out.println((displayHours < 10 ? "0" : "") + displayHours + ":" + (minutes < 10 ? "0" : "") + minutes + " " + symbol);
}
}
