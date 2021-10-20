package c1020;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class DateDemo {

    public static void main(String[] args) throws ParseException {
        //获得当前系统时间
        Date date = new Date();
        System.out.println(date);
        //Date转String
        SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = sDateFormat.format(date);
        System.out.println(dateString);
        //String转Date
        String dateString2 = "2010-08-11 13:12:11";
        Date date2 = sDateFormat.parse(dateString2);
        System.out.println(date2);


    }
}
