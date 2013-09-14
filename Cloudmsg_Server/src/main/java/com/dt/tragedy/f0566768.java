package com.dt.tragedy;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;

public class GCMMessage {
	
	private static final int DEFAULT_TTL = 3600 * 24 * 7;
	
	@Expose private String[] registration_ids = null;
	@Expose private String collapse_key = null;
	@Expose private Data data = null;
	@Expose private int time_to_live = DEFAULT_TTL;

	public GCMMessage(){
		this.data = new Data();
	}
	
	private class Data{
		@Expose String body;
	}
	
	public String toJson(){
		GsonBuilder gb = new GsonBuilder();
		Gson gson = gb.excludeFieldsWithoutExposeAnnotation().create();
		return gson.toJson(this);
	}

	public String[] getRegistration_ids() {
		return registration_ids;
	}

	public void setRegistration_ids(String[] registration_ids) {
		this.registration_ids = registration_ids;
	}

	public String getCollapse_key() {
		return collapse_key;
	}

	public void setCollapse_key(String collapse_key) {
		this.collapse_key = collapse_key;
	}

	public int getTime_to_live() {
		return time_to_live;
	}

	public void setTime_to_live(int time_to_live) {
		this.time_to_live = time_to_live;
	}
	
	public void setData(String data){
		this.data.body = data;
	}
	
	public Data getData(){
		return data;
	}
}
