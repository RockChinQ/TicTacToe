package ttt;

import java.util.Calendar;

public class getTime {
	int getSecond(){return Calendar.getInstance().get(Calendar.SECOND);}
	int getMinute(){return Calendar.getInstance().get(Calendar.MINUTE);}
	int getHour(){return Calendar.getInstance().get(Calendar.HOUR);}
	int getHourOfDay(){return Calendar.getInstance().get(Calendar.HOUR_OF_DAY);}
	int getDayOfMonth(){return Calendar.getInstance().get(Calendar.DAY_OF_MONTH);}
	int getDayOfWeek(){return Calendar.getInstance().get(Calendar.DAY_OF_WEEK);}
	int getDayOfYear(){return Calendar.getInstance().get(Calendar.DAY_OF_YEAR);}
	int getMonth(){return Calendar.getInstance().get(Calendar.MONTH);}
	int getYear(){return Calendar.getInstance().get(Calendar.YEAR);}
}
