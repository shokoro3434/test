package com.denko.util;

public final class RecallUtils {
	public static final String toJson(String jsonp){
		final String prefix = "loaded(";
		final String suffix = ")";
		return jsonp.substring(0+prefix.length(), jsonp.length()-suffix.length());
	}
}
