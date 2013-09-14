package com.dt.cloudmsg.server.util;

public class MongoConstants {

	private static final PropertiesUtil pu = new PropertiesUtil("db.properties");
	public static final String DB_NAME     = pu.getStringProperty("db.name"),
							   DB_HOST     = pu.getStringProperty("db.host"),
							   DB_PORT     = pu.getStringProperty("db.port"),
							   DB_USERNAME = pu.getStringProperty("db.username"),
							   DB_PASSWORD = pu.getStringProperty("db.password"),
							   DB_DES_KEY  = pu.getStringProperty("db.des.key"),
							   
							   // USER COLLECTION
							   DB_USERS_NAME = pu.getStringProperty("db.users.name"),
							   DB_USERS_USERNAME = pu.getStringProperty("db.users.username"),
							   DB_USERS_PASSWORD = pu.getStringProperty("db.users.password"),
							   DB_USERS_STATUS   = pu.getStringProperty("db.users.status"),
							   DB_USERS_PRIVILEGE = pu.getStringProperty("db.users.privilege"),
							   DB_USERS_EXPIRE    = pu.getStringProperty("db.users.expire"),
							   DB_USERS_REALNAME  = pu.getStringProperty("db.users.nickname"),
							   DB_USERS_BIRTHDAY  = pu.getStringProperty("db.users.birthday"),
							   DB_USERS_ADDRESS   = pu.getStringProperty("db.users.address"),
							   DB_USERS_GENDER    = pu.getStringProperty("db.users.gender"),
							   DB_USERS_EMAIL     = pu.getStringProperty("db.users.email"),
							   DB_USERS_PROFILE   = pu.getStringProperty("db.users.profile"),
							   DB_USERS_DEVICES   = pu.getStringProperty("db.users.devices"),
							   DB_USERS_DEVICES_NAME = pu.getStringProperty("db.users.devices.name"),
							   DB_USERS_DEVICES_IMEI = pu.getStringProperty("db.users.devices.imei"),
							   DB_USERS_DEVICES_REGID = pu.getStringProperty("db.users.devices.regid"),
							   DB_USERS_DEVICES_NUMBER = pu.getStringProperty("db.users.devices.number"),
							   DB_USERS_DEVICES_STATUS = pu.getStringProperty("db.users.devices.status"),
							   
							   // MSG COLLECTION
							   DB_MSGS_NAME = pu.getStringProperty("db.messages.name"),
							   DB_MSGS_FROM = pu.getStringProperty("db.messages.from"),
							   DB_MSGS_TO   = pu.getStringProperty("db.messages.to"),
							   DB_MSGS_TYPE = pu.getStringProperty("db.messages.type"),
							   DB_MSGS_RAWTIME = pu.getStringProperty("db.messages.rtime"),
							   DB_MSGS_SERVERTIME = pu.getStringProperty("db.messages.stime"),
							   DB_MSGS_TTL        = pu.getStringProperty("db.messages.ttl"),
							   DB_MSGS_BODY       = pu.getStringProperty("db.messages.body");
	
}
