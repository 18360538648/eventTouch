package com.lsw.eventtouch;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Luosiwei on 2017/9/22.
 */

public class MyView extends View {
//    public MyView(Context context) {
//        super(context);
//    }

    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

//    public MyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
//        super(context, attrs, defStyleAttr);
//    }

    /**
     * 1. 触摸最先执行事件
     *
     * @param ev
     * @return
     */
    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.i("lsw", "dispatchTouchEvent--MyView ");
        return super.dispatchTouchEvent(ev);
    }

    /**
     * 2.触摸事件
     *
     * @param event
     * @return
     */
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.i("lsw", "onTouchEvent--MyView ");
        return super.onTouchEvent(event);
    }


}
