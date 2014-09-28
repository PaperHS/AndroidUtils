package com.hs.utils;

import android.util.Log;

/**
 * Log统一管理类
 */
public class LogUtil
{
	public static boolean isDebug = true;
	private static final String TAG = "hshs";
	
	// 下面四个是默认tag的函数
	public static void i(String msg) {
		if (isDebug)
			Log.i(TAG, msg);
	}

	public static void d(String msg) {
		if (isDebug)
			Log.d(TAG, msg);
	}

	public static void e(String msg) {
		if (isDebug)
			Log.e(TAG, msg);
	}

	public static void v(String msg) {
		if (isDebug)
			Log.v(TAG, msg);
	}
	
	//下面是传入类名打印log
	public static void i(Class<?> _class,String msg){
		if (isDebug)
			Log.i(_class.getName(), msg);
	}
	
	public static void d(Class<?> _class,String msg){
		if (isDebug)
			Log.i(_class.getName(), msg);
	}
	
	public static void e(Class<?> _class,String msg){
		if (isDebug)
			Log.i(_class.getName(), msg);
	}
	
	public static void v(Class<?> _class,String msg){
		if (isDebug)
			Log.i(_class.getName(), msg);
	}
	
	// 下面是传入自定义tag的函数
	public static void i(String tag, String msg) {
		if (isDebug)
			Log.i(tag, msg);
	}

	public static void d(String tag, String msg) {
		if (isDebug)
			Log.i(tag, msg);
	}

	public static void e(String tag, String msg) {
		if (isDebug)
			Log.i(tag, msg);
	}

	public static void v(String tag, String msg) {
		if (isDebug)
			Log.i(tag, msg);
	}
}