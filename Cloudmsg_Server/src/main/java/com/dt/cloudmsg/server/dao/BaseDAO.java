package com.dt.cloudmsg.server.dao;

import com.mongodb.DBCollection;
import com.dt.cloudmsg.server.util.MongoConstants;

public class BaseDAO {
	
	protected DBCollection dc = null;
	protected String collectionName = null;
	
	public BaseDAO(String collectionName){
		this.collectionName = collectionName;
		this.dc = MongoConnectionManager.getCollection(
				MongoConstants.DB_NAME, 
				MongoConstants.DB_USERNAME, 
				MongoConstants.DB_PASSWORD, 
				collectionName);
	}
	
	public void clear(){
		this.dc.drop();
	}

}
