package com.study.keith.imageviewcliptest;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;



public class Book extends View {
    Context mContext;
    Path mPath;
    Paint mPaint;

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public Book(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    public Book(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public Book(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public Book(Context context) {
        super(context);
        init();
    }


    private void init () {
        mPaint = new Paint();
        mPaint.setAntiAlias(true);
        mPaint.setStrokeWidth(6);
        mPaint.setTextAlign(Paint.Align.RIGHT);
        mPath = new Path();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawColor(Color.GRAY);
        //canvas.save();
        canvas.translate(30, 10);
        drawScene(canvas);
    }

    private void drawScene (Canvas canvas) {
        canvas.clipRect(0, 0, 100, 100);
        canvas.drawColor(Color.WHITE);
        mPaint.setColor(Color.RED);
        canvas.drawLine(0, 0, 100, 100, mPaint);
        mPaint.setColor(Color.GREEN);
        canvas.drawCircle(30, 70, 30, mPaint);
        mPaint.setColor(Color.BLUE);
    }
}
