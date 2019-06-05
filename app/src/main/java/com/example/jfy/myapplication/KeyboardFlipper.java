package com.example.jfy.myapplication;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ViewFlipper;

public class KeyboardFlipper extends ViewFlipper {
    static Animation e;
    static Animation f;
    static Animation g;
    static Animation h;
    static Animation i;
    static Animation j;
    static Animation k;
    static Animation l;

    static double m = -1.0D;
    static double n = -1.0D;
    static double o = -1.0D;
    static double p = -1.0D;
    static long q = 0L;
    static boolean r = false;
    Context a;
    int b = 0;
    int c;
    boolean d;
    public KeyboardFlipper(Context paramContext) {
        super(paramContext);
        this.a = paramContext;
        a(); }

    public KeyboardFlipper(Context paramContext, AttributeSet paramAttributeSet) {
        super(paramContext, paramAttributeSet);
        this.a = paramContext;
        a(paramAttributeSet);
        a(); }

    private void SlideLeft() {
        Log.i("Flipper", "Slide Left");
        setInAnimation(g);
        setOutAnimation(h);
        showNext();
        this.c++;
        if (this.c >= this.b)
            this.c = 0;
    }

    private void SliderRight() {
        Log.i("Flipper", "Slide Right");
        setInAnimation(e);
        setOutAnimation(f);
        showPrevious();
        this.c--;
        if (this.c < 0)
            this.c = this.b - 1;
    }

    private void SlideUp() {
        Log.i("Flipper", "Slide Up");
        setInAnimation(i);
        setOutAnimation(j);
        showNext();
        this.c++;
        if (this.c >= this.b)
            this.c = 0;
    }

    private void SlideDown() {
        Log.i("Flipper", "Slide Down");
        setInAnimation(k);
        setOutAnimation(l);
        showPrevious();
        this.c--;
        if (this.c < 0)
            this.c = this.b - 1;
    }

    public void a() {
//        g = AnimationUtils.loadAnimation(this.a, 2131034124);      // 20190525
//        h = AnimationUtils.loadAnimation(this.a, 2131034125);
//        e = AnimationUtils.loadAnimation(this.a, 2131034126);
//        f = AnimationUtils.loadAnimation(this.a, 2131034127);
//        i = AnimationUtils.loadAnimation(this.a, 2131034128);
//        j = AnimationUtils.loadAnimation(this.a, 2131034129);
//        k = AnimationUtils.loadAnimation(this.a, 2131034122);
//        l = AnimationUtils.loadAnimation(this.a, 2131034123);
        this.b = getChildCount();
        this.c = 0;
    }

    public void a(AttributeSet paramAttributeSet) {
        boolean bool = true;
//        TypedArray typedArray = getContext().obtainStyledAttributes(paramAttributeSet, Complex.keyboardFlipperAttr); //20190525
//        if (typedArray.getInt(0, 0) != 1)
//            bool = false;
        this.d = bool;
//        typedArray.recycle();
    }

//    public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent) {
//
//
//    }
}

