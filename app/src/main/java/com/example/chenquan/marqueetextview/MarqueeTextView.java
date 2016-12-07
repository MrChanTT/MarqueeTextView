package com.example.chenquan.marqueetextview;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by chenquan on 2016/12/7.
 */

public class MarqueeTextView extends TextView {


    public MarqueeTextView(Context context) {
        super(context);
    }

    public MarqueeTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MarqueeTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    /**
     * 无需获取焦点就滚动显示
     * */
    @Override
    public boolean isFocused() {
        return true;
    }

    /**
     * 设置省略号的位置
     * **/
    @Override
    public void setEllipsize(TextUtils.TruncateAt where) {
        where = TextUtils.TruncateAt.MARQUEE;//跑马灯
//        TextUtils.TruncateAt.END;
//        TextUtils.TruncateAt.START;
//        TextUtils.TruncateAt.MIDDLE;
        super.setEllipsize(where);
    }

}
