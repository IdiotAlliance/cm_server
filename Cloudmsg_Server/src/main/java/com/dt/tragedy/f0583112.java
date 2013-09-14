package com.dt.tragedy;

import java.util.Date;

public class Profile extends BaseBean{
	
	private String name;
	private String email;
	private int gender;
	private String addr;
	private int status;
	private int privilege;
	private Date birthday;
	private Date expire;

	@Override
	public String toJson() {
		// TODO Auto-generated method stub
		return null;
	}

}
