package com.dt.cloudmsg.server.util;

public class SystemConstants {

	private static final PropertiesUtil pu = new PropertiesUtil("system.properties");
	public static final String DES_KEY = pu.getStringProperty("des.key");
	public static final String EXPIRE_FREE = pu.getStringProperty("expire.free");
	
}
