package year;

public class Calculate {

    public static int HowManyDays(int year,int month){

        int alldays = 0;
        int allyeardays = 0;
        for(int i = 1970;i<year;i++){

            if ((i%4==0)&&(i%100!=0)||(i%400==0)){
                allyeardays += 366;
            }else{
                allyeardays += 365;

            }

        }
        int allmonthdays = 0;

        for(int i=1;i<month;i++){
            if(i == 1||i == 3||i == 5||i == 7||i == 8||i == 10||i == 12){
                allmonthdays += 31;
            }else if(i == 4||i == 6||i == 9||i == 11){
                allmonthdays += 30;
            }else if(i == 2){
                if ((year%4==0)&&(year%100!=0)||(year%400==0)){
                    allmonthdays += 29;
                }else{
                    allmonthdays += 28;

                }
            }

        }
        alldays = allyeardays + allmonthdays;
        return alldays;



    }

    public static int getwhichweek(int alldays){
        int weekday = alldays%7;
        //余数为0就是周四。
        int startday = 100;
        if (weekday == 4){
            startday = 1;
        }
        if (weekday == 5){
            startday = 2;
        }
        if (weekday == 6){
            startday = 3;
        }
        if (weekday == 0){
            startday = 4;
        }
        if (weekday == 1){
            startday = 5;
        }
        if (weekday == 2){
            startday = 6;
        }
        if (weekday == 3){
            startday = 7;
        }
        return startday;

    }

    public static int getmonthalldays(int year,int month){
        int alldays = 100;
        if(month == 1||month == 3||month == 5||month == 7||month == 8||month == 10||month == 12){
            alldays = 31;
        }else if(month == 4||month == 6||month == 9||month == 11){
            alldays = 30;
        }else if(month == 2){
            if ((year%4==0)&&(year%100!=0)||(year%400==0)){
                alldays = 29;
            }else{
                alldays = 28;

            }
        }
        return alldays;

    }



}

