package com.dt.cloudmsg.server.model;

import com.dt.cloudmsg.server.beans.Jsonable;
import com.dt.cloudmsg.server.util.JsonUtil;
import com.google.gson.annotations.Expose;

public class RawMessageBody implements Jsonable{

	@Expose private String from;
	@Expose private String to;
	@Expose private String msg;
	@Expose private int type;
	
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String toJson() {
		return JsonUtil.toJsonWithExposeAnnotation(this);
	}
	public String toDESJson() {
		return null;
	}
	
	
}
