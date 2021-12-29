package util;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeConverter {
	static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
	public static LocalTime stringToTime(String strTime) {
		try {
			LocalTime lt = LocalTime.parse(strTime, dtf);
			return lt;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static String TimeToString(LocalTime lt) {
		return dtf.format(lt);
	}
}
