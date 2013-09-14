package com.dt.cloudmsg.server.model;

import com.dt.cloudmsg.server.beans.Jsonable;
import com.dt.cloudmsg.server.util.JsonUtil;
import com.google.gson.annotations.Expose;

public class CMDMessageBody extends MessageBody{
	
	@Expose private int cmd;
	@Expose private String msg;
	
	public int getCmd() {
		return cmd;
	}
	public void setCmd(int cmd) {
		this.cmd = cmd;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public String toJson() {
		return JsonUtil.toJsonWithExposeAnnotation(this);
	}
	
	public String toDESJson() {
		return null;
	}

}
