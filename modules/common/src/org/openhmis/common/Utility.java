package org.openhmis.common;

public class Utility {
	public static <T> T as(Class<T> cls, Object o){
		if(cls.isInstance(o)){
			return cls.cast(o);
		}
		return null;
	}

	public static boolean isNullOrEmpty(String s) {
		return s == null || s.trim().equals("");
	}
}