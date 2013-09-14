package com.dt.cloudmsg.server.beans;

import com.dt.cloudmsg.server.util.JsonUtil;
import com.google.gson.annotations.Expose;

public class ReturnMsg implements Jsonable{

	@Expose private int fail;
	@Expose private String msg = null;
	
	
	public static final int SUCCESS = 0x00, // 成功
							FAIL = 0x01;    // 失败
	
	public ReturnMsg(){
		this(SUCCESS);
	}
	
	public ReturnMsg(int fail){
		this(fail, null);
	}
	
	public ReturnMsg(int fail, String msg){
		if(fail != SUCCESS && fail != FAIL)
			throw new IllegalArgumentException();
		
		this.fail = fail;
		this.msg = msg;
	}
	
	public String toJson() {
		return JsonUtil.toJsonWithExposeAnnotation(this);
	}
	
	public String toDESJson() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
