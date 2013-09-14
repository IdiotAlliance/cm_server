package com.dt.tragedy;

import java.util.Date;

import com.google.gson.annotations.Expose;

public class Profile extends BaseBean{
	
	@Expose private String name;
	@Expose private String email;
	@Expose private int gender;
	@Expose private String addr;
	@Expose private int status;
	@Expose private int privilege;
	@Expose private Date birthday;
	@Expose private Date expire;
	
	@Override
	public String toJson() {

		
		return null;
	}

}
