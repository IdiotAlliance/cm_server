package com.dt.tragedy;

import java.util.Date;

import com.google.gson.Gson;
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
	
	private Gson gson = builder.excludeFieldsWithoutExposeAnnotation().create();
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public int getGender() {
		return gender;
	}



	public void setGender(int gender) {
		this.gender = gender;
	}



	public String getAddr() {
		return addr;
	}



	public void setAddr(String addr) {
		this.addr = addr;
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



	public Date getBirthday() {
		return birthday;
	}



	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}



	public Date getExpire() {
		return expire;
	}



	public void setExpire(Date expire) {
		this.expire = expire;
	}



	public Gson getGson() {
		return gson;
	}



	public void setGson(Gson gson) {
		this.gson = gson;
	}



	@Override
	public String toJson() {
		return gson.toJson(this);
	}
	
}
