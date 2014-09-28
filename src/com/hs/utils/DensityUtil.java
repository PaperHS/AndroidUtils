package com.hs.utils;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.DisplayMetrics;

/**
 * 分辨率转换类
 * 
 * */
public class DensityUtil {

	/**
	 * Get the width of current screen.
	 * 
	 * @param  contex the contex
	 * @return the width
	 */
	public static int getScreenWidth(Context contex) {
		DisplayMetrics dm = contex.getResources().getDisplayMetrics();
		return dm.widthPixels;
	}
	
	/**
	 * Get the height of current screen.
	 * 
	 * @param  contex the context
	 * @return the height
	 */
	public static int getScreenHeight(Context contex) {
		DisplayMetrics dm = contex.getResources().getDisplayMetrics();
		return dm.heightPixels;
	}
	
	/**
	 * Get the height of status bar.
	 * 
	 * @param activity
	 * @return
	 */
	public static int getStatusBarHeight(Activity activity) {
		Rect frame = new Rect();
		activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(frame);
		int statusBarHeight = frame.top;
		
		return statusBarHeight;
	}

	/**
	 * 根据手机的分辨率从 dp 的单位 转成为 px(像素)
	 */
	public static int dip2px(Context context, float dpValue) {
		final float scale = context.getResources().getDisplayMetrics().density;
		return (int) (dpValue * scale + 0.5f);
	}

	/**
	 * 根据手机的分辨率从 px(像素) 的单位 转成为 dp
	 */
	public static int px2dip(Context context, float pxValue) {
		final float scale = context.getResources().getDisplayMetrics().density;
		return (int) (pxValue / scale + 0.5f);
	}
}