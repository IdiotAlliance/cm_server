package com.dt.cloudmsg.server.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonUtil {
	
	private static Gson gson = new Gson();
	private static GsonBuilder builder = new GsonBuilder();
	private static Gson exposeGson = builder.excludeFieldsWithoutExposeAnnotation().create();
	
	public static String toJson(Object o){
		return gson.toJson(o);
	}

	public static String toJsonWithExposeAnnotation(Object o){
		return exposeGson.toJson(o);
	}
	
	public static <T> T fromJson(String json, Class<T> c){
		return gson.fromJson(json, c);
	}
}
