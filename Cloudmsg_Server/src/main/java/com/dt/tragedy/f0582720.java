package com.dt.tragedy;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.dt.cloudmsg.beans.Authentication;
import com.dt.cloudmsg.beans.ReturnMsg;
import com.dt.cloudmsg.server.dao.MongoUserDAO;

@Path("/account")
public class AccountServiceImpl extends BaseService implements AccountService{

	@POST
	@Path("/register")
	public String register(@FormParam("json") String encodedJson) {
		Authentication auth = parseJson(Authentication.class, encodedJson);
		if(auth == null){
			ReturnMsg rm = new ReturnMsg(ReturnMsg.FAIL, "