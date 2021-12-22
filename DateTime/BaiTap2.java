/**
 * 
 */
package DateTime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @author DELL
 *
 */
public class BaiTap2 {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		bai2_a();
		System.out.println("-------------");
		bai2_b();
		System.out.println("-------------");
		bai2_c();
		
	}
	// lấy ra năm hiện tạo - kiểm tra năm hiện tại có nhuận hay không - số ngày hiện tại của năm
	public static void bai2_a() {
		System.out.println("Bài 2 - ý a:");
		Calendar cal = Calendar.getInstance();   
	    System.out.println("Năm hiện tại= " + cal.get(Calendar.YEAR));
	    
	    if ((cal.get(Calendar.YEAR) % 4 == 0) && (cal.get(Calendar.YEAR) % 100 != 0) || (cal.get(Calendar.YEAR) % 400 == 0)) {
	    	System.out.println("Năm "+cal.get(Calendar.YEAR)+" nhuận");
	    }else {
	    	System.out.println("Năm " +cal.get(Calendar.YEAR)+" không nhuận");
	    }
	   
	    System.out.println("Số ngày hiện tại=" + cal.get(Calendar.DAY_OF_YEAR));
	}
	
	// tính số ngày giữa 2 mốc tgian
	public static void bai2_b() {
		System.out.println("Bài 2 - ý b:");
		DateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(Calendar.HOUR, 24);

		Date date1 = null;
		Date date2 = null;

		try {
		  String startDate = "2021-12-20 15:00:00";
		  String endDate = "2021-12-23 15:00:00";

		  date1 = simpleDateFormat.parse(startDate);
		  date2 = simpleDateFormat.parse(endDate);

		  long getDiff = date2.getTime() - date1.getTime();
		  long getDaysDiff = TimeUnit.MILLISECONDS.toDays(getDiff);
		  System.out.println("Số ngày từ " + startDate + " đến " + endDate + " là " + getDaysDiff + " ngày");
		}catch (Exception e) {
		  e.printStackTrace();
		}
	}
	
	// chuyển từ String sang Datetime
	public static void bai2_c() throws ParseException {
		System.out.println("Bài 2 - ý c:");
		String stringDate = "22/12/2021";
		Date date = new SimpleDateFormat("dd/MM/yyyy").parse(stringDate);
		System.out.println("String: " +stringDate + " sang Datetime: " + date);
		
	}
	
}
