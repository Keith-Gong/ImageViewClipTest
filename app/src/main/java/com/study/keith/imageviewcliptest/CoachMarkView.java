package com.study.keith.imageviewcliptest;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Region;
import android.os.Build;
import android.support.annotation.NonNull;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by Keith on 9/27/15.
 */
public class CoachMarkView extends ImageView {
    private float mX;
    private float mY;
    private float mR;
    public CoachMarkView(Context context) {
        super(context);
        System.out.println("Initialize");

    }

    public CoachMarkView(Context context, AttributeSet attrs) {
        super(context, attrs);
        System.out.println("Initialize");

    }

    public CoachMarkView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        System.out.println("Initialize");

    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public CoachMarkView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        System.out.println("Initialize");

    }

    private void createHollow(Canvas canvas, ISetHollow createCallBack) {
        float arr[] = createCallBack.createHollow();

        Path path = new Path();

        path.addCircle(arr[0], arr[1], arr[2], Path.Direction.CW);

        canvas.clipPath(path, Region.Op.DIFFERENCE);
        //canvas.drawPath(path, paint);
    }

    @Override
    protected void onDraw(@NonNull Canvas canvas) {
        System.out.println("onDraw");
        createHollow(canvas, createCallBack);
        //createCallBack.createHollow();
        super.onDraw(canvas);
    }

    interface ISetHollow {
        float[] createHollow ();
    }

    ISetHollow createCallBack ;
    public void setHollowCallback (ISetHollow callback) {
        this.createCallBack = callback;
    }
}
