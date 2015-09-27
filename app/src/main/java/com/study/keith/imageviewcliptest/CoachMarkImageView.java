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
import android.widget.ImageView;

import java.util.List;

/**
 * Created by Keith on 9/27/15.
 */
public class CoachMarkImageView extends ImageView {

    private Paint mPaint;
    private Path mPath;



    private void init () {
        mPaint = new Paint();
        mPaint.setAntiAlias(true);
        mPaint.setStrokeWidth(6);
        mPaint.setTextAlign(Paint.Align.RIGHT);
        mPath = new Path();
    }
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public CoachMarkImageView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes
            ) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    public CoachMarkImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public CoachMarkImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CoachMarkImageView(Context context) {
        super(context);
        init();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        //canvas.drawColor(Color.BLACK);
        //canvas.save();
        //canvas.translate(30, 10);
        drawScene(canvas);

        super.onDraw(canvas);
    }

    private void drawScene (Canvas canvas) {
        Path path = new Path();
        path.addCircle(100, 100, 80, Path.Direction.CCW);
        canvas.clipPath(path, Region.Op.DIFFERENCE);
    }
}
