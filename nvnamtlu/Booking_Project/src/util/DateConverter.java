package util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateConverter {
	static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	//method to convert from string to date
	public static LocalDate stringToDate(String strDate) {
		try {
			LocalDate ld = LocalDate.parse(strDate, dtf);
			return ld;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	//method to convert from date to string
	public static String dateToString(LocalDate ld) {
		return dtf.format(ld);
	}
}
