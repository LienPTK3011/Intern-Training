/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TTB2_2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Asus
 */
public class NewMain2 {

    /**
     * @param args the command line arguments
     */
    public static void show() throws ParseException {
        // Date ==> String
            Date date = new Date();
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            String dateString = df.format(date);
 
            System.out.println("Current date: " + dateString);
            final DateFormat df1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        // String ==> Date    
            Date date1 = df1.parse(dateString);
            System.out.println("date = " + date1);
 
          
    }
    
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        //2a
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        System.out.println("Current year:"+year);
        
        boolean isLeap = false;
        if(year % 4 == 0)//chia hết cho 4 là năm nhuận
        {
            if( year % 100 == 0)
            //nếu vừa chia hết cho 4 mà vừa chia hết cho 100 thì không phải năm nhuận
            {
                if ( year % 400 == 0)//chia hết cho 400 là năm nhuận
                    isLeap = true;
                else
                    isLeap = false;//không chia hết cho 400 thì không phải năm nhuận
            }
            else//chia hết cho 4 nhưng không chia hết cho 100 là năm nhuận
                isLeap = true;
        }
        else {
            isLeap = false;
        }
            System.out.println("Is Current year leap year "+ isLeap);
                
        if(isLeap == true){
            System.out.println("Lenght of the year"+366 +"days");
        }else{
            System.out.println("Lenght of the year"+365+"days");
        }
        //2b
       DateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");

        Date currentDate = new Date();
        Date date1 = null;
        Date date2 = null;

        try {
            String startDate = "01-01-2016";
            String endDate = simpleDateFormat.format(currentDate);

            date1 = simpleDateFormat.parse(startDate);
            date2 = simpleDateFormat.parse(endDate);

            long getDiff = date2.getTime() - date1.getTime();

            long getDaysDiff = getDiff / (24 * 60 * 60 * 1000);

            System.out.println("Differance between date " + startDate + " and " + endDate + " is " + getDaysDiff + " days.");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        show();
           
    }
    
}
