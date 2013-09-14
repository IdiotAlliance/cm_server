package com.dt.cloudmsg.server.beans;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;

public class Devices {
	
	@Expose private List<Device> devices;
	
	public Devices(){
		this.devices = new ArrayList<Device>();
	}

	public List<Device> getDevices() {
		return devices;
	}

	public void setDevices(List<Device> devices) {
		this.devices = devices;
	}
	
}
