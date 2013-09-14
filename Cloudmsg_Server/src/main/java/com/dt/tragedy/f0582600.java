package com.dt.tragedy;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.dt.cloudmsg.model.Device;
import com.dt.cloudmsg.model.User;
import com.dt.cloudmsg.server.dao.MongoUserDAO;
import com.dt.cloudmsg.util.Encoder;

public class MongoUserDAOTest {

	MongoUserDAO mud = null;
	Device device1   = null;
	
	@Before
	public void init(){
		mud = new MongoUserDAO();
		device1 = new Device();
		device1.setIMEI("123");
		device1.setNickName("