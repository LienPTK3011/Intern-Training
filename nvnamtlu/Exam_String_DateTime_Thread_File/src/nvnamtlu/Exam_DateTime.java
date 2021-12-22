package nvnamtlu;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Exam_DateTime {
	
	//a.Tạo phương thức lấy ra thông tin về năm
	public static void infoYear() {
		LocalDate ld = LocalDate.now();
		int currentYear = ld.getYear();
		System.out.println("Current year: "+currentYear);
		
		boolean isLeap = false;
		if((currentYear%400==0) || (currentYear%4==0&&currentYear%100!=0)) {
			isLeap = true;
		}
		
		System.out.println("Is current year leap year ? "+isLeap);
		System.out.println("Length of the year: "+ld.getDayOfYear()+ " days"); 
	}
	
	//b.Tạo phương thức tính khoảng thời gian giữa 2 mốc thời gian
	public static void periodTime(LocalDate date1, LocalDate date2) {
		System.out.println("Period bettween "+date1+" and "+date2+": "+Period.between(date1, date2));
	}
	
	static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	//c.Tạo các phương thức chuyển đổi giữa String và datetime
	public static void datetimeToString(LocalDateTime ldt) {
		System.out.println(dtf.format(ldt));
	}
	
	public static void stringToDatetime(String dateTime) {
		System.out.println(LocalDateTime.parse(dateTime, dtf));
	}
	
	//Main
 	public static void main(String[] args) {
 		System.out.println("----------------------a-----------------------");
		infoYear();
		
		System.out.println("----------------------b-----------------------");
		LocalDate date1 = LocalDate.now();
		LocalDate date2 = date1.plus(Period.of(2, 3, 4));
 		periodTime(date1, date2);
		
 		System.out.println("----------------------c-----------------------");
		datetimeToString(LocalDateTime.now());
		stringToDatetime("22/12/2021 15:55:44");
	}

}
