package com.dt.tragedy;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.dt.cloudmsg.beans.ReturnMsg;
import com.dt.cloudmsg.model.Device;
import com.dt.cloudmsg.model.User;
import com.dt.cloudmsg.util.Encoder;
import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;

public class MongoUserDAO extends BasicMongoDAO{
	
	private DBCollection dc = null;
	
	public MongoUserDAO(){
		dc = MongoConnectionManager.getCollection(DB_NAME, USERNAME, PASSWORD, USERS);
	}

	public ReturnMsg createUser(String username, String password){
		if(username == null || password == null)
			return new ReturnMsg(ReturnMsg.FAIL, "