package com.dt.cloudmsg.server.model;

import java.util.Date;

import com.dt.cloudmsg.server.beans.Devices;
import com.dt.cloudmsg.server.beans.Profile;
import com.google.gson.annotations.Expose;

public class User {

	@Expose private String username;
	private String password;
	@Expose private int status;
	@Expose private int privilege;
	@Expose private Date expire;
	
	@Expose private Profile profile;
	@Expose private Devices devices;
	
	public static final int STATUS_OK  = 0x00;
	public static final int STATUS_BAN = 0x01;
	
	public static final int PRIVILEGE_FREE = 0x00;
	public static final int PRIVILEGE_L1   = 0x01;
	public static final int PRIVILEGE_L2   = 0x02;
	public static final int PRIVILEGE_L3   = 0x03;
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Profile getProfile() {
		return profile;
	}
	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	public Devices getDevices() {
		return devices;
	}
	public void setDevices(Devices devices) {
		this.devices = devices;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getPrivilege() {
		return privilege;
	}
	public void setPrivilege(int privilege) {
		this.privilege = privilege;
	}
	public Date getExpire() {
		return expire;
	}
	public void setExpire(Date expire) {
		this.expire = expire;
	}
	
	
}
