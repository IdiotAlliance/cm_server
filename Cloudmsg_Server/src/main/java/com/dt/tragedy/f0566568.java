package com.dt.tragedy;

import java.io.IOException;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.methods.PostMethod;

import com.dt.cloudmsg.entity.ReturnMsg;

public class MessageSender {

	private static final String SEND_URL = "https://android.googleapis.com/gcm/send";
	private static final String CONTENT_TYPE = "content-type";
	private static final String AUTHORIZATION = "Authorization";
	private static final String MIME_JSON = "application/json";
	private static final String API_KEY = "key=AIzaSyBAgfUQ79s88HTIHgQrw363CY70CsD_AN4";
	private static final HttpClient hc  = new HttpClient();
	
	@SuppressWarnings("deprecation")
	public static final ReturnMsg send(String[] regIDs, String data){
		PostMethod hm = new PostMethod(SEND_URL);
		hm.addRequestHeader(CONTENT_TYPE, MIME_JSON);
		hm.addRequestHeader(AUTHORIZATION, API_KEY);
		
		GCMMessage msg = new GCMMessage();
		msg.setRegistration_ids(regIDs);
		msg.setData(data);
		hm.setRequestBody(msg.toJson());
		try {
			hc.executeMethod(hm);
		} catch (HttpException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public static final ReturnMsg send(String[] regIDs, String data, String collapseKey){
		return null;
	}
	
	public static final ReturnMsg send(String[] regIDs, String data, String collapseKey, int ttl){
		return null;
	}
}
