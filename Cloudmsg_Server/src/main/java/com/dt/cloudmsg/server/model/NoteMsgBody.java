package com.dt.cloudmsg.server.model;

public class NoteMsgBody extends MessageBody{
	
	private int type;
	private int msg;
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getMsg() {
		return msg;
	}
	public void setMsg(int msg) {
		this.msg = msg;
	}
	public String toJson() {
		// TODO Auto-generated method stub
		return null;
	}
	public String toDESJson() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
