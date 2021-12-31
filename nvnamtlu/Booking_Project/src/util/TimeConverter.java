package util;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeConverter {
	static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
	
	//method to convert from string to time
	public static LocalTime stringToTime(String strTime) {
		try {
			LocalTime lt = LocalTime.parse(strTime, dtf);
			return lt;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	//method to convert from time to string
	public static String timeToString(LocalTime lt) {
		return dtf.format(lt);
	}
}
