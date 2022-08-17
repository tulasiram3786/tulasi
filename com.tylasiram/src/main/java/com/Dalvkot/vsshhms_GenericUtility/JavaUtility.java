package com.Dalvkot.vsshhms_GenericUtility;

import java.util.Date;
import java.util.Random;

/**
 * 
 * @author Sudarshan
 *
 */
public class JavaUtility {
	/**
	 * it is used to generate a Random Number
	 */
	public int getRandomNumber()
	{
		Random random =new Random();
		int intRandom=random.nextInt(10000);
		return intRandom;
		
	}
	/**
	 * it is used to get system date and Time in IST format
	 * @return
	 */
	public String getSystemDateAndTime()
	{
		Date date=new Date();
		return date.toString().toString().replace(":", "-");
	}
    /**
     * it is used to get system Date in YYYY-MM-DD format
     * @return
     */
	public String getSystemDateWithFormat()
	{
		Date date=new Date();
		String dateAndTime=date.toString();
		
		String YYYY =dateAndTime.split("")[5];
		String DD=dateAndTime.split("")[2];
		int MM=date.getMonth()+1;
		String finalFormat=date.getTime()+"-"+YYYY+"-"+MM+"-"+DD;
		return finalFormat;
		
	}
}
