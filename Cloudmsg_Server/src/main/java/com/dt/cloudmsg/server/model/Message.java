package com.dt.cloudmsg.server.model;

import java.util.Date;

import com.google.gson.annotations.Expose;

public abstract class Message {
	
	@Expose private String from;
	@Expose private String to;
	@Expose private String msgid;
	@Expose private int type;
	@Expose private int ttl;
	@Expose private Date servertime;
	@Expose private Date rawtime;
	@Expose private MessageBody mb;
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
	public String getMsgid() {
		return msgid;
	}
	public void setMsgid(String msgid) {
		this.msgid = msgid;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getTtl() {
		return ttl;
	}
	public void setTtl(int ttl) {
		this.ttl = ttl;
	}
	public Date getServertime() {
		return servertime;
	}
	public void setServertime(Date servertime) {
		this.servertime = servertime;
	}
	public Date getRawtime() {
		return rawtime;
	}
	public void setRawtime(Date rawtime) {
		this.rawtime = rawtime;
	}
	public MessageBody getMb() {
		return mb;
	}
	public void setMb(MessageBody mb) {
		this.mb = mb;
	}

}
