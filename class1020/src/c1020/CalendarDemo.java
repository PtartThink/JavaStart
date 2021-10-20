package c1020;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("年:"+calendar.get(1));
        System.out.println("年:"+calendar.get(Calendar.YEAR));
        System.out.println("月:"+(calendar.get(Calendar.MONTH)+1));
        System.out.println("啥也不是:"+calendar.get(Calendar.APRIL));

        //回到两小时之前

        calendar.add(Calendar.HOUR,-2);
        Date date2 = calendar.getTime(); //将日历转为日期
        System.out.println(date2);

    }
}
