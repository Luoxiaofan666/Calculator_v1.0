package com.example.jfy.myapplication;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

public class SlowScrollView extends ScrollView {
    public SlowScrollView(Context paramContext) { super(paramContext); }

    public SlowScrollView(Context paramContext, AttributeSet paramAttributeSet) { super(paramContext, paramAttributeSet); }

    public SlowScrollView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) { super(paramContext, paramAttributeSet, paramInt); }

    public void fling(int paramInt) {
        int i = paramInt / 1000;
        if (paramInt > 0) {
            paramInt = 1;
        } else {
            paramInt = -1;
        }
        super.fling(paramInt + i);
    }
}
