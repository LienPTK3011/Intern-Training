package util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateConverter {
	static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	public static LocalDate stringToDate(String strDate) {
		try {
			LocalDate ld = LocalDate.parse(strDate, dtf);
			return ld;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static String DateToString(LocalDate ld) {
		return dtf.format(ld);
	}
}
