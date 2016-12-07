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


    @Override
    public boolean isFocused() {
        return true;
    }

    @Override
    public void setEllipsize(TextUtils.TruncateAt where) {
        where = TextUtils.TruncateAt.MARQUEE;
        super.setEllipsize(where);
    }

}
