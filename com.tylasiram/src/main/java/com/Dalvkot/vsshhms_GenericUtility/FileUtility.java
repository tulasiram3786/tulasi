package com.Dalvkot.vsshhms_GenericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

/* 
 * 
 * @Author Sudarshan Palla
 * 
 */

public class FileUtility {
	/**
	 * it is used to read the data from commondata.prop
	 * @throws Throwable 
	 * 
	 */
	public String getProperyKeyValue(String key) throws Throwable
	{
	    FileInputStream fis=new FileInputStream("./src/main/resources/CommanData/Credentials.properties");
	    Properties pobj=new Properties();
	    pobj.load(fis);
	    String value=pobj.getProperty(key);
	    return value;
	
	}
	

}
