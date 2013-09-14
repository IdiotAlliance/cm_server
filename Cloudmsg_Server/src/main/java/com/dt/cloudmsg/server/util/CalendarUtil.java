package com.dt.cloudmsg.server.util;

import java.util.Calendar;
import java.util.Date;
public class CalendarUtil {

	/***
	 * 获得指定的时间对应的<code>Date</code>
	 * @param time 毫秒表示的时间
	 * @return
	 */
	public static final Date getDate(long time){
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(time);
		return cal.getTime();
	}
	
	/***
	 * 获得从当前时间开始的某个时刻之后的<code>Date</code>
	 * @param time 以毫秒表示的时间
	 * @return
	 */
	public static final Date getDateFromNow(long time){
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(cal.getTimeInMillis() + time);
		return cal.getTime();
	}
	
	/***
	 * 察看一个日期是否已经过期（早于当前的时间）
	 * @param date
	 * @return
	 */
	public static final boolean expire(Date date){
		return System.currentTimeMillis() > date.getTime();
	}
	
}
