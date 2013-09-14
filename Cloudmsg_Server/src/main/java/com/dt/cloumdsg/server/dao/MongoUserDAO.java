package com.dt.cloumdsg.server.dao;

import java.util.Date;

import com.dt.cloudmsg.server.beans.Device;
import com.dt.cloudmsg.server.beans.Devices;
import com.dt.cloudmsg.server.beans.Profile;
import com.dt.cloudmsg.server.beans.ReturnMsg;
import com.dt.cloudmsg.server.model.User;
import com.dt.cloudmsg.server.util.CalendarUtil;
import com.dt.cloudmsg.server.util.Encoder;
import com.dt.cloudmsg.server.util.MongoConstants;
import com.dt.cloudmsg.server.util.SystemConstants;
import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;

public class MongoUserDAO extends BaseDAO{
	
	public MongoUserDAO(){
		super(MongoConstants.DB_USERS_NAME);
	}

	public ReturnMsg createUser(String username, String password){
		if(userExists(username)){
			return new ReturnMsg(ReturnMsg.FAIL, "该用户已存在");
		}
		this.dc.save(new BasicDBObject(MongoConstants.DB_USERS_USERNAME, username)
						   .append(MongoConstants.DB_USERS_PASSWORD, Encoder.encodeSHA1(password))
						   .append(MongoConstants.DB_USERS_STATUS, User.STATUS_OK)
						   .append(MongoConstants.DB_USERS_PRIVILEGE, User.PRIVILEGE_FREE)
						   .append(MongoConstants.DB_USERS_EXPIRE, CalendarUtil.getDateFromNow(Long.parseLong(SystemConstants.EXPIRE_FREE)))
						   .append(MongoConstants.DB_USERS_DEVICES, new BasicDBList()));
		return new ReturnMsg();
	}
	
	public ReturnMsg updateUserProfile(String username, Profile profile){
		if(!userExists(username))
			return new ReturnMsg(ReturnMsg.FAIL, "指定的用户不存在");
		DBObject o = this.retriebeUserByUsername(username);
		o.put(MongoConstants.DB_USERS_REALNAME, profile.getName());
		o.put(MongoConstants.DB_USERS_EMAIL, profile.getEmail());
		o.put(MongoConstants.DB_USERS_ADDRESS, profile.getAddr());
		o.put(MongoConstants.DB_USERS_BIRTHDAY, profile.getBirth());
		o.put(MongoConstants.DB_USERS_GENDER, profile.getGender());
		this.dc.update(new BasicDBObject(MongoConstants.DB_USERS_USERNAME, username), o);
		return new ReturnMsg();
	}
	
	public Profile getUserProfile(String username){
		DBObject o = this.retriebeUserByUsername(username);
		Profile profile = new Profile();
		profile.setAddr((String)o.get(MongoConstants.DB_USERS_ADDRESS));
		profile.setEmail((String)o.get(MongoConstants.DB_USERS_EMAIL));
		profile.setBirth((Date)o.get(MongoConstants.DB_USERS_BIRTHDAY));
		profile.setGender((Integer)o.get(MongoConstants.DB_USERS_GENDER));
		profile.setName((String)o.get(MongoConstants.DB_USERS_REALNAME));
		return profile;
	}
	
	public ReturnMsg deleteUser(String username){
		this.dc.remove(new BasicDBObject(MongoConstants.DB_USERS_USERNAME, username));
		
		return null;
	}
	
	public boolean userExists(String username){
		DBCursor cursor = this.dc.find(new BasicDBObject(MongoConstants.DB_USERS_USERNAME, username));
		return cursor.hasNext();
	}
	
	public boolean userExpire(String username){
		DBObject user = this.retriebeUserByUsername(username);
		if(user == null)
			throw new IllegalArgumentException();
		Date expire = (Date) user.get(MongoConstants.DB_USERS_EXPIRE);
		return CalendarUtil.expire(expire);
	}
	
	public ReturnMsg authenticateUser(String username, String password){
		return null;
	}
	
	public ReturnMsg addDevice(String username, Device device){
		return null;
	}
	
	public ReturnMsg updateDevice(String username, Device device){
		return null;
	}
	
	public Devices getDevices(String username){
		return null;
	}
	
	public ReturnMsg deleteDevice(String user, String imei){
		return null;
	}
	
	private DBObject retriebeUserByUsername(String username){
		return this.dc.findOne(new BasicDBObject(MongoConstants.DB_USERS_USERNAME, username));
	}
}
