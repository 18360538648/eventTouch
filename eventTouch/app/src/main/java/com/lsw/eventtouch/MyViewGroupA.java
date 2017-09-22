package com.lsw.eventtouch;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/**
 * Created by Luosiwei on 2017/9/22.
 */

public class MyViewGroupA extends LinearLayout {
    public MyViewGroupA(Context context) {
        super(context);
    }

    public MyViewGroupA(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyViewGroupA(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    /**
     * 1. 触摸最先执行事件
     *
     * @param ev
     * @return
     */
    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.i("lsw", "dispatchTouchEvent--MyViewGroupA ");
        return super.dispatchTouchEvent(ev);
    }

    /**
     * 2. 事件拦截
     *
     * @param ev
     * @return
     */
    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.i("lsw", "onInterceptTouchEvent--MyViewGroupA ");
        return super.onInterceptTouchEvent(ev);
    }

    /**
     * 3.触摸事件
     *
     * @param event
     * @return
     */
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.i("lsw", "onTouchEvent--MyViewGroupA ");
        return super.onTouchEvent(event);
    }


}
